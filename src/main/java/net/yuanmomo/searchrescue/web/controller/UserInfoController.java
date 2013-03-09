package net.yuanmomo.searchrescue.web.controller;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.searchrescue.web.bean.UserInfo;
import net.yuanmomo.searchrescue.web.util.BasicController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result.do") 
public class UserInfoController extends BasicController{
	@RequestMapping
	public String viewUser(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		UserInfo user=this.userInfoBusiness.selectById(2);
		System.err.println(user.getName());
		return "result";
	}
}
