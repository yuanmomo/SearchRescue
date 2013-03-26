<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜救系统</title>
<!-- Le styles -->
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/docs.css" rel="stylesheet">
<link href="js/external/google-code-prettify/prettify.css"
	rel="stylesheet">
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
		  <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
<!-- Bootstrap css file v2.2.1 -->

<!-- bsie css patch -->
<!--[if lte IE 6]>
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-ie6.css">
	<![endif]-->
<!-- bsie additional css patch -->
<!--[if lte IE 6]>
  <link rel="stylesheet" type="text/css" href="css/ie.css">
 <![endif]-->
</head>
<body data-spy="scroll" data-target=".subnav" data-offset="50"
	style="overFlow-x: hidden; overFlow-y: scroll;">
	<div class="navbar navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a>
				<div class="nav-collapse">
					<ul class="nav">
						<li class="active"><a href="/Login.do">首页</a></li>
						<li><a href="#about">关于</a></li>
						<li><a href="#contact">联系</a></li>
					</ul>
					<p class="navbar-text pull-right">
						<span style="font-size: 15px;">你好，${user.realName}</span>&nbsp;&nbsp;<a
							href="user.do?option=exit">退出</a>
					</p>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>
	<div class="container-fluid">
	<div class="row-fluid">
		<div id="messageDialog" class="modal hide fade" style="display: none;">
				<div class="modal-header">
					<a class="close" data-dismiss="modal">×</a>
					<h3>信息：</h3>
				</div>
				<div class="modal-body">
					<p id="message"></p>
				</div>
				<div class="modal-footer">
					<a href="#" class="btn" data-dismiss="modal">确定</a>
				</div>
			</div>
		<!-- 加载左边导航栏，根据权限 -->
<%
	String relativeUrlPath = "panel_left.jsp";
	pageContext.include(relativeUrlPath);
%>
