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
				$("#cerStyleBody").html(result);

				// 初始化日期选择为控件
				$.datepicker.setDefaults($.datepicker.regional[""]);
				$("#birthday").datepicker($.datepicker.regional['zh-CN']);
				$("#startTime").datepicker($.datepicker.regional['zh-CN']);
				$("#endTime").datepicker($.datepicker.regional['zh-CN']);

				// 护照用户，生效时间
				$("#issueDate").datepicker($.datepicker.regional['zh-CN']);

				// 改变注册是form的action
				var cerStyleValue = $("#cerStyle").val();
				$("#registerForm").attr("action",
						"user.do?option=doRegister" + cerStyleValue);
				return;
			}
		}
	});
}

function register() {
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
		$("#registerForm")
				.validate(
						{
							rules : {
								userName : {
									required : true,
									minlength : 6
								},
								password : {
									required : true,
									minlength : 6
								},
								rePassword : {
									required : true,
									minlength : 6,
									equalTo : "#password"
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
								}
							},
							messages : {
								userName : {
									required : "请输入注册用户名",
									minlength : "注册用户名长度大于等于6"
								},
								password : {
									required : "请输入密码",
									minlength : "密码大于等于6个字符"
								},
								rePassword : {
									required : "请输入确认密码",
									minlength : "确认密码大于等于6个字符",
									equalTo : "两次输入密码不一致不一致"
								},
								realName : {
									required : "请输入你的真名"
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
							}
						});
	} else {
		$("#registerForm")
				.validate(
						{
							rules : {
								userName : {
									required : true,
									minlength : 6
								},
								password : {
									required : true,
									minlength : 6
								},
								rePassword : {
									required : true,
									minlength : 6,
									equalTo : "#password"
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
								}
							},
							messages : {
								userName : {
									required : "请输入注册用户名",
									minlength : "注册用户名长度大于等于6"
								},
								password : {
									required : "请输入密码",
									minlength : "密码大于等于6个字符"
								},
								rePassword : {
									required : "请输入确认密码",
									minlength : "确认密码大于等于6个字符",
									equalTo : "两次输入密码不一致不一致"
								},
								realName : {
									required : "请输入你的真名"
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
							}
						});
	}
}

function checkUserName() {
	var userName = $("#userName").val();
	if (userName == "") {
		return;
	}
	$.ajax({
		type : "post",
		url : "user.do?option=checkUserName",
		data : {
			"userName" : userName
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
				if("用户名已经存在，不可用"==resultArray[0].message){
					$("#message").html("<span style='color: red'>"+resultArray[0].message+"</span>");
				}else{
					$("#message").html(resultArray[0].message);
				}
				$('#myModal').modal({
					backdrop : true,
					keyboard : true,
					show : true
				});
			} catch (e) {
				// json转换出错，说明请求回来的是一个页面
				// 登陆超时
				window.location.href = "user.do";
				return;
			}
		}
	});
}