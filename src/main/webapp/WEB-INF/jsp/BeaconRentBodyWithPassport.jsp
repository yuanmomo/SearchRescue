<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="control-group">
	<label class="control-label" for="input01">分配用户名&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="userName" name="userName">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">&nbsp;</label>
	<div class="controls">
		<button type="button" style="margin-left: 140px;"
			class="btn btn-primary" onclick="checkUserName()">检查用户名是否可用</button>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">姓名&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="realName" name="realName">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="select01">性别&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<select id="sex" name="sex">
			<option value="0" selected="selected">请选择</option>
			<option value="1">男</option>
			<option value="2">女</option>
		</select>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">出生日期&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="birthday" name="birthday">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">国籍&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="nationality"
			name="nationality">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">护照号&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="passportNo"
			name="passportNo">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">有效期限&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="effecDuration"
			name="effecDuration">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">签发日期&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="issueDate"
			name="issueDate">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">发证国或组织&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="authority"
			name="authority">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">签名&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="signature"
			name="signature">
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
		<textarea class="input-xlarge" id="remark" name="remark" rows="3"></textarea>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01"
		style="font-weight: bold; font-size: 25px;">信标信息：</label>
</div>
<div class="control-group">
	<label class="control-label" for="input01">信标编号</label>
	<div class="controls">
		<input type="hidden" class="input-xlarge" id="buyBeaconId"
			name="buyBeaconId" /> 
		<input type="text" class="input-xlarge"
			id="buyBeaconNo" name="buyBeaconNo" readonly="readonly" /><br />
		<button type="button" class="btn btn-primary"
			onclick="getOneRandomBeacon();">取得信标</button>

	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">租赁开始日期</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="buyBeaconDate" name="buyBeaconDate">
	</div>
</div>
<div class="form-actions" style="margin-left: 200px;">
	<button type="submit" class="btn btn-primary" onclick="return doRentBeaconByAdmin();">租赁</button>
	<button class="btn" type="button" onclick="removeRightBody()">取消</button>
</div>