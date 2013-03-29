<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="hero-unit">
	<h1 align="center">信标报废</h1>
	<br />
	<form class="form-horizontal">
		<fieldset>
			<div class="control-group">
				<label class="control-label" for="input01">信标号：&nbsp;&nbsp;</label>
				<div class="controls"
					style="margin-left: 0px; width: 300px; float: left;">
					<input type="text" class="input-xlarge" id="beaconNo"
						name="beaconNo">
				</div>
				<button type="button" class="btn btn-primary"
					onclick="getOneBeaconByBeaconNo();">添加</button>
			</div>
			<table class="table table-striped table-bordered"
				style="font-size: 13px;">
				<thead>
					<tr>
						<th width="20%">序号</th>
						<th width="60%">信标号</th>
						<th width="20%">操作</th>
					</tr>
				</thead>
				<tbody id="tableBody">

				</tbody>
			</table>
			<div class="form-actions" style="margin-left: 200px;">
				<button type="button" class="btn btn-primary"
					onclick="deleteBeacons();">保存</button>
				<button class="btn" type="button" onclick="removeRightBody()">取消</button>
			</div>
		</fieldset>
	</form>
</div>
