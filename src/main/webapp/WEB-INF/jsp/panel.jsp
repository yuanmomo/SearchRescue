<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="panel_head.jsp"%>

<!-- Right Side/Main Content Start -->

<%
	String panelBody = (String) request.getAttribute("module") + ".jsp";
	pageContext.include(panelBody);
%>

<%@include file="panel_footer.jsp"%>