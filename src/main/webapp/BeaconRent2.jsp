<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html;charset=utf-8"
	pageEncoding="utf-8"%>
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
						<li class="active"><a href="#">首页</a></li>
						<li><a href="#about">关于</a></li>
						<li><a href="#contact">联系</a></li>
					</ul>
					<p class="navbar-text pull-right">
						<span style="font-size: 15px;">你好，xxx</span>&nbsp;&nbsp;<a
							href="#">退出</a>
					</p>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span2">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">信标租赁管理</li>
						<li class="active"><a href="#">新增租赁</a></li>
						<li><a href="#">租赁归还</a></li>
						<li class="nav-header">信标购买管理</li>
						<li><a href="#">新建购买</a></li>
						<li><a href="#">购买查询</a></li>
						<li class="nav-header">信标管理</li>
						<li><a href="#">新增信标</a></li>
						<li><a href="#">信标报废</a></li>
						<li class="nav-header">账号管理</li>
						<li><a href="#">修改密码</a></li>
					</ul>
				</div>
				<!--/.well -->
			</div>
			<!--/span-->
			<div class="span10">
				<div class="hero-unit">
					<h1 align="center">新增租赁</h1>
					<br />
					<form class="form-horizontal">
						<fieldset>
							<table>
								<tr>
									<td colspan="2">
										<div class="control-group">
											<label class="control-label" for="input01"
												style="font-weight: bold; font-size: 25px;">用户信息</label>
										</div>
										<div class="control-group">
											<label class="control-label" for="select01">身份类型</label>
											<div class="controls">
												<select id="select01">
													<option>请选择</option>
													<option>身份证用户</option>
													<option selected="selected">护照用户</option>
												</select>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">姓名</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">国籍</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">护照号</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">有效期限</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">签发日期</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="textarea">照片</label>
											<div class="controls">
												<img alt="照片" src="img/head.bmp">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01"
												style="font-weight: bold; font-size: 25px;">信标信息：</label>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">信标编号</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">租赁开始日期</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
									</td>
									<td colspan="2">
										<div class="control-group">
											<label class="control-label" for="input01">&nbsp;</label>
											<div class="controls">
												<input type="hidden" class="input-xlarge" id="input01">
											</div>
										</div>
										<br /><br />
										<div class="control-group">
											<label class="control-label" for="select01">性别</label>
											<div class="controls">
												<select id="select01">
													<option>请选择</option>
													<option>男</option>
													<option>女</option>
												</select>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">出生日期</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">发证国或组织</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="fileInput">&nbsp;</label>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">签名</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="textarea">备注</label>
											<div class="controls">
												<textarea class="input-xlarge" id="textarea" rows="3"></textarea>
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">&nbsp;</label>
											<div class="controls">
												<input type="hidden" class="input-xlarge" id="input01">
											</div>
										</div>
									</td>
								</tr>
								<tr>
									<td>&nbsp;</td>
									<td colspan="2"><div class="form-actions">
											<button type="submit" class="btn btn-primary">保存</button>
											<button class="btn">取消</button>
										</div></td>
									<td>&nbsp;</td>
								</tr>
							</table>
						</fieldset>
					</form>
				</div>
			</div>
			<!--/span-->
		</div>
		<!--/row-->

		<hr>

		<footer>
			<p>&copy; xxxxxxxxx设计2012</p>
		</footer>

	</div>
	<!--/.fluid-container-->
</body>
<!-- Placed at the end of the document so the pages load faster -->
<!-- <script type="text/javascript" src="js/jquery/jquery-ui-1.9.2.custom.js"></script> -->
<script type="text/javascript" src="js/jquery/jquery-1.8.3.js"></script>
<script src="js/jquery/jquery.cookie.js" type="text/javascript"></script>
<script src="js/external/application.js" type="text/javascript"></script>
<script src="js/external/bootstrap-alert.js" type="text/javascript"></script>
<script src="js/external/bootstrap-modal.js" type="text/javascript"></script>
<script src="js/external/bootstrap-transition.js" type="text/javascript"></script>
<!-- Optional, bootstrap javascript library -->
<script type="text/javascript" src="js/external/bootstrap.js"></script>

<!-- bsie js patch, it will only execute in IE6 -->
<!--[if lte IE 6]>
  <script type="text/javascript" src="js/external/bootstrap-ie.js"></script>
  <![endif]-->
  <script type="text/javascript">
  $.bootstrapIE6(el)
  </script>
</html>