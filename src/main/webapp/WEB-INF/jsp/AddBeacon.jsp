<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="span10">
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
					<label class="control-label" for="input01">新标号</label>
					<div class="controls">
						<input type="text" class="input-xlarge" id="input01">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="input01"
						style="font-weight: bold; font-size: 25px;">批量增加</label>
				</div>
				<div class="control-group">
					<label class="control-label" for="fileInput">请选择文件</label>
					<div class="controls">
						<input class="input-file" id="fileInput" type="file">
					</div>
				</div>
				<div class="form-actions" style="margin-left: 200px;">
					<button type="submit" class="btn btn-primary">保存</button>
					<button class="btn">取消</button>
				</div>
			</fieldset>
		</form>
	</div>
</div>