function loadCerStyle() {
	var cerStyleValue = $("#cerStyle").val();
	if (cerStyleValue == 0) {
		return;
	}
	$.ajax({
		type : "post",
		url : "user.do?option=loadCerStyleBody",
		data : {
			"cerStyleValue" : cerStyleValue
		},
		error:function() {
			$("#message").html("加载注册身份类型失败，请联系管理员！！");
			$('#myModal').modal({
				backdrop : true,
				keyboard : true,
				show : true
			});
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			var resultArray = null;
			try {
				resultArray = eval(result);
				if (resultArray[0].error != "") {
					$("#message").html(resultArray[0].error);
					$('#myModal').modal({
						backdrop : true,
						keyboard : true,
						show : true
					});
				}
			} catch (e) {
				//json转换出错，说明请求回来的是一个页面
				//先删除后面的那个body节点
				$("#cerStyleBody").html(result);
				return;
			}
		}
	});
}