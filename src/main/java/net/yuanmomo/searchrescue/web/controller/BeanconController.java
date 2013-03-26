package net.yuanmomo.searchrescue.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import jxl.Sheet;
import jxl.Workbook;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.yuanmomo.searchrescue.web.bean.BeaconAndFile;
import net.yuanmomo.searchrescue.web.bean.BeaconInfo;
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
		JSONObject result = new JSONObject();
		if (user == null || user.getUserStyle() > 2) {
			// 用户权限不为管理员或者信标管理员
			result.put("error", "权限不足，添加信标错误！！");
			request.setAttribute("json", result.toString());
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
				} else {
					faild++;
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
			result.put("error", "");
			result.put("msg", sb.toString());
			request.setAttribute("json", result.toString());
			return "json";
		}
	}

	private boolean addBeaconNo(UserInfo user, StringBuilder sb,
			String beaconNo, String index) {
		boolean isExist = this.beaconBusiness.isBeaconNoExist(beaconNo);
		if (isExist) {
			sb.append("该信标号 " + beaconNo + " 已经存在数据库，添加失败").append("<br />");
			return false;
		} else {
			boolean flag = this.beaconBusiness.insert(beaconNo, user);
			if (!flag) {
				sb.append("序号" + index + ",该信标号 " + beaconNo + " 添加失败").append(
						"<br />");
				return false;
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

	// 默认跳至信标添加页面
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

	// 批量删除信标
	@RequestMapping(params = "option=deleteBeaconNo")
	public String deleteBeaconNo(
			@RequestParam("beaconNoIds") String beaconNoIds,
			HttpServletRequest request, ModelMap modelMap) throws Exception {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		if (user.getUserStyle() < 3) {
			// 系统管理员和信标管理员
			if(beaconNoIds!=null && !"".equals(beaconNoIds) && beaconNoIds.matches("[\\d,]*")){
				this.beaconBusiness.deleteBeaconNos(beaconNoIds, user);
				JSONArray array = new JSONArray();
				JSONObject obj = new JSONObject();
				obj.put("message", "信标删除成功");
				array.add(obj);
				modelMap.addAttribute("json", array.toString());
			}else{
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
