<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="span10">
	<div class="hero-unit">
		<h1 align="center">信标报废</h1>
		<br />
		<form class="form-horizontal">
			<fieldset>
				<div class="control-group">
					<label class="control-label" for="input01">信标号：&nbsp;&nbsp;</label>
					<div class="controls"
						style="margin-left: 0px; width: 300px; float: left;">
						<input type="text" class="input-xlarge" id="input01">
					</div>
					<button type="submit" class="btn btn-primary">添加</button>
				</div>
				<table class="table table-striped table-bordered"
					style="font-size: 13px;">
					<thead>
						<tr>
							<th width="5%">&nbsp;</th>
							<th width="35%">序号</th>
							<th width="60%">信标号</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" id="optionsCheckbox"
								value="option1"></td>
							<td>1</td>
							<td>xxxxx000001</td>
						</tr>
						<tr>
							<td><input type="checkbox" id="optionsCheckbox"
								value="option1"></td>
							<td>1</td>
							<td>xxxxx000001</td>
						</tr>
						<tr>
							<td><input type="checkbox" id="optionsCheckbox"
								value="option1"></td>
							<td>1</td>
							<td>xxxxx000001</td>
						</tr>
						<tr>
							<td><input type="checkbox" id="optionsCheckbox"
								value="option1"></td>
							<td>1</td>
							<td>xxxxx000001</td>
						</tr>
					</tbody>
				</table>
				<div class="form-actions" style="margin-left: 200px;">
					<button type="submit" class="btn btn-primary">保存</button>
					<button class="btn">取消</button>
				</div>
			</fieldset>
		</form>
	</div>
</div>