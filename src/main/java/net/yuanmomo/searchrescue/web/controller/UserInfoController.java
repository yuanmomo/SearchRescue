package net.yuanmomo.searchrescue.web.controller;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.yuanmomo.searchrescue.web.util.BasicController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user.do") 
public class UserInfoController extends BasicController{
	
	//默认跳至登陆页面
	@RequestMapping
	public String loginAsDefault(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Login";
	}
	//跳至登陆页面
	@RequestMapping(params="option=login")
	public String login(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Login";
	}
	
	//跳转至注册页面
	@RequestMapping(params="option=register")
	public String register(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		return "Register";
	}
	//跳转至注册页面
		@RequestMapping(params="option=loadCerStyleBody")
		public String loadCerStyleBody(HttpServletRequest request, ModelMap modelMap)
				throws Exception {
			String cerStyleValue=request.getParameter("cerStyleValue");
			JSONArray array=new JSONArray();
			if(cerStyleValue==null || "".equals(cerStyleValue.trim())){
				JSONObject result=new JSONObject();
				result.put("error", "注册身份类型不能为空");
				array.add(result);
				modelMap.addAttribute("json", array.toString());
				return "json";
			}
			int cerStyleNumber=Integer.parseInt(cerStyleValue);
			if(cerStyleNumber==1){
				return "RegisterBodyWithID";
			}else if(cerStyleNumber==2){
				return "RegisterBodyWithPassport";
			}else if(cerStyleNumber==0){
				return "json";
			}
			JSONObject result=new JSONObject();
			result.put("error", "注册身份类型错误！！");
			array.add(result);
			modelMap.addAttribute("json", array.toString());
			return "json";
		}
}
