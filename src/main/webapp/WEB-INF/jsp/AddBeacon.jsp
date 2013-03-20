<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="css/upload.css" rel="stylesheet" type="text/css" />
<div class="hero-unit">
	<h1 align="center">新增信标</h1>
	<br />
	<form class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">单个增加</label>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">信标号</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="input01">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01"
					style="font-weight: bold; font-size: 25px;">批量增加</label>
			</div>
			<div id="control-group">

				<!-- <label class="control-label" for="input01">请选择文件</label>
				<div class="controls">
					<input class="input-file" id="fileInput" type="file">
				</div> -->
				<div class="fieldset flash" id="fsUploadProgress">
					<span class="legend">Upload Queue</span>
				</div>
				<div id="divStatus">0 Files Uploaded</div>
				<div>
					<span id="spanButtonPlaceHolder"></span> <input id="btnCancel"
						type="button" value="Cancel All Uploads"
						onclick="swfu.cancelQueue();" disabled="disabled"
						style="margin-left: 2px; font-size: 8pt; height: 29px;" />
				</div>

			</div>

			<div class="form-actions" style="margin-left: 200px;">
				<button type="submit" class="btn btn-primary">保存</button>
				<button class="btn">取消</button>
			</div>
		</fieldset>
	</form>
</div>
<script type="text/javascript" src="js/upload/swfupload.js"></script>
<script type="text/javascript" src="js/upload/swfupload.queue.js"></script>
<script type="text/javascript" src="js/upload/fileprogress.js"></script>
<script type="text/javascript" src="js/upload/handlers.js"></script>
<script type="text/javascript" src="js/upload/upload.js"></script>
