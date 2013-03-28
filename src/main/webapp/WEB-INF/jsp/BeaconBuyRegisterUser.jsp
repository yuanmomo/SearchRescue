<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="hero-unit">
	<h1 align="center">新增购买--注册用户</h1>
	<br />
	<form id="beaconFileForm" class="form-horizontal" method="POST"
		enctype="multipart/form-data">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">信标信息：</label>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">信标编号</label>
				<div class="controls">
					<input type="hidden" class="input-xlarge"
						id="buyBeaconId" name="buyBeaconId" />
					<input type="text" class="input-xlarge" id="buyBeaconNo"
						name="buyBeaconNo" readonly="readonly"/>
					<button type="button" class="btn btn-primary"
						onclick="getOneRandomBeacon();">取得信标</button>
					
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">购买日期</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="buyBeaconDate">
				</div>
			</div>
			<div class="form-actions" style="margin-left: 200px;">
				<button type="button" class="btn btn-primary"
					onclick="doBuyBeacon();">购买</button>
				<button class="btn" type="button" onclick="removeRightBody()">取消</button>
			</div>
		</fieldset>
	</form>
</div>
