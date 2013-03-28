package net.yuanmomo.searchrescue.web.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilterController implements Filter {
	private List<String> notFilter;
	
	public void destroy() {

	}
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		Object user = ((((HttpServletRequest) arg0).getSession())
				.getAttribute("user"));
		String option=((HttpServletRequest)arg0).getParameter("option");
		if (user != null || notFilter.contains(option)) {
			arg2.doFilter(arg0, arg1);
		} else {
			// 还未登录，跳转至登录页面
			((HttpServletResponse)arg1).sendRedirect("user.do?option=login");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		notFilter=new ArrayList<String>();
		notFilter.add("doLogin");
		notFilter.add("login");
		notFilter.add("register");
		notFilter.add("loadCerStyleBody");
		notFilter.add("doRegister2");
		notFilter.add("doRegister1");
		notFilter.add("checkUserName");
	}
}
