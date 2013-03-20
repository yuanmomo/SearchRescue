<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="span2">
	<div class="well sidebar-nav">
		<ul class="nav nav-list">
		<c:if test="${user.userStyle=='1'}">
			<li class="nav-header">信标租赁管理</li>
			<li><a href="#">新增租赁</a></li>
			<li><a href="#">租赁归还</a></li>
			<li class="nav-header">信标购买管理</li>
			<li><a href="#">新建购买</a></li>
			<li><a href="#">购买查询</a></li>
			<li class="nav-header">信标管理</li>
			<li class="active"><a href="javascript:void(0);">新增信标</a></li>
			<li><a href="javascript:void(0);">信标报废</a></li>
			<li class="nav-header">账号管理</li>
			<li><a href="javascript:void(0);">修改密码</a></li>
		</c:if>
		<c:if test="${user.userStyle=='2'}">
			<li class="nav-header">信标管理</li>
			<li class="active"><a href="javascript:void(0);" onclick="addBeacon(this)">新增信标</a></li>
			<li><a href="javascript:void(0)">信标报废</a></li>
			<li class="nav-header">账号管理</li>
			<li><a href="javascript:void(0)">修改密码</a></li>
		</c:if>
		<c:if test="${user.userStyle=='3'}">
			<li class="nav-header">信标购买管理</li>
			<li><a href="#">新建购买</a></li>
			<li><a href="#">购买查询</a></li>
			<li class="nav-header">账号管理</li>
			<li><a href="#">修改密码</a></li>
		</c:if>
		</ul>
	</div>
</div>
