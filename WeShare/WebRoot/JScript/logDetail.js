function postMonitor(){
	if($(".commentBar").val() == ""){
		return;
	}
}

function post(){
	if($(".commentBar").val() == ""){
		return;
	}
	var logId = $("#logId").val();
	var comment =$(".commentBar").val();
	var pram = "logId=";
	pram += logId;
	pram += "&content=";
	pram += comment;
	
	$.ajax({
		type: "post",
		cache: false,
		url: "logComment.do?m=add",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("添加评论失败！");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){
				showMsg("评论成功！");
				//清空输入框中内容
				$(".commentBar").val("");
				//加载最新的评论
				var newLog = "<div class=\"logCommentOne\">";
				newLog += "<table>";
				newLog += "<tr>";
				newLog += "<td>";
				newLog += "<img src=\"";
				newLog += $("#curUserPhoto").val();
				newLog += "\" height=\"30px\" width=\"30px\" />";
				newLog += "</td>";
				newLog += "<td>";
				newLog += "<div class=\"commentNameTime\">";
				newLog += "<span class=\"commentName\">";
				newLog += "<a href=\"home.do?id=";
				newLog += uid;
				newLog += "\" target=\"_blank\" >";
				newLog += $("#curUserName").val();
				newLog += "</a></span>";
				newLog += "<span class=\"cmntTime\">刚刚更新</span>";
				newLog += "</div>";
				newLog += "<div class=\"conmemntCotent\">";
				newLog += comment;
				newLog += "</div>";
				newLog += "</td>";
				newLog += "</tr>";
				newLog += "</table>";
				newLog += "</div>";
				
				$(".postBox").before(newLog);
			}else if (data == "NG"){
				showMsg("评论添加失败！请刷新重试");
			}else if (data == "Del"){
				showMsg("该日志已经被删除！无法评论！");
			}
		}
	});
}

function delLog(logId){
	if(logId == ""){
		return;
	}
	if(!confirm("确定要删除此文件吗？")){
		return;
	}
	var url = "log.do?m=del";
	var param = "id=" + logId;
	$.post(url, param, function(data){
		data = trim(data);
		if(data == "OK"){
			showMsg("删除成功！正在转向日志列表……");
			setTimeout("go2List()",1200);
		}else if(data == "Del"){
			showMsg("该日志已经被删除！正在转向日志列表……")
			setTimeout("go2List()",1200);
		}
	});
}

function go2List(){
	var url = "list.do?uid=";
	url += $("#uid").val();
	url += "&k=l";
	window.location.href=url;	
}
