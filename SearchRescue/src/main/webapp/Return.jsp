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
<link rel="stylesheet" type="text/css" href="css/bootstrap-ie6.css">
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
						<li><a href="#">新增租赁</a></li>
						<li class="active"><a href="#">租赁归还</a></li>
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
					<h1 align="center">租赁归还</h1>
					<br />
					<form class="form-horizontal">
						<fieldset>
							<table>
								<tr>
									<td colspan="2">
										<div class="control-group">
											<label class="control-label" for="input01">姓名</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">身份证号</label>
											<div class="controls">
												<input type="text" class="input-xlarge" id="input01">
											</div>
										</div>
										<div class="control-group">
											<label class="control-label" for="input01">&nbsp;</label>
										</div>
									</td>
									<td colspan="2">
										<div class="control-group">
											<label class="control-label" for="input01">信标编号</label>
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
											<label class="control-label" for="input01"><button type="submit"
											class="btn btn-primary">查询</button></label>
										</div>
									</td>
								</tr>
								<tr>
									<td colspan="4">
										<table
											class="table table-striped table-bordered"
											style="font-size: 13px;">
											<thead>
												<tr>
													<th width="5%">&nbsp;</th>
													<th width="5%">序号</th>
													<th width="15%">姓名</th>
													<th width="25%">身份证号/护照号</th>
													<th width="10%">信标号</th>
													<th width="20%">租赁开始日期</th>
													<th width="20%">归还日期</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td><input type="checkbox" id="optionsCheckbox"
														value="option1"></td>
													<td>1</td>
													<td>袁鸿彬</td>
													<td>51072219890628xxxx</td>
													<td>111111111</td>
													<td>2012-09-09</td>
													<td>2013-10-10</td>
												</tr>
												<tr>
													<td><input type="checkbox" id="optionsCheckbox"
														value="option1"></td>
													<td>1</td>
													<td>袁鸿彬</td>
													<td>51072219890628xxxx</td>
													<td>111111111</td>
													<td>2012-09-09</td>
													<td>2013-10-10</td>
												</tr>
												<tr>
													<td><input type="checkbox" id="optionsCheckbox"
														value="option1"></td>
													<td>1</td>
													<td>袁鸿彬</td>
													<td>51072219890628xxxx</td>
													<td>111111111</td>
													<td>2012-09-09</td>
													<td>2013-10-10</td>
												</tr>
												<tr>
													<td><input type="checkbox" id="optionsCheckbox"
														value="option1"></td>
													<td>1</td>
													<td>袁鸿彬</td>
													<td>51072219890628xxxx</td>
													<td>111111111</td>
													<td>2012-09-09</td>
													<td>2013-10-10</td>
												</tr>
											</tbody>
										</table>
									</td>
								</tr>

								<tr>
									<td>&nbsp;</td>
									<td colspan="2"><div class="form-actions">
											<button type="submit" class="btn btn-primary">归还</button>
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