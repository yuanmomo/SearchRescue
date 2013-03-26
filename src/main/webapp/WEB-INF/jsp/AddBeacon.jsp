<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style type="text/css">
.wrapper {
	width: 133px;
	margin: 0 auto;
}

div.button {
	height: 20px;
	width: 83px;
	background: url(../../../images/button.png) 0 0;
	font-size: 12px;
	color: #C7D92C;
	text-align: center;
	padding-top: 0px;
}

div.button.hover {
	background: url(../../../images/button.png) 0 56px;
	color: #95A226;
}
</style>
<div class="hero-unit">
	<h1 align="center">新增信标</h1>
	<br />
	<form id="beaconFileForm" class="form-horizontal"  method="POST" enctype="multipart/form-data">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">单个增加</label>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">信标号</label>
				<div class="controls">
					<input type="text" class="input-xlarge" name="beaconNo" id="beaconNo">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">批量增加</label>
			</div>
			<div id="control-group">
				<label class="control-label" for="input01">请选择文件</label>
				<div class="controls">
					<input id="beaconFile" name="beaconFile" type="file" class="input-file"><br />
					<img id="loading" src="img/loading.gif" style="display:none;">
				</div>
			</div>
			<div class="form-actions" style="margin-left: 200px;">
				<button id="buttonUpload" onclick="return addBeaconFileUpload();" class="btn btn-primary">保存</button>
				<button type="reset" class="btn">取消</button>
			</div>
		</fieldset>
	</form>
</div>
