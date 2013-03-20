function addBeacon(obj){
	//jquery设置选中该li，其它的li取消选中状态
	
	
	//加载右边的添加页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadAddBeaconBody",
		data : {},
		error : function() {
			$("#message").html("加载信标添加面板失败，请联系管理员！！");
			$('#messageDialog').modal({
				backdrop : true,
				keyboard : true,
				show : true
			});
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				//传回来的数据是一个页面，eval会抛出异常
				eval(result);
			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#rightPanel").html(result);
				return;
			}
		}
	});
}