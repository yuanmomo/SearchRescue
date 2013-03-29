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
	if (buyBeaconDate == "") {
		alertMessage("请输入购买日期！！");
		return;
	}
	$.ajax({
		type : "post",
		url : "beacon.do?option=doBuyBeacon",
		data : {
			"beaconId" : buyBeaconId,
			"buyBeaconDate" : buyBeaconDate
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
	var userName = $("#userName").val();
	var beaconNo = $("#beaconNo").val();
	var cerNo = $("#cerNo").val();
	var passportNo = $("#passportNo").val();

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
					// 清空表格
					$("#boughtBeaconTable").html("");
					for ( var i = 0; i < beaconArray.length; i++) {
						obj = beaconArray[i];
						// 插入表格
						var _len = $("#boughtBeaconTable tr").length + 1;
						$("#boughtBeaconTable").append(
								"<tr id='" + _len + "'><td id=idId" + _len
										+ ">" + _len + "</td>" + "<td>"
										+ obj.userName + "</td>" + "<td>"
										+ obj.cerNo + obj.passportNo + "</td>"
										+ "<td>" + obj.beaconNo + "</td>"
										+ "<td>" + obj.boughtDate
										+ "</td></tr>");
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

// *************************** Admin buy beacon *******************//
function loadBeaconBuyBodyByCerStyle() {
	var cerStyleValue = $("#cerStyle").val();
	if (cerStyleValue == 0) {
		return;
	}
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBeaconBuyBodyByCerStyle",
		data : {
			"cerStyleValue" : cerStyleValue
		},
		error : function() {
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
				// json转换出错，说明请求回来的是一个页面
				// 先删除后面的那个body节点
				$("#beaconBuyBody").html(result);

				// 初始化日期选择为控件
				$.datepicker.setDefaults($.datepicker.regional[""]);
				$("#birthday").datepicker($.datepicker.regional['zh-CN']);
				$("#startTime").datepicker($.datepicker.regional['zh-CN']);
				$("#endTime").datepicker($.datepicker.regional['zh-CN']);

				// 护照用户，生效时间
				$("#issueDate").datepicker($.datepicker.regional['zh-CN']);

				// 信标购买时间激活
				$("#buyBeaconDate").datepicker($.datepicker.regional['zh-CN']);
				// 改变注册是form的action
				return;
			}
		}
	});
}

function doBuyBeaconByAdmin() {
	var cerStyleValue = $("#cerStyle").val();
	if (cerStyleValue == 0) {
		return;
	}
	$.validator.addMethod("validateDate", function(value, element) {
		// put your own logic here, this is just a (crappy) example
		return value.match(/^\d\d\d\d\-\d\d-\d\d$/);
	}, "Please enter a date in the format yyyy-mm-dd.");

	// 身份证用户判断
	// validate login form on keyup and submit
	if (cerStyleValue == "1") {
		$("#beaconBuyAdminForm").validate({
		rules : {
			userName : {
				required : true,
				minlength : 6
			},
			realName : {
				required : true
			},
			sex : {
				min : 1
			},
			birthday : {
				required : true,
				validateDate : true
			},
			cerNo : {
				required : true,
				digits : true,
				rangelength : [ 18, 20 ]
			},
			authority : {
				required : true
			},
			effecDuration : {
				required : true
			},
			startTime : {
				required : true,
				validateDate : true
			},
			endTime : {
				required : true,
				validateDate : true
			},
			buyBeaconNo : {
				required : true
			},
			buyBeaconDate : {
				required : true,
				validateDate : true
			}
		},
		messages : {
			userName : {
				required : "请为该用户分配一个用户名",
				minlength : "用户名长度大于等于6"
			},
			realName : {
				required : "请输该用户的真名"
			},
			sex : {
				min : "请选择性别"
			},
			birthday : {
				required : "请输入日期",
				validateDate : "日期格式不正确"
			},
			cerNo : {
				required : "请输入身份证号",
				digits : "身份证号必须全为数字",
				rangelength : "身份证号长度必须为18到20"
			},
			authority : {
				required : "请输入发证机关"
			},
			effecDuration : {
				required : "请输入有效期限"
			},
			startTime : {
				required : "请输入日期",
				validateDate : "日期格式不正确"
			},
			endTime : {
				required : "请输入日期",
				validateDate : "日期格式不正确"
			},
			buyBeaconNo : {
				required : "请点击取得信标号，得到一个信标号"
			},
			buyBeaconDate : {
				required : "请选择购买日期",
				validateDate : "日期格式不正确"
			}
		},
		highlight : function(element, errorClass,
				validClass) {
			$(element).addClass(errorClass).removeClass(
					validClass);
			$(element.form).find(
					"label[for=" + element.id + "]")
					.addClass(errorClass);
		},
		unhighlight : function(element, errorClass,
				validClass) {
			$(element).removeClass(errorClass).addClass(
					validClass);
			$(element.form).find(
					"label[for=" + element.id + "]")
					.removeClass(errorClass);
		},
		submitHandler : function(form) { // 通过之后回调
			var uploadDatas = $(form).fieldSerialize();
			var options = {
				dataType : 'json',
				type : "post",
				url : 'beacon.do?option=doBuyBeaconByAdminAndCerStyle1',
				error : function() {
					alertMessage("服务器错误，请联系管理员！！");
				},
				data : uploadDatas,
				success : function(data) {
					var result = handleAJAXReturnValue(data);
	
					try { // 传回来的数据是一个页面，eval会抛出异常 var
						obj = eval(result);
						if (obj != null && obj.length > 0) {
							if (obj[0].error != undefined) {
								alertMessage(obj[0].error);
								removeRightBody();
							} else {
								alertMessage(obj[0].message);
							}
						}
					} catch (e) { //
						// json转换出错，说明请求回来的是一个页面 //
						// 先删除后面的那个body节点
						$("#rightPanel").html(result);
						}
					}
				};
				$(form).ajaxSubmit(options);
				return false;
			}
		});
	} else {
		$("#beaconBuyAdminForm").validate({
			rules : {
				userName : {
					required : true,
					minlength : 6
				},
				realName : {
					required : true
				},
				sex : {
					min : 1
				},
				birthday : {
					required : true,
					validateDate : true
				},
				nationality : {
					required : true
				},
				passportNo : {
					required : true
				},
				effecDuration : {
					required : true
				},
				issueDate : {
					required : true,
					validateDate : true
				},
				authority : {
					required : true
				},
				signature : {
					required : true
				},
				buyBeaconNo : {
					required : true
				},
				buyBeaconDate : {
					required : true,
					validateDate : true
				}
			},
			messages : {
				userName : {
					required : "请为该用户分配一个用户名",
					minlength : "用户名长度大于等于6"
				},
				realName : {
					required : "请输该用户的真名"
				},
				sex : {
					min : "请选择性别"
				},
				birthday : {
					required : "请输入日期",
					validateDate : "日期格式不正确"
				},
				nationality : {
					required : "请输入国籍"
				},
				passportNo : {
					required : "请输入护照号"
				},
				effecDuration : {
					required : "请输入有效期限"
				},
				issueDate : {
					required : "请输入生效日期",
					validateDate : "日期格式不正确"
				},
				authority : {
					required : "请输入发证国或组织"
				},
				signature : {
					required : "请输入签名"
				},
				buyBeaconNo : {
					required : "请点击取得信标号，得到一个信标号"
				},
				buyBeaconDate : {
					required : "请选择购买日期",
					validateDate : "日期格式不正确"
				}
			},
			highlight : function(element, errorClass,
					validClass) {
				$(element).addClass(errorClass).removeClass(
						validClass);
				$(element.form).find(
						"label[for=" + element.id + "]")
						.addClass(errorClass);
			},
			unhighlight : function(element, errorClass,
					validClass) {
				$(element).removeClass(errorClass).addClass(
						validClass);
				$(element.form).find(
						"label[for=" + element.id + "]")
						.removeClass(errorClass);
			},
			submitHandler : function(form) { // 通过之后回调
				var uploadDatas = $(form).fieldSerialize();
				var options = {
					dataType : 'json',
					type : "post",
					url : 'beacon.do?option=doBuyBeaconByAdminAndCerStyle2',
					error : function() {
						alertMessage("服务器错误，请联系管理员！！");
					},
					data : uploadDatas,
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
				};
				$(form).ajaxSubmit(options);
				return false;
			}
		});
	}
}
