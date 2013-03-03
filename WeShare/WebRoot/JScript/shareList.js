var running = false;
function loadMore() {
	var reached = reachBottom();
	if (reached == true && running == false) { //滚动条到达最底端
		running = true;
		//先给出提示信息
		$(".loadingTip").html("正在加载更多活动...");
		$(".loadingTip").show();
		//读取下一部分数据
		loadNextPage($("#lastShareId").val(), $("#uid").val());
		running = false;
	} else {

	}
}

function loadNextPage(lastShareId, userId) {
	if (lastShareId == "" || userId == "") {
		return;
	}
	var pram = "lastShareId=" + lastShareId;
	pram += "&uid=";
	pram += userId;
	pram += "&reqType=s";
	var url = "list.do?k=sNextPage&" + pram;
	$.getJSON(url, function(data) {
		if (data == "") {
			$(".loadingTip").html("加载活动失败！请刷新重试");
		} else if (data[1] == lastShareId) {
			$(".loadingTip").html("没有更多活动");
			window.onscroll = null;
		} else {
			$("#lastShareId").val(data[1]);
			var str = "";
			$.each(data[0], function(idx, item) {
				str += "<div class=\"oneSubmit\">";
				str += "<span class=\"clickSpan\" onclick=\"showDetail(";
				str += item[0];
				str += ")\">";
				str += item[1];
				str += "&nbsp;";
				str += decodeURI(item[2]);
				str += "</span><br />";
				str += "<span class=\"submitTime\">";
				str += item[3];
				str += "</span>";
				str += "<span class=\"cntlist\">";
				str += "<span class=\"cnt\">";
				str += item[4];
				str += "人</span>参与";
				str += "<span class=\"cnt\">";
				str += item[5];
				str += "人</span>围观";
				str += "<span class=\"cnt\">";
				str += item[6];
				str += "人</span>评价";
				str += "</span>";
				str += "</div>";
			});
			$(".loadingTip").before(str);
			if (data[2] == 0) {
				$(".loadingTip").html("没有更多活动");
				window.onscroll = null;
			} else {
				$(".loadingTip").hide();
			}
		}
	});
}

function showDetail(sid){
	var url = "shareDetail.do?sid=" + sid;
	url += "&uid=";
	url += $("#uid").val();
	window.location.href=url;
}

window.onscroll = loadMore;
