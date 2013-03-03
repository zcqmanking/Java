function paijianCheck() {
	var dh = $("#danhao").val();
	var pjy = $("#paijianyuan").val();
	if (dh == "") {
		return false;
	}
	if(pjy == ""){
		sound(false);
		alert("派件失败！\r\n请先选择正确的派件员！");
		return false;
	}
	var param = "danhao=" + dh + "&paijianyuan=" + pjy;
	postData(param);
	return false;
}

function postData(param) {
	$.ajax( {
		type : "post",
		async : false,
		cache : false,
		url : "paijian.do",
		data : param,
		timeout : 50000,
		error : function() {
			sound(false);
			alert("派件失败！\r\n请检查网络是否连接正常！");
		},
		success : function(data) {
			data = trim(data);
			if (parseInt(data) != 1) {
				sound(false);
				alert("派件失败！\r\n请检查该运单是否已经派出！\r\n或者该运单可能还没有进港扫描！");
				return;
			}
			sound(true);
			$("#sum").html(parseInt($("#sum").html()) + 1);
			$("#danhao").val("");
		}
	});
}