package net.yuanmomo.searchrescue.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.yuanmomo.searchrescue.web.bean.UserInfoID;
import net.yuanmomo.searchrescue.web.bean.UserInfoPassport;
import net.yuanmomo.searchrescue.web.util.BasicController;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user.do")
public class UserInfoController extends BasicController {

	// 默认跳至登陆页面
	@RequestMapping
	public String loginAsDefault(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Login";
	}

	// 跳至登陆页面
	@RequestMapping(params = "option=login")
	public String login(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Login";
	}

	// 跳转至注册页面
	@RequestMapping(params = "option=register")
	public String register(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Register";
	}

	// 用户注册是选择了是护照用户还是身份证用户
	@RequestMapping(params = "option=loadCerStyleBody")
	public String loadCerStyleBody(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		String cerStyleValue = request.getParameter("cerStyleValue");
		JSONArray array = new JSONArray();
		if (cerStyleValue == null || "".equals(cerStyleValue.trim())) {
			JSONObject result = new JSONObject();
			result.put("error", "注册身份类型不能为空");
			array.add(result);
			modelMap.addAttribute("json", array.toString());
			return "json";
		}
		int cerStyleNumber = Integer.parseInt(cerStyleValue);
		if (cerStyleNumber == 1) {
			return "RegisterBodyWithID";
		} else if (cerStyleNumber == 2) {
			return "RegisterBodyWithPassport";
		} else if (cerStyleNumber == 0) {
			return "json";
		}
		JSONObject result = new JSONObject();
		result.put("error", "注册身份类型错误！！");
		array.add(result);
		modelMap.addAttribute("json", array.toString());
		return "json";
	}

	//注册
	@RequestMapping(method = RequestMethod.POST,params = "option=doRegister1")
	public String doRegisterForCerStyle1(@ModelAttribute("userInfoID") UserInfoID userInfoId, 
		HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		//理论上要做数据验证，没时间做，暂时放置
		//最主要的是userName和CerNo 身份证号码，这两个验证，此处就当做都合法
		
		//取得IP地址
		userInfoId.setRegisterIp(request.getRemoteAddr());
		userInfoId.setRegisterTime(new Date());
		userInfoId.setLastLoginIp(request.getRemoteAddr());
		userInfoId.setLastLoginTime(new Date());
		int result = this.userInfoBusiness.doRegisterForCerStyle1(userInfoId);
		switch (result) {
		case 1:
			//用户名存在，注册失败，理论上就当做不会发生此种情况，故不处理
			break;
		case 100:
			//用户注册成功，将用户放进Session.
			request.getSession().setAttribute("user", userInfoId);
			request.setAttribute("module", "BeaconRent");
			if(userInfoId.getCerStyle()==1){
				request.setAttribute("rentBody", "ID");
			}else{
				request.setAttribute("rentBody", "Passport");
			}
			return "panel";
		default:
			return "Register";
		}
		return "Register";
	}
	@RequestMapping(method = RequestMethod.POST,params="option=doRegister2")
	public String doRegisterForCerStyle2(@ModelAttribute("UserInfoPassport") UserInfoPassport userInfoPassport, 
		HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		//理论上要做数据验证，没时间做，暂时放置
		//最主要的是userName和CerNo 身份证号码，这两个验证，此处就当做都合法
		
		//取得IP地址
		userInfoPassport.setRegisterIp(request.getRemoteAddr());
		userInfoPassport.setRegisterTime(new Date());
		userInfoPassport.setLastLoginIp(request.getRemoteAddr());
		userInfoPassport.setLastLoginTime(new Date());
		int result = this.userInfoBusiness.doRegisterForCerStyle2(userInfoPassport);
		//注册结果
		switch (result) {
		case 1:
			//用户名存在，注册失败，理论上就当做不会发生此种情况，故不处理
			break;
		case 100:
			//用户注册成功，将用户放进Session.
			request.getSession().setAttribute("user", userInfoPassport);
			request.setAttribute("module", "BeaconRent");
			if(userInfoPassport.getCerStyle()==1){
				request.setAttribute("rentBody", "ID");
			}else{
				request.setAttribute("rentBody", "Passport");
			}
			return "panel";
		default:
			return "Register";
		}
		return "Register";
	}
	
	//Spring MVC的属性自动装配中，日期类型转化
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, false));
    }
}
