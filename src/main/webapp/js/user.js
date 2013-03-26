function changePassword(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的密码更改页面
	$.ajax({
		type : "post",
		url : "user.do?option=loadChangePasswordBody",
		data : {},
		error : function() {
			alertMessage("加载密码修改面板失败，请联系管理员！！");
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

function savePassword() {
	$("#changePasswordForm").validate(
			{
				rules : {
					oldPassword : {
						required : true,
						minlength : 6
					},
					newPassword : {
						required : true,
						minlength : 6
					},
					newPassword2 : {
						required : true,
						minlength : 6,
						equalTo : "#newPassword"
					}
				},
				messages : {
					oldPassword : {
						required : "请输入原始密码",
						minlength : "原始密码长度大于等于6"
					},
					newPassword : {
						required : "请输入新密码",
						minlength : "新密码大于等于6个字符"
					},
					newPassword2 : {
						required : "请输入新确认密码",
						minlength : "新确认密码大于等于6个字符",
						equalTo : "两次输入密码不一致不一致"
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
				},
				submitHandler : function(form) { // 通过之后回调
					var uploadDatas = $(form).fieldSerialize();
					var options = {
						dataType : 'json',
						type : "post",
						url : 'user.do?option=saveNewPassword',
						error : function() {
							alertMessage("服务器错误，请联系管理员！！");
						},
						data : uploadDatas,
						success : function(data) {
							var result = handleAJAXReturnValue(data);

							try { // 传回来的数据是一个页面，eval会抛出异常 var
								obj = eval(result);
								if (obj != null && obj.length > 0) {
									if(obj[0].error!=undefined){
										alertMessage(obj[0].error);
										removeRightBody();
									}else{
										alertMessage(obj[0].message);
										
										window.location.href="user.do";
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
}