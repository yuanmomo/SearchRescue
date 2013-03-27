<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:if test="${user.userStyle==1}">
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
	</div> <br /> <br />
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
</c:if> 


