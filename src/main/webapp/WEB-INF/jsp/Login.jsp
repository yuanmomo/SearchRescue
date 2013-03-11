<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="css/bootstrap-responsive.css" rel="stylesheet">
<link href="css/docs.css" rel="stylesheet">
<link href="js/external/google-code-prettify/prettify.css"
	rel="stylesheet">
<title>搜救系统</title>
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
						<li class="active"><a href="user.do">首页</a></li>
						<li><a href="#about">关于</a></li>
						<li><a href="#contact">联系</a></li>
					</ul>
					<p class="navbar-text pull-right">
						<a href="user.do?option=register">注册</a>
					</p>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="row">
		<div class="span4">&nbsp;</div>
		<div class="span4">
			<form id="loginForm" class="form-horizontal"
				action="user.do?option=login" method="post">
				<fieldset>
					<legend
						style="margin-left: 200px; font-weight: bold; font-size: 28px;">搜救系统登录</legend>
					<div class="control-group">
						<label class="control-label" for="input01">用户名：</label>
						<div class="controls">
							<input id="username" name="username" type="text"
								class="input-xlarge" id="input01">
							<!-- <p class="help-block">*</p> -->
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="input01">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
						<div class="controls">
							<input id="password" name="password" type="password"
								class="input-xlarge" id="input01">
						</div>
					</div>
					<div class="form-actions" style="margin-left: 220px;">
						<button type="submit" onclick="login()" class="btn btn-primary">登录</button>
						<button type="reset" class="btn">取消</button>
					</div>
				</fieldset>
			</form>
		</div>
		<div class="span4">&nbsp;</div>
	</div>
</body>
<!-- Placed at the end of the document so the pages load faster -->
<!-- <script type="text/javascript" src="js/jquery/jquery-ui-1.9.2.custom.js"></script> -->
<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery/jquery.cookie.js"></script>
<script type="text/javascript" src="js/external/application.js"></script>
<script type="text/javascript" src="js/external/bootstrap-alert.js"></script>
<script type="text/javascript" src="js/external/bootstrap-modal.js"></script>
<script type="text/javascript" src="js/external/bootstrap-transition.js"></script>
<!-- Optional, bootstrap javascript library -->
<script type="text/javascript" src="js/external/bootstrap.js"></script>
<script type="text/javascript" src="js/login.js"></script>

<!-- bsie js patch, it will only execute in IE6 -->
<!--[if lte IE 6]>
  <script type="text/javascript" src="js/external/bootstrap-ie.js"></script>
  <![endif]-->
</html>