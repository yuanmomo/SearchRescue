<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="hero-unit">
	<h1 align="center">租赁归还</h1>
	<br />
	<form class="form-horizontal" method="post">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01">姓名</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="userName"
						name="userName" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">信标号</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="beaconNo"
						name="beaconNo" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">身份证号码</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="cerNo" name="cerNo" />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="input01">护照号</label>
				<div class="controls">
					<input type="text" class="input-xlarge" id="passportNo"
						name="passportNo" />
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<button type="button" class="btn btn-primary"
						onclick="queryLeaseBeacon();">查询</button>
				</div>
			</div>
			<table class="table table-striped table-bordered"
				style="font-size: 13px;">
				<thead>
					<tr>
						<th width="10%">序号</th>
						<th width="15%">姓名</th>
						<th width="25%">身份证号/护照号</th>
						<th width="10%">信标号</th>
						<th width="20%">租赁开始日期</th>
						<th width="20%">归还日期</th>
					</tr>
				</thead>
				<tbody id="rentBeaconTable">

				</tbody>
			</table>

			<div class="form-actions" style="margin-left: 200px;">
				<button type="button" onclick="return doBeaconReturn();"
					class="btn btn-primary">归还</button>
				<button type="reset" class="btn">取消</button>
			</div>
		</fieldset>
	</form>
</div>
