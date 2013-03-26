function addBeacon(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的添加页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadAddBeaconBody",
		data : {},
		error : function() {
			$("#message").html("加载信标添加面板失败，请联系管理员！！");
			$('#messageDialog').modal({
				backdrop : true,
				keyboard : true,
				show : true
			});
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

function addBeaconFileUpload() {
	if ($("#beaconFile").val() == "") {
		return;
	}

	// starting setting some animation when the ajax starts and completes
	$("#loading").ajaxStart(function() {
		$(this).show();
	}).ajaxComplete(function() {
		$(this).hide();
	});

	/*
	 * prepareing ajax file upload url: the url of script file handling the
	 * uploaded files fileElementId: the file type of input element id and it
	 * will be the index of $_FILES Array() dataType: it support json, xml
	 * secureuri:use secure protocol success: call back function when the ajax
	 * complete error: callback function when the ajax failed
	 * 
	 */
	// 取得input里面的beaconNo
	var beaconNo = $("#beaconNo").val();

	$.ajaxFileUpload({
		url : 'beacon.do?option=saveFile',
		data : {
			"beaconNo" : beaconNo
		},
		secureuri : false,
		fileElementId : 'beaconFile',
		dataType : 'json',
		success : function(data, status) {
			if (typeof (data.error) != 'undefined') {
				if (data.error != '') {
					$("#message").html(data.error);
					$('#messageDialog').modal({
						backdrop : true,
						keyboard : true,
						show : true
					});
				} else {
					$("#message").html(data.msg);
					$('#messageDialog').modal({
						backdrop : true,
						keyboard : true,
						show : true
					});
				}
			}
		},
		error : function(data, status, e) {
			alert(e);
		}
	});
	return false;
}

function removeBeacon(obj) {
	// jquery设置选中该li，其它的li取消选中状态
	changeNavigator(obj);
	// 加载右边的删除页面
	$.ajax({
		type : "post",
		url : "beacon.do?option=loadRemoveBeaconBody",
		data : {},
		error : function() {
			$("#message").html("加载信标报废面板失败，请联系管理员！！");
			$('#messageDialog').modal({
				backdrop : true,
				keyboard : true,
				show : true
			});
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

function getOneBeaconByBeaconNo() {
	var beaconNo = $("#beaconNo").val();
	if (beaconNo == "") {
		alertMessage("请输入信标号！！！");
		return;
	}
	
	//检查该beaconNo是否已经在table
	var _len = $("#tableBody tr").length+1;
	if(_len>0){
		for(var i=1;i<=_len;i++){
			if($("#beaconNoId"+i).text()==beaconNo){
				alertMessage("已经将该信标号添加到删除列表");
				return ;
			}
		}
	}
	
	
	// 根据输入的信标号查询，如果查询到，则添加到表格，
	// 没有查询到则提示没有查询结果
	$.ajax({
		type : "post",
		url : "beacon.do?option=getOneBeaconByBeaconNo",
		data : {
			"beaconNo" : beaconNo
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
					obj = beaconArray[0];
					// 插入表格
					var _len = $("#tableBody tr").length+1; 
					$("#tableBody").append(
							"<tr id='"+_len+"'><td id=idId"+_len+">" + _len+ "<input type='hidden' value='"+obj.id+"' name='beaconId[]' /></td>"
							 	   + "<td id='beaconNoId"+_len+"'>"+obj.beaconNo+"</td>"
								   + "<td><a href=\'javascript:void(0);\' onclick=\'deltr("+ _len + ")\'>删除</a></td>" + "</tr>");
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
// 删除<tr/>
function deltr(index){
    var _len = $("#tableBody tr").length;
    $("tr[id='"+index+"']").remove();// 删除当前行
    for(var i=index+1,j=_len;i<=j;i++){
    	var nextBeaconNo = $("#beaconNoId"+i).text();;
    	var nextBeaconId = $("#idId"+i).text();;
        $("tr[id=\'"+i+"\']")
            .replaceWith("<tr id="+(i-1)+">"
                            +"<td id=idId"+(i-1)+">"+(i-1)+"</td>"
                            +"<input type='hidden' value='"+nextBeaconId+"' name='beaconId[]' />"
                            + "<td id='beaconNoId"+(i-1)+"'>"+nextBeaconNo+"</td>"
                            +"<td><a href=\'javascript:void(0);\' onclick=\'deltr("+(i-1)+")\'>删除</a></td>"
                        +"</tr>");
    }    
}

function deleteBeacons(){
	var _len = $("#tableBody tr").length;
	if(_len==0){
		alertMessage("没有要删除的信标号");
	}
	var beaconArray=$("[name='beaconId[]']");
	var beaconNoIds="";
	for(var i=0;i<beaconArray.length;i++){
		var beaconId=$(beaconArray[i]).val();
		if(i>0){
			beaconNoIds+=",";
		}
		beaconNoIds+=beaconId;
	}
	
	//将id的字符串发送过去，服务器解析，然后删除
	$.ajax({
		type : "post",
		url : "beacon.do?option=deleteBeaconNo",
		data : {
			"beaconNoIds" : beaconNoIds
		},
		error : function() {
			alertMessage("删除信标出错，请联系管理员！！");
		},
		success : function(data) {
			var result = handleAJAXReturnValue(data);

			try {
				// 传回来的数据是一个页面，eval会抛出异常
				var obj=eval(result);
				if(obj!=null&& obj.length>0){
					alertMessage(obj[0].message);
					removeRightBody
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