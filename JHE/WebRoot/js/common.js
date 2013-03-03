function trim(str) {
	return str.replace(/^\s+|\s+$/g, "");
}

//显示提示信息的小窗口
function showMsg(content) {
	var top = (document.body.clientHeight - 300) / 2 + document.body.scrollTop;
	var left = (document.body.clientWidth - 220) / 2 + document.body.scrollLeft;
	$("#showMsg").css( {
		"top" : top,
		"left" : left
	});
	$("#showMsg").html(content);
	$("#showMsg").fadeIn(500);
	$("#showMsg").fadeOut(4000);
}

function sound(flag) {
	var url = flag == true ? "sound/ok.wav" : "sound/error.wav";
	var bg = "<bgsound id='bgs' src='" + url + "' loop=1>";
	$("#bgs").attr("src",url);
}