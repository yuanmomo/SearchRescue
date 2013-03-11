<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="span10">
	<div class="hero-unit">
		<h1 align="center">租赁归还</h1>
		<br />
		<form class="form-horizontal">
			<fieldset>
				<table>
					<tr>
						<td colspan="2">
							<div class="control-group">
								<label class="control-label" for="input01">姓名</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01">身份证号</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01">
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01">&nbsp;</label>
							</div>
						</td>
						<td colspan="2">
							<div class="control-group">
								<label class="control-label" for="input01">信标编号</label>
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
								<label class="control-label" for="input01"><button
										type="submit" class="btn btn-primary">查询</button></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<table class="table table-striped table-bordered"
								style="font-size: 13px;">
								<thead>
									<tr>
										<th width="5%">&nbsp;</th>
										<th width="5%">序号</th>
										<th width="15%">姓名</th>
										<th width="25%">身份证号/护照号</th>
										<th width="10%">信标号</th>
										<th width="20%">租赁开始日期</th>
										<th width="20%">归还日期</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td><input type="checkbox" id="optionsCheckbox"
											value="option1"></td>
										<td>1</td>
										<td>袁鸿彬</td>
										<td>51072219890628xxxx</td>
										<td>111111111</td>
										<td>2012-09-09</td>
										<td>2013-10-10</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="optionsCheckbox"
											value="option1"></td>
										<td>1</td>
										<td>袁鸿彬</td>
										<td>51072219890628xxxx</td>
										<td>111111111</td>
										<td>2012-09-09</td>
										<td>2013-10-10</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="optionsCheckbox"
											value="option1"></td>
										<td>1</td>
										<td>袁鸿彬</td>
										<td>51072219890628xxxx</td>
										<td>111111111</td>
										<td>2012-09-09</td>
										<td>2013-10-10</td>
									</tr>
									<tr>
										<td><input type="checkbox" id="optionsCheckbox"
											value="option1"></td>
										<td>1</td>
										<td>袁鸿彬</td>
										<td>51072219890628xxxx</td>
										<td>111111111</td>
										<td>2012-09-09</td>
										<td>2013-10-10</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>

					<tr>
						<td>&nbsp;</td>
						<td colspan="2"><div class="form-actions">
								<button type="submit" class="btn btn-primary">归还</button>
								<button class="btn">取消</button>
							</div></td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</fieldset>
		</form>
	</div>
</div>
