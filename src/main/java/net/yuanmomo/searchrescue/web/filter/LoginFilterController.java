package net.yuanmomo.searchrescue.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.searchrescue.web.bean.UserInfo;

public class LoginFilterController implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		UserInfo user = (UserInfo) ((((HttpServletRequest) arg0).getSession())
				.getAttribute("user"));
		if (user != null) {
			arg2.doFilter(arg0, arg1);
		} else {
			// 还未登录，跳转至登录页面
			arg0.getRequestDispatcher("/user.do").forward(arg0, arg1);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}
