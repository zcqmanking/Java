var serverDate;
function $id(id){
	return document.getElementById(id);
}

function trim(str)
{
	return str.replace(/^\s+|\s+$/g, ""); 
}

//显示提示信息的小窗口
function showMsg(content){
	var top = (document.body.clientHeight - 300)/2 + document.body.scrollTop;
	var left = (document.body.clientWidth - 220)/2 + document.body.scrollLeft;
	$("#showMsg").css({"top":top,"left":left});
	$("#showMsg").html(content);
	$("#showMsg").fadeIn(500);
	$("#showMsg").fadeOut(4000);
}

function getServerTime(){
	$.get("serverTime.jsp", function(result){
		result = trim(result);
		serverDate = result;
	});
}

/**
 * 判断滚动条是否到达了底部
 */
function reachBottom() { 
     var scrollTop = 0;
     var clientHeight = 0;
     var scrollHeight = 0;
     if (document.documentElement && document.documentElement.scrollTop) {
         scrollTop = document.documentElement.scrollTop;
     } else if (document.body) {
         scrollTop = document.body.scrollTop;
     }
     if (document.body.clientHeight && document.documentElement.clientHeight) {
         clientHeight = (document.body.clientHeight < document.documentElement.clientHeight) ? document.body.clientHeight: document.documentElement.clientHeight;
     } else {
         clientHeight = (document.body.clientHeight > document.documentElement.clientHeight) ? document.body.clientHeight: document.documentElement.clientHeight;
     }
     scrollHeight = Math.max(document.body.scrollHeight, document.documentElement.scrollHeight);
	 if (scrollTop + clientHeight == scrollHeight) {
		 return true;
     } else {
         return false;
     }
 }

/**
 * 显示所有评论
 * @param sid 活动的ID
 */
function showAllComment(sid){
	var pram = "";
	pram += "shareId=";
	pram += sid;
	
	var divId = "#commentList" + sid;

	$.ajax({
		type: "post",
		cache: false,
		url: "comment.do?method=getAll",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("拉取评论内容失败！请刷新重试！");
		},
		success: function(data){
			data = trim(data);
			$(divId).html(data);
			$(divId).slideDown();
		}
	});
}

/**
 * 将指定的删除标记显示或隐藏
 */
function showDel(obj,flag){
	var display = "block";
	if(flag == false)
		display = "none";
	obj.firstChild.style.display = display;
}

/**
 * 删除指定评论
 * @param scId 评论ID
 */
function delComment(shareId,scId){
	if(confirm("确定要删除该评论？") == false){
		return;
	}
	var pram = "";
	pram += "scId=";
	pram += scId;
	
	var divId = "#comment" + scId;
	var cntId = "#commentCnt" + shareId;

	$.ajax({
		type: "post",
		cache: false,
		url: "comment.do?method=del",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("删除评论内容失败！请刷新重试！");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){
				showMsg("删除评论成功！");
				$(divId).hide(1000);
				$(cntId).html(parseInt($(cntId).html())-1);
			}else if(data == "Del"){
				showMsg("要删除的评论可能已经被删除！");
				$(divId).hide(1000);
				$(cntId).html(parseInt($(cntId).html())-1);
			}else{
				showMsg("删除评论异常！请刷新重试");
			}
		}
	});
}