function login(){
	// validate file upload form on keyup and submit
	$("#loginForm").validate({
		rules: {
			username: "required",
			password: "required",
			username: {
				required: true,
				minlength: 6
			},
			password: {
				required: true,
				minlength: 6
			}
		},
		messages: {
			username: {
				required: "请输入用户名",
				minlength: "用户名长度至少6位"
			},
			password: {
				required: "请输入密码",
				minlength: "密码长度至少6"
			}
		}
	});
}