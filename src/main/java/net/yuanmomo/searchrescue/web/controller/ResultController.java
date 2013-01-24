package net.yuanmomo.searchrescue.web.controller;

import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.searchrescue.web.util.BasicController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result.do") 
public class ResultController extends BasicController{
	
	@RequestMapping
	public String viewUser(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		//TestTable test=this.testBusiness.getOneTest(5);
//		testBusiness.updateOneTest(5);
		return "result";
	}
	
	@RequestMapping(params="c=read")
	public String read(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		//TestTable test=this.testBusiness.getOneTest(5);
//		this.testBusiness.updateOneTest2(5);
		return "result";
	}
}
