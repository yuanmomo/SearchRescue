// *************************** Admin Rent beacon *******************//
function rentBeacon(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的信标租赁页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBeaconRentBody",
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
function beaconReturn(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的租赁归还信息
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBeaconReturnBody",
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

function queryLeaseBeacon() {
	var userName = $("#userName").val();
	var beaconNo = $("#beaconNo").val();
	var cerNo = $("#cerNo").val();
	var passportNo = $("#passportNo").val();

	// 根据输入的信标号查询，如果查询到，则添加到表格，
	// 没有查询到则提示没有查询结果
	$.ajax({
		type : "post",
		url : "beacon.do?option=queryLeaseBeacon",
		data : {
			"userName" : userName,
			"beaconNo" : beaconNo,
			"cerNo" : cerNo,
			"passportNo" : passportNo
		},
		error : function() {
			alertMessage("查询信标租赁出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var beaconArray = eval(result);
				if (beaconArray != null && beaconArray.length > 0) {
					// 清空表格
					$("#rentBeaconTable").html("");
					for ( var i = 0; i < beaconArray.length; i++) {
						obj = beaconArray[i];
						// 插入表格
						var _len = $("#rentBeaconTable tr").length + 1;
						$("#rentBeaconTable").append(
								"<tr id='" + _len + "'>" + "<td id=idId" + _len
										+ ">" + _len + "</td>" + "" + "<td>"
										+ obj.userName + "</td>" + "<td>"
										+ obj.cerNo + obj.passportNo + "</td>"
										+ "<td>" + obj.beaconNo
										+ "<input type='hidden' value='"
										+ obj.beaconNo
										+ "' name='beaconNo[]' /></td>"
										+ "<td>" + obj.boughtDate
										+ "</td><td>今日</td></tr>");
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

function doBeaconReturn() {
	var _len = $("#rentBeaconTable tr").length;
	if (_len == 0) {
		alertMessage("没有要归还的信标号");
		return false;
	}
	var beaconArray = $("[name='beaconNo[]']");
	var beaconNos = "";
	for ( var i = 0; i < beaconArray.length; i++) {
		var beaconId = $(beaconArray[i]).val();
		if (i > 0) {
			beaconNos += ",";
		}
		beaconNos += beaconId;
	}

	// 将id的字符串发送过去，服务器解析，然后删除
	$.ajax({
		type : "post",
		url : "beacon.do?option=returnBeacon",
		data : {
			"beaconNos" : beaconNos
		},
		error : function() {
			alertMessage("归还信标出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);
			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var obj = eval(result);
				if (obj != null && obj.length > 0) {
					alertMessage(obj[0].message);
					removeRightBody();
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

function loadBeaconRentBodyByCerStyle() {
	var cerStyleValue = $("#cerStyle").val();
	if (cerStyleValue == 0) {
		return;
	}
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadBeaconRentBodyByCerStyle",
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
				$("#beaconRentBody").html(result);

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

function doRentBeaconByAdmin() {
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
		$("#beaconRentAdminForm")
				.validate(
						{
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
									required : "请选择租赁日期",
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
									url : 'beacon.do?option=doRentBeaconByAdminAndCerStyle1',
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
												} else {
													alertMessage(obj[0].message);
													removeRightBody();
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
		$("#beaconRentAdminForm")
				.validate(
						{
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
									required : "请选择租赁日期",
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
									url : 'beacon.do?option=doRentBeaconByAdminAndCerStyle2',
									error : function() {
										alertMessage("服务器错误，请联系管理员！！");
									},
									data : uploadDatas,
									success : function(data) {
										var result = handleAJAXReturnValue(data);

										try {
											// 传回来的数据是一个页面，eval会抛出异常
											var messageArray = eval(result);
											if (messageArray != null
													&& messageArray.length > 0) {
												obj = messageArray[0];
												if (typeof (obj.error) != 'undefined') {
													if (obj.error != '') {
														alertMessage(obj.error);
													}
												} else {
													alertMessage(obj.message);
													removeRightBody();
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
