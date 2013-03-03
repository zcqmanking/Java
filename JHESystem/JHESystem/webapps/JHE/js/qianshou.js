function qianshouCheck() {
	var dh = $("#danhao").val();
	var qsr = $("#qianshouren").val();
	if (dh == "") {
		return false;
	}
	//	if(qsr == ""){
	//		alert("签收失败！\r\n请填写正确的签收人！");
	//		return false;
	//	}
	var param = "danhao=" + dh + "&qianshouren=" + qsr;
	postData(param);
	return false;
}

function postData(param) {
	$.ajax( {
		type : "post",
		async : false,
		cache : false,
		url : "qianshou.do",
		data : param,
		timeout : 50000,
		error : function() {
			sound(false);
			alert("签收失败！\r\n请检查网络是否连接正常！");
		},
		success : function(data) {
			data = trim(data);
			if (parseInt(data) != 1) {
				sound(false);
				alert("签收失败！\r\n请检查该运单是否已经签收！\r\n或者该运单可能还没有派件扫描！");
				return;
			}
			sound(true);
			$("#sum").html(parseInt($("#sum").html()) + 1);
			$("#danhao").val("");
			$("#qianshouren").val("");
			$("#danhao").focus();
		}
	});
}

function check(evt) {
	alert("test");
	var evt = evt ? evt : (window.event ? window.event : null);//兼容IE和FF
	if (evt.keyCode == 13) {
		$("#qianshouForm").submit();
	}
}