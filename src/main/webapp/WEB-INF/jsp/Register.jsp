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
<link href="css/jquery_ui/jquery.ui.all.css" rel="stylesheet">
<link href="js/external/google-code-prettify/prettify.css"
	rel="stylesheet">
<style type="text/css">

/* //jquery validate error style */
input.error { border: 1px solid red; }
label.error {
  padding-left: 10px;

  padding-bottom: 2px;

  font-weight: bold;

  color: #EA5200;
}
label.checked {
  background:url("./demo/images/checked.gif") no-repeat 0px 0px;
}
</style>
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
			<div class="span2"></div>
			<div class="span8">
				<div class="hero-unit">
					<h1 align="center">用户注册</h1>
					<br />
					<form id="registerForm" class="form-horizontal"
						action="user.do?option=doRegister" method="post">
						<fieldset>
							<div class="control-group">
								<label class="control-label" for="input01"
									style="font-weight: bold; font-size: 25px;">用户信息:</label>
							</div>
							<div class="control-group">
								<label class="control-label" for="select01">身份类型</label>
								<div class="controls">
									<select id="cerStyle" onchange="loadCerStyle()" name="cerStyle">
										<option value="0" selected="selected">请选择</option>
										<option value="1">身份证用户</option>
										<option value="2">护照用户</option>
									</select>
								</div>
							</div>
							<!-- //添加用户注册的body页面 -->
							<div id="cerStyleBody">
									
							</div>
						</fieldset>
					</form>
				</div>
			</div>
			<div class="span2"></div>
		</div>
		<!--/row-->
		<hr>
		<footer>
			<p style="margin-left: 200px">&copy; XXXXXX设计2013</p>
		</footer>
	</div>
	<!--/.fluid-container-->
</body>
<!-- Placed at the end of the document so the pages load faster -->
<!-- <script type="text/javascript" src="js/jquery/jquery-ui-1.9.2.custom.js"></script> -->
<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery/jquery-ui-1.9.2.custom.min.js"></script>
<script type="text/javascript" src="js/jquery/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery/jquery.ui.datepicker-zh-CN.js"></script>
<script type="text/javascript" src="js/jquery/jquery.ui.datepicker.js"></script>
<script type="text/javascript" src="js/jquery/jquery.cookie.js"></script>
<script type="text/javascript" src="js/external/application.js"></script>
<script type="text/javascript" src="js/external/bootstrap-alert.js"></script>
<script type="text/javascript" src="js/external/bootstrap-modal.js"></script>
<script type="text/javascript" src="js/external/bootstrap-transition.js"></script>
<!-- Optional, bootstrap javascript library -->
<script type="text/javascript" src="js/external/bootstrap.js"></script>
<script type="text/javascript" src="js/register.js"></script>
<script type="text/javascript" src="js/global.js"></script>
<!-- bsie js patch, it will only execute in IE6 -->
<!--[if lte IE 6]>
  <script type="text/javascript" src="js/external/bootstrap-ie.js"></script>
  <![endif]-->
</html>