<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="hero-unit">
	<h1 align="center">修改密码</h1>
	<br />
	<form id="changePasswordForm" class="form-horizontal" action=""
		method="post">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01">原密码</label>
				<div class="controls">
					<input type="password" class="input-xlarge" id="oldPassword"
						name="oldPassword">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">新密码</label>
				<div class="controls">
					<input type="password" class="input-xlarge" id="newPassword"
						name="newPassword">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">新密码</label>
				<div class="controls">
					<input type="password" class="input-xlarge" id="newPassword2"
						name="newPassword2">
				</div>
			</div>
			<div class="form-actions" style="margin-left: 200px;">
				<button type="submit" class="btn btn-primary"
					onclick="return savePassword();">保存</button>
				<button type="reset" class="btn">取消</button>
			</div>
		</fieldset>
	</form>
</div>
