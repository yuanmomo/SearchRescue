package net.yuanmomo.searchrescue.web.util;

import javax.annotation.Resource;

import net.yuanmomo.searchrescue.web.business.TestBusiness;

public class BasicController {
	//将spring 配置文件中的bean 通过setter注入进来
	@Resource(name="testBusiness")
	protected TestBusiness testBusiness=null;
	public void setTestBusiness(TestBusiness testBusiness) {
		this.testBusiness = testBusiness;
	}
}
