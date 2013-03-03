function closeUsrLstBtnOver(){
	$(".barCloseBtn").css("background-position","0 -89px");
}

function closeUsrLstBtnOut(){
	$(".barCloseBtn").css("background-position","0 -59px");
}

/**
 * 关闭活动用户列表
 */
function closeUsrLstDiv(){
	$("#usrListDiv").slideUp("slow");
}

/**
 * 显示活动用户列表
 */
function openUsrLstDiv(){
	$("#usrListDiv").slideDown("slow");
}