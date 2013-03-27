<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="hero-unit">
	<h1 align="center">购买查询</h1>
	<br />
	<form id="beaconFileForm" class="form-horizontal" method="POST"
		enctype="multipart/form-data">
		<fieldset>
			<div class="control-group">
				<div class="controls">
					<button type="button" class="btn btn-primary"
						onclick="queryBoughtBeacon();">查询</button>
				</div>
			</div>
			<table class="table table-striped table-bordered"
					style="font-size: 13px;">
					<thead>
						<tr>
							<th width="10%">序号</th>
							<th width="10%">姓名</th>
							<th width="40%">身份证号/护照号</th>
							<th width="20%">信标号</th>
							<th width="20%">购买日期</th>
						</tr>
					</thead>
					<tbody id="boughtBeaconTable">
	
					</tbody>
				</table>
		</fieldset>
	</form>
</div>