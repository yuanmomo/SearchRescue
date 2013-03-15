<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="control-group">
	<label class="control-label" for="input01">用户名</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="userName" name="userName">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">密码</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="password1" name="password1">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">密码确认</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="password2" name="password2">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">姓名</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="realName" name="realName">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="select01">性别</label>
	<div class="controls">
		<select id="sex" name="sex">
			<option value="0" selected="selected">请选择</option>
			<option value="1" >男</option>
			<option value="2" >女</option>
		</select>
		&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">出生日期</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="birthday" name="birthday">
		&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">国籍</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">护照号</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">有效期限</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">签发日期</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">发证国或组织</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">签名</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="input01">&nbsp;<span style="color: red">*</span>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="textarea">照片</label>
	<div class="controls">
		<img alt="照片" src="">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="textarea">备注</label>
	<div class="controls">
		<textarea class="input-xlarge" id="textarea" rows="3"></textarea>
	</div>
</div>
<div class="form-actions" style="margin-left: 200px">
	<button type="submit" class="btn btn-primary" onclick="register()">注册</button>
	<button class="btn" type="reset">取消</button>
</div>