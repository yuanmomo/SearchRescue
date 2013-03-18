<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="span10">
	<div class="hero-unit">
		<h1 align="center">新增租赁</h1>
		<br />
		<form class="form-horizontal">
			<fieldset>
				<table>
					<tr>
						<td colspan="2">
							<div class="control-group">
								<label class="control-label" for="input01"
									style="font-weight: bold; font-size: 25px;">用户信息</label>
							</div>
							<div class="control-group">
								<label class="control-label" for="select01">身份类型</label>
								<div class="controls">
									<select id="select01">
										<option>请选择</option>
										<c:choose>
										    <c:when test="${sessionScope.user.cerStyle==1}">
										    	<option selected="selected">身份证用户</option>
										    </c:when>
										    <c:when test="${sessionScope.user.cerStyle==2}">
										    	<option selected="selected">护照用户</option>
										    </c:when>  
										   <c:otherwise>
										  		<option value="1" selected="selected">身份证用户</option>
										   		<option value="2" >护照用户</option>
										   </c:otherwise>
										  </c:choose>
									</select>
								</div>
							</div> 
								<%
								 	String beaconfRentBody = "BeaconRentWith"
								 			+ (String) request.getAttribute("rentBody") + ".jsp";
								 	pageContext.include(beaconfRentBody);
								%>

						</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td colspan="2"><div class="form-actions">
								<button type="submit" class="btn btn-primary">保存</button>
								<button class="btn">取消</button>
							</div></td>
						<td>&nbsp;</td>
					</tr>
				</table>
			</fieldset>
		</form>
	</div>
</div>