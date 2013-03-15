//ajax应用中session过期后，ajax的请求返回的结果就会是登陆页面
function handleAJAXReturnValue(result) {
	if (result.indexOf('<HTML>') > -1 || result.indexOf('<html>') > -1 ) {
		/* 返回内容中有html标签 */
		window.location.href="user.do";
	}else{
		return result;
	}
}

