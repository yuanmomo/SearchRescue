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

	// 判断公共部分
	// validate login form on keyup and submit
	$("#registerForm").validate(
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
					cer_No : {
						required : true,
						digits : true,
						rangelength : [ 18, 20 ]
					},
					authority : {
						required : true
					},
					effec_duration : {
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
					cer_No : {
						required : "请输入身份证号",
						digits : "身份证号必须全为数字",
						rangelength : "身份证号长度必须为18到20"
					},
					authority : {
						required : "请输入发证机关"
					},
					effec_duration : {
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
				highlight : function(element, errorClass, validClass) {
					$(element).addClass(errorClass).removeClass(validClass);
					$(element.form).find("label[for=" + element.id + "]")
							.addClass(errorClass);
				},
				unhighlight : function(element, errorClass, validClass) {
					$(element).removeClass(errorClass).addClass(validClass);
					$(element.form).find("label[for=" + element.id + "]")
							.removeClass(errorClass);
				}
			/*
			 * , showErrors : function(errorMap, errorList) { var msg = "";
			 * jQuery.each(errorList, function(i, v) { msg += (v.message +
			 * "\r\n"); }); if (msg != "") { $("#message").html(msg);
			 * $('#myModal').modal({ backdrop : true, keyboard : true, show :
			 * true }); } }
			 */
			});
}
function registerByID() {

}
function registerByPassport() {

}