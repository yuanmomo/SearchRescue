<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="hero-unit">
	<h1 align="center">新增租赁</h1>
	<br />
	<form id="beaconRentAdminForm" class="form-horizontal" action=""
		method="post">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">用户信息</label>
			</div>
			<div class="control-group">
				<label class="control-label" for="select01">身份类型</label>
				<div class="controls">
					<select id="cerStyle" onchange="loadBeaconRentBodyByCerStyle()"
						name="cerStyle">
						<option value="0" selected="selected">请选择</option>
						<option value="1">身份证用户</option>
						<option value="2">护照用户</option>
					</select>
				</div>
			</div>
			<!-- //添加 管理员 操作 购买的body页面 -->
			<div id="beaconRentBody"></div>
		</fieldset>
	</form>
</div>
