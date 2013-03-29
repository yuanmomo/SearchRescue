//ajax应用中session过期后，ajax的请求返回的结果就会是登陆页面
function handleAJAXReturnValue(result) {
	if ((result+"").indexOf('<HTML') > -1 || (result+"").indexOf('<html') > -1 
			|| (result+"").indexOf('HTML>') > -1|| (result+"").indexOf('html>') > -1) {
		/* 返回内容中有html标签 */
		window.location.href="user.do";
	}else{
		return result;
	}
}


function changeNavigator(obj){
	// jquery设置选中该li，其它的li取消选中状态
	var aTags = $("#navigator a");
	if (aTags != null && aTags.length > 0) {
		for ( var i = 0; i < aTags.length; i++) {
			if (aTags[i] == obj) {
				$(aTags[i]).parent().removeClass().addClass("active");
			} else {
				$(aTags[i]).parent().removeClass();
			}
		}
	}
}

function alertMessage(msg){
	$("#message").html(msg);
	$('#messageDialog').modal({
		backdrop : true,
		keyboard : true,
		show : true
	});
}

function removeRightBody(){
	$("#rightPanel").html("");
}