/**
 * 显示鼠标样式
 * @param ev event
 */
function changeCursor(ev){
	ev = ev || window.event;
	var obj = $id("curPic");
	var toLeft = obj.getBoundingClientRect().left + document.documentElement.scrollLeft;
	var toRight = obj.getBoundingClientRect().right + document.documentElement.scrollLeft;
	var objWidth = toRight - toLeft;
	var cursorPosition;
	if(ev.pageX || ev.pageY){
		cursorPosition = ev.pageX;
	}else{
		cursorPosition = ev.clientX + document.body.scrollLeft - document.body.clientLeft;
	}
	cursorPosition = cursorPosition - toLeft;
	if(cursorPosition > objWidth/2){
		obj.style.cursor = "url('Images/next.cur'),auto";
		obj.title = "点击显示下一张";
		$("#nextPre").val("1");
	}else{
		obj.style.cursor = "url('Images/pre.cur'),auto";
		obj.title = "点击显示上一张";
		$("#nextPre").val("0");
	}
}

/**
 * 显示下一张图片
 */
function showNext(){
	var flag = $("#nextPre").val();
	var url = "showPic.do?id=" + $("#picId").val() + "&m=next&nextPre=";
	url += (flag == 1) ? "1" : "0";
	$.getJSON(url, function(data){
		$("#picId").val(data[0][0]);
		$(".imgTitle").html(decodeURI(data[0][1]));
		$(".postTime").html(data[0][2]);
		$("#curPicImg").attr("src",data[0][3]);
		
		if($("#owner").val() == 1){
			if(data[0][4] == 1){
				$("#setIndex").attr("class","indexPicBtn");
				$("#setIndex").removeAttr("onclick");
			}else{
				$("#setIndex").attr("class","clickSpan");
				$("#setIndex").attr("onclick","setIndex();");
			}
		}
		$(".picCommentOne").remove();
		var str = "";
		$.each(data[1], function(idx, item){
			str = "<div class=\"picCommentOne\">";
		    str += "<table><tr><td><img src=\"";
		    str += item[2];
		    str += "\" height=\"30px\" width=\"30px\" /></td><td><div class=\"commentNameTime\">";
		    str += "<span class=\"commentName\"><a href=\"home.do?id=";  				
		    str += item[1];
		    str += "\" target=\"_blank\" >";
		    str += decodeURI(item[3]);
		    str += "</a></span>";
		    str += "<span class=\"cmntTime\">";
		    str += item[5];
		    str += "</span></div><div class=\"conmemntCotent\">";
		    str += decodeURI(item[4]);
		    str += "</div></td></tr></table></div>";
		    
		    $(".postBox").before(str);
      	});
	});
}

function postMonitor(){
	if($(".commentBar").val() == ""){
		return;
	}
}

function post(){
	if($(".commentBar").val() == ""){
		return;
	}
	var picId = $("#picId").val();
	var comment =$(".commentBar").val();
	var pram = "picId=";
	pram += picId;
	pram += "&content=";
	pram += comment;
	
	$.ajax({
		type: "post",
		cache: false,
		url: "picComment.do?m=add",
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
				var newLog = "<div class=\"picCommentOne\">";
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
				showMsg("该照片可能已经被删除！无法评论！");
			}
		}
	});
}

/**
 * 删除照片
 * @return 为了屏蔽超链接&lt;a&gt;的动作，固定返回false。
 */
function delPic(){
	var picId = $("#picId").val();
	if(picId == ""){
		return false;
	}
	if(!confirm("确定要删除此照片吗？")){
		return false;
	}
	var url = "pic.do?m=del&id=";
	url += picId;
	$.post(url, function(data){
		data = trim(data);
		if(data == "OK"){
			showMsg("删除成功！正在加载下一张照片……");
		}else if(data == "Del"){
			showMsg("删除失败！可能已经被删除！")
		}else if(data == "NG"){
			showMsg("删除照片失败！请刷新重试！");
		}
	});
}

/**
 * 设置封面
 */
function setIndex(){
	var picId = $("#picId").val();
	var pram = "id=";
	pram += picId;
	if(picId == 0 || picId == "" || picId == "undefined" || picId == null){
		return;
	}
	
	$.ajax({
		type: "post",
		cache: false,
		url: "pic.do?m=setIndex",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("设置封面失败！");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){
				showMsg("设置封面成功！");
				//屏蔽设置封面链接并改变文字提示
				//$("#setIndex").html("相册封面");
				$("#setIndex").removeAttr("onclick");
				$("#setIndex").removeClass("clickSpan");
				$("#setIndex").addClass("indexPicBtn");
			}else if (data == "NG"){
				showMsg("设置封面失败！请刷新重试");
			}else if (data == "Del"){
				showMsg("该照片可能已经被删除！无法设置封面！");
			}
		}
	});
}