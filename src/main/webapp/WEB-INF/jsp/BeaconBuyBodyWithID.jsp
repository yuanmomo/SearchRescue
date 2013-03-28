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
	<label class="control-label" for="select01">名族&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<select id="nation" name=nation>
			<option selected="selected" value="汉族">汉族</option>
			<option value="蒙古族">蒙古族</option>
			<option value="彝族">彝族</option>
			<option value="侗族">侗族</option>
			<option value="哈萨克族">哈萨克族</option>
			<option value="畲族">畲族</option>
			<option value="纳西族">纳西族</option>
			<option value="仫佬族">仫佬族</option>
			<option value="仡佬族">仡佬族</option>
			<option value="怒族">怒族</option>
			<option value="保安族">保安族</option>
			<option value="鄂伦春族">鄂伦春族</option>
			<option value="回族">回族</option>
			<option value="壮族">壮族</option>
			<option value="瑶族">瑶族</option>
			<option value="傣族">傣族</option>
			<option value="高山族">高山族</option>
			<option value="景颇族">景颇族</option>
			<option value="羌族">羌族</option>
			<option value="锡伯族">锡伯族</option>
			<option value="乌孜别克族">乌孜别克族</option>
			<option value="裕固族">裕固族</option>
			<option value="赫哲族">赫哲族</option>
			<option value="藏族">藏族</option>
			<option value="布依族">布依族</option>
			<option value="白族">白族</option>
			<option value="黎族">黎族</option>
			<option value="拉祜族">拉祜族</option>
			<option value="柯尔克孜族">柯尔克孜族</option>
			<option value="布朗族">布朗族</option>
			<option value="阿昌族">阿昌族</option>
			<option value="俄罗斯族">俄罗斯族</option>
			<option value="京族">京族</option>
			<option value="门巴族">门巴族</option>
			<option value="维吾尔族">维吾尔族</option>
			<option value="朝鲜族">朝鲜族</option>
			<option value="土家族">土家族</option>
			<option value="傈僳族">傈僳族</option>
			<option value="水族">水族</option>
			<option value="土族">土族</option>
			<option value="撒拉族">撒拉族</option>
			<option value="普米族">普米族</option>
			<option value="鄂温克族">鄂温克族</option>
			<option value="塔塔尔族">塔塔尔族</option>
			<option value="珞巴族">珞巴族</option>
			<option value="苗族">苗族</option>
			<option value="满族">满族</option>
			<option value="哈尼族">哈尼族</option>
			<option value="佤族">佤族</option>
			<option value="东乡族">东乡族</option>
			<option value="达斡尔族">达斡尔族</option>
			<option value="毛南族">毛南族</option>
			<option value="塔吉克族">塔吉克族</option>
			<option value="德昂族">德昂族</option>
			<option value="独龙族">独龙族</option>
			<option value="基诺族">基诺族</option>
		</select>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">身份证号&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="cerNo" name="cerNo">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">发证机关&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="authority"
			name="authority">
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
	<label class="control-label" for="input01">开始时间&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="startTime"
			name="startTime">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">结束时间&nbsp;<span
		style="color: red">*</span></label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="endTime" name="endTime">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="textarea">照片</label>
	<div class="controls">
		<img alt="照片" src="" id="photo">
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="textarea">备注</label>
	<div class="controls">
		<textarea class="input-xlarge" id="remark" rows="3" name="remark"></textarea>
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
			id="buyBeaconNo" name="buyBeaconNo" readonly="readonly" />
		<button type="button" class="btn btn-primary"
			onclick="getOneRandomBeacon();">取得信标</button>
	</div>
</div>
<div class="control-group">
	<label class="control-label" for="input01">购买日期</label>
	<div class="controls">
		<input type="text" class="input-xlarge" id="buyBeaconDate" name="buyBeaconDate">
	</div>
</div>
<div class="form-actions" style="margin-left: 200px;">
	<button type="submit" class="btn btn-primary" onclick="doBuyBeaconByAdmin();">购买</button>
	<button class="btn" type="reset" onclick="removeRightBody()">取消</button>
</div>
