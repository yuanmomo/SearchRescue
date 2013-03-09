package net.yuanmomo.searchrescue.web.util;

import javax.annotation.Resource;

import net.yuanmomo.searchrescue.web.business.UserInfoBusiness;

public class BasicController {
	//将spring 配置文件中的bean 通过setter注入进来
	@Resource(name="userInfoBusiness")
	protected UserInfoBusiness userInfoBusiness=null;

	public UserInfoBusiness getUserInfoBusiness() {
		return userInfoBusiness;
	}

	public void setUserInfoBusiness(UserInfoBusiness userInfoBusiness) {
		this.userInfoBusiness = userInfoBusiness;
	}
}
