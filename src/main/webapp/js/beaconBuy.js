function buyBeacon(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的信标购买页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBeaconBuyBody",
		data : {},
		error : function() {
			alertMessage("加载信标购买面板失败，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				eval(result);
			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#rightPanel").html(result);

				// 初始化日期选择为控件
				$.datepicker.setDefaults($.datepicker.regional[""]);
				$("#buyBeaconDate").datepicker($.datepicker.regional['zh-CN']);

				return;
			}
		}
	});
}
function boughtQuery(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的信标购买页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBoughtQueryBody",
		data : {},
		error : function() {
			alertMessage("加载信标购买面板失败，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);
			try {
				// 传回来的数据是一个页面，eval会抛出异常
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

function doBuyBeacon() {
	// 取得该信标id
	var buyBeaconId = $("#buyBeaconId").val();
	var buyBeaconDate = $("#buyBeaconDate").val();
	if (buyBeaconId <= 0) {
		return;
	}
	if(buyBeaconDate==""){
		alertMessage("请输入购买日期！！");
		return ;
	}
	$.ajax({
		type : "post",
		url : "beacon.do?option=doBuyBeacon",
		data : {
			"beaconId" : buyBeaconId,
			"buyBeaconDate" : buyBeaconDate,
		},
		error : function() {
			alertMessage("购买信标出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var messageArray = eval(result);
				if (messageArray != null && messageArray.length > 0) {
					obj = messageArray[0];
					if (typeof (obj.error) != 'undefined') {
						if (obj.error != '') {
							alertMessage(obj.error);
						}
					} else {
						alertMessage(obj.message);
					}
				}

			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#rightPanel").html(result);

				return;
			}
		}
	});
}

function queryBoughtBeacon() {
	var userName=$("#userName").val();
	var beaconNo=$("#beaconNo").val();
	var cerNo=$("#cerNo").val();
	var passportNo=$("#passportNo").val();
	
	// 根据输入的信标号查询，如果查询到，则添加到表格，
	// 没有查询到则提示没有查询结果
	$.ajax({
		type : "post",
		url : "beacon.do?option=queryBoughtBeacon",
		data : {
			"userName" : userName,
			"beaconNo" : beaconNo,
			"cerNo" : cerNo,
			"passportNo" : passportNo
		},
		error : function() {
			alertMessage("查询信标出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var beaconArray = eval(result);
				if (beaconArray != null && beaconArray.length > 0) {
					//清空表格
					$("#boughtBeaconTable").html("");
					for(var i=0;i<beaconArray.length;i++){
						obj = beaconArray[i];
						// 插入表格
						var _len = $("#boughtBeaconTable tr").length+1; 
						$("#boughtBeaconTable").append(
								"<tr id='"+_len+"'><td id=idId"+_len+">" + _len+ "</td>"
								 	   + "<td>"+obj.userName+"</td>"
								 	   + "<td>"+obj.cerNo+obj.passportNo+"</td>"
								 	   + "<td>"+obj.beaconNo+"</td>"
								 	   + "<td>"+obj.boughtDate+"</td></tr>");
					}
				} else {
					alertMessage("没有查询到该信标，请核对后重新输入！！");
				}
			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#rightPanel").html(result);
				return;
			}
		}
	});
}

function getOneRandomBeacon() {
	$.ajax({
		type : "post",
		url : "beacon.do?option=getOneRandomBeacon",
		data : {},
		error : function() {
			alertMessage("得到随机信标号出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var beaconArray = eval(result);
				if (beaconArray != null && beaconArray.length > 0) {
					obj = beaconArray[0];
					var beaconId = obj.id;
					var beaconNo = obj.beaconNo;
					$("#buyBeaconId").val(beaconId);
					$("#buyBeaconNo").val(beaconNo);
				} else {
					alertMessage("没有可用的信标，请通知管理员进行添加！");
				}
			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#rightPanel").html(result);
				return;
			}
		}
	});
}