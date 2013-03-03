function jingangCheck() {
	var dh = $("#danhao").val();
	if (dh == "") {
		return false;
	}
	var param = "danhao=" + dh;
	postData(param);
	return false;
}

function postData(param) {
	$.ajax( {
		type : "post",
		async : false,
		cache : false,
		url : "jingang.do",
		data : param,
		timeout : 50000,
		error : function() {
			sound(false);
			alert("运单录入失败！\r\n请检查网络是否连接正常！");
		},
		success : function(data) {
			data = trim(data);
			if (parseInt(data) != 1) {
				sound(false);
				alert("运单录入失败！\r\n请检查该运单是否已经录入！");
				return;
			}
			sound(true);
			$("#sum").html(parseInt($("#sum").html()) + 1);
			$("#danhao").val("");
		}
	});
}