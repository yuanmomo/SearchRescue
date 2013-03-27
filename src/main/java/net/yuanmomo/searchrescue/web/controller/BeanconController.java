package net.yuanmomo.searchrescue.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import jxl.Sheet;
import jxl.Workbook;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.yuanmomo.searchrescue.web.bean.BeaconAndFile;
import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
import net.yuanmomo.searchrescue.web.bean.BoughtBeacon;
import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.util.BasicController;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/beacon.do")
public class BeanconController extends BasicController {

	// 跳至信标添加页面
	@RequestMapping(params = "option=loadAddBeaconBody")
	public String loadAddBeaconBody(HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() < 3) {
			// 系统管理员和信标管理员
			return "AddBeacon";
		}
		return "json";
	}

	// 上传beacon文件，然后解析保存
	@RequestMapping(params = "option=saveFile")
	public String saveBeaconFile(
			@ModelAttribute("beaconAndFile") BeaconAndFile beaconAndFile,
			HttpServletRequest request, ModelMap modelMap) throws Exception {
		// 得到用户，验证权限
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		JSONArray array=new JSONArray();
		JSONObject result = new JSONObject();
		if (user == null || user.getUserStyle() > 2) {
			// 用户权限不为管理员或者信标管理员
			result.put("error", "权限不足，添加信标错误！！");
			array.add(result);
			request.setAttribute("json",array.toString());
			return "json";
		} else {
			// 返回的结果信息
			StringBuilder sb = new StringBuilder();
			int total = 0;
			int success = 0;
			int faild = 0;

			// 保存文本框中单独的一条信息
			String beaconNo = request.getParameter("beaconNo");
			if (beaconNo != null && !"".equals(beaconNo)) {
				total += 1;
				sb.append("处理第一个信标，用户在输入框中输入的信标<br />");
				boolean flag = this.addBeaconNo(user, sb, beaconNo, "0");
				if (flag) {
					success++;
					sb.append("输入框中信标添加成功<br />");
				} else {
					faild++;
					sb.append("输入框中信标添加失败<br />");
				}
			}
			// 上传文件，并保存信息
			MultipartFile file = beaconAndFile.getBeaconFile();
			if (file != null) {
				// 开始解析excel
				Workbook workbook = Workbook.getWorkbook(file.getInputStream());
				Sheet sheet = workbook.getSheet(0);
				total += (sheet.getRows() - 2);
				sb.append("<br />文档一共有" + (sheet.getRows() - 2)
						+ "个信标需要添加<br />");
				for (int i = 2; i < sheet.getRows(); i++) {
					String index = sheet.getCell(0, i).getContents();
					String beaNo = sheet.getCell(1, i).getContents();
					boolean flag = this.addBeaconNo(user, sb, beaNo, index);
					if (flag) {
						success++;
					} else {
						faild++;
					}
				}
				sb.append("<br />信标文件上传完成，一共处理" + total + "个，" + "<br />成功添加 "
						+ success + " 个<br />");
				sb.append("添加失败 " + faild + " 个<br />");
			}
			result.put("msg", sb.toString());
			array.add(result);
			request.setAttribute("json",array.toString());
			return "json";
		}
	}

	private boolean addBeaconNo(UserInfo user, StringBuilder sb,
			String beaconNo, String index) {
		boolean isExist = this.beaconBusiness.isBeaconNoExist(beaconNo);
		if (isExist) {
			sb.append("序号" + index + ",该信标号 " + beaconNo + " 已经存在数据库，添加失败").append("<br />");
			return false;
		} else {
			boolean flag = this.beaconBusiness.insert(beaconNo, user);
			if (!flag) {
				sb.append("序号" + index + ",该信标号 " + beaconNo + " 添加失败").append(
						"<br />");
				return false;
			}else{
				sb.append("序号" + index + ",信标号 " + beaconNo + " 添加成功").append(
						"<br />");
			}
		}
		return true;
	}

	// 默认跳至信标添加页面
	@RequestMapping(params = "option=loadRemoveBeaconBody")
	public String loadRemoveBeaconBody(HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() < 3) {
			// 系统管理员和信标管理员
			return "BeaconDump";
		}
		return "json";
	}

	// 根据所给信标好查询
	@RequestMapping(params = "option=getOneBeaconByBeaconNo")
	public String getOneBeaconByBeaconNo(
			@RequestParam("beaconNo") String beaconNo,
			HttpServletRequest request, ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() < 3) {
			// 系统管理员和信标管理员
			BeaconInfo beacon = this.beaconBusiness.getOneBeacon(beaconNo);
			if (beacon != null) {
				JSONArray array = new JSONArray();
				JSONObject obj = new JSONObject();
				obj.put("beaconNo", beacon.getBeaconNo());
				obj.put("id", beacon.getId() + "");
				array.add(obj);
				modelMap.addAttribute("json", array.toString());
			} else {
				modelMap.addAttribute("json", "{}");
			}
		}
		return "json";
	}

	// 根据所给信标好查询
	@RequestMapping(params = "option=getOneRandomBeacon")
	public String getOneRandomBeacon(HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		// 随机得到一个beacon
		BeaconInfo beacon = this.beaconBusiness.getOneRandomBeacon();
		if (beacon != null) {
			JSONArray array = new JSONArray();
			JSONObject obj = new JSONObject();
			obj.put("beaconNo", beacon.getBeaconNo());
			obj.put("id", beacon.getId() + "");
			array.add(obj);
			modelMap.addAttribute("json", array.toString());
		} else {
			modelMap.addAttribute("json", "{}");
		}
		return "json";
	}

	// 默认跳至信标购买页面
	@RequestMapping(params = "option=loadBeaconBuyBody")
	public String loadBeaconBuyBody(HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() == 1) {
			// 系统管理员添加购买
			return "BeaconRent";
		} else {
			// 注册用户添加购买
			return "BeaconBuyRegisterUser";
		}
	}

	// 默认跳至信标购买查询页面
	@RequestMapping(params = "option=loadBoughtQueryBody")
	public String loadBoughtQueryBody(HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() == 1) {
			return "BeaconBoughtQuery";
		}else{
			return "BeaconBoughtQueryByRegisterUser";
		}
	}
	// 默认跳至信标购买查询页面
	@RequestMapping(params = "option=queryBoughtBeacon")
	public String queryBoughtBeacon(
			@RequestParam(value="userName",required = false) String userName,
			@RequestParam(value="beaconNo",required=false) String beaconNo,
			@RequestParam(value="cerNo",required=false) String cerNo,
			@RequestParam(value="passportNo",required=false) String passportNo,
			HttpServletRequest request,
			ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() == 1) {
			List<BoughtBeacon> result=this.beaconBusiness.queryBoughtBeacon(userName,beaconNo,passportNo,cerNo);
			modelMap.addAttribute("json", JSONArray.fromObject(result).toString());
			return "json";
		}else{
			//注册用户，只查询自己所购买的信标
			List<BoughtBeacon> result=this.beaconBusiness.queryBoughtBeacon(user);
			modelMap.addAttribute("json", JSONArray.fromObject(result).toString());
			return "json";
		}
	}
	// 注册用户购买一个信标
	@RequestMapping(params = "option=doBuyBeacon")
	public String doBuyBeacon(
			@RequestParam("beaconId") long beaconId,
			@RequestParam("buyBeaconDate") Date buyBeaconDate,
			HttpServletRequest request, ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() == 3) {
			boolean flag=this.beaconBusiness.doBuyBeaconByRegisterUser(beaconId, user,buyBeaconDate);
			JSONArray array = new JSONArray();
			JSONObject obj = new JSONObject();
			if(flag){
				obj.put("message", "购买信标成功");
			}else{
				obj.put("error", "购买信标失败");
			}
			array.add(obj);
			modelMap.addAttribute("json", array.toString());
		}
		return "json";
	}

	// 批量删除信标
	@RequestMapping(params = "option=deleteBeaconNo")
	public String deleteBeaconNo(
			@RequestParam("beaconNoIds") String beaconNoIds,
			HttpServletRequest request, ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() < 3) {
			// 系统管理员和信标管理员
			if (beaconNoIds != null && !"".equals(beaconNoIds)
					&& beaconNoIds.matches("[\\d,]*")) {
				this.beaconBusiness.deleteBeaconNos(beaconNoIds, user);
				JSONArray array = new JSONArray();
				JSONObject obj = new JSONObject();
				obj.put("message", "信标删除成功");
				array.add(obj);
				modelMap.addAttribute("json", array.toString());
			} else {
				JSONArray array = new JSONArray();
				JSONObject obj = new JSONObject();
				obj.put("message", "数据有错，更新失败！！");
				array.add(obj);
				modelMap.addAttribute("json", array.toString());
			}
		}
		return "json";
	}

	// Spring MVC的属性自动装配中，日期类型转化
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
}
