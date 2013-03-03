var editor = null;
var defaultType;	//保存页面初始化时的类别
var c;
var calendar;
var loadTime = 1;		//新鲜事加载次数

//设置活动的可见区域
function setSchoolId(all,owner){
	if($id("pbArea").checked == true){
		$id("schoolId").value = all;
	}else{
		$id("schoolId").value = owner;
	}
}

function cntOnMouseOver(obj){
	obj.style.textDecoration = "underline";
}

function cntOnMouseOut(obj){
	obj.style.textDecoration = "none";
}

function onSearch(){
	if(($id("searchKey").value == null) || 
		($id("searchKey").value == "") || 
		($id("searchType").value == null) ||
		($id("searchType").value == "")){
		return false;
	}
	return true;
}

function setShareType(obj,value){
	// 设置活动类型
	$id("typeValue").value=value;
	// 设置类型Class
	var i;
	var nodeLength = $id("activeType").childNodes.length;
	for(i = 0; i < nodeLength; i++)
	{
		//只有类别的标签设置，分割线所属的标签不设置
		if ( i % 2 != 0 ){
			$id("activeType").childNodes[i].className = "spanLink";
		}
	}
	obj.className = "selectedType";
}

//初始化
function initialize(){
	initPage();
	initMap();
	initEditor();
}

function initPage(){
	$(".selectedType").click();	//触发click事件，设置默认值
	initEvent();
	initCalendar();
}

function initCalendar(){
	c=new Calendar(new Date,2);
	calendar=new BorderedDiv(
		c,
		[
			["Images/calendar/t1.png","Images/calendar/t2.png","Images/calendar/t3.png"],
			["Images/calendar/l1.png",0,"Images/calendar/r1.png"],
			["Images/calendar/l2.png","Images/calendar/b1.png","Images/calendar/r2.png"]
		],
		{
			"top":"35px",
			"left":"15px",
			"bottom":"15px",
			"right":"15px"
		}
	);
	calendar.style.display="none";
    document.body.appendChild(calendar);
}

//清空当前选择的地址
function clearLocation(){
	$id("activeLocation").value = "";
	$id("lat").value = "";
	$id("lng").value = "";
}

//初始化地图
function initMap() {
	// 默认位置的经纬度
	var centerLatLng = new google.maps.LatLng(39.962797,116.358111);//北邮
	var myOptions = {
	  zoom: 14,
	  center: centerLatLng,
	  disableDefaultUI: true,	//	禁用默认控件
	  mapTypeId: google.maps.MapTypeId.ROADMAP	//只显示默认的地图界面
	};
	
	var map = new google.maps.Map($id("map"),
		myOptions);
}

//检查发布活动的表单
function checkASForm(){
	var typeValue = $id("typeValue").value;
	if(typeValue == "" || typeValue == null){
		showMsg("活动类别不能为空！");
		return;
	}
	var startTime = $id("startTime").value;
	var endTime = $id("endTime").value;
	var location = $id("activeLocation").value;
	var lat = $id("lat").value;
	var lng = $id("lng").value;
	if(location == "" || location == null ||
	   lat == "" || lat == null ||
	   lng == "" || lng == null){
		showMsg("无法定位活动地点！请重新选择活动地点！");
		return;
	}
	
	if(editor.hasContents() == false){
		showMsg("详细内容不能为空~写点啥吧~~");
		return;
	}
	var detail = editor.getContent();
	var schoolId = $id("schoolId").value;
	
	var pram;
	pram = "typeValue=";
	pram += typeValue;
	pram += "&startTime=";
	pram += startTime;
	pram += "&endTime=";
	pram += endTime;
	pram += "&activeLocation=";
	pram += location;
	pram += "&lat=";
	pram += lat;
	pram += "&lng=";
	pram += lng;
	pram += "&activeDetail=";
	pram += detail;
	pram += "&schoolId=";
	pram += schoolId;

	addShare(pram);
}

//利用jquery添加数据
function addShare(sendData){
	$.ajax({
		type: "post",
		cache: false,
		url: "addShare.do",
		data: sendData,
		timeout: 50000,
		error: function(){
			showMsg("请求失败!请检查网络连接是否正确!");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){	//发布成功
				//顶部显示刚刚发布的活动
				showCurActive();
				//新鲜事部分增加此信息的显示
				showNewActiveList();
				//清空发布消息的Form
				clearASForm();
				
				showMsg("发布成功！");
			}else{				//发布失败
				showMsg("发布失败！请重试！");
			}
		}
	});
}

//显示刚刚发布完的最新活动
function showCurActive(){

	//先隐藏上一次的活动消息
	$("#lastActiveDiv").fadeOut();

	var content = "";
	content += "【";
	content += $(".selectedType").html();	//活动类别
	content += "】";
	content += "【";
	content += $("#startTime").val();
	content += "~";
	content += $("#endTime").val();
	content += "】";
	content += "【";
	content += $("#activeLocation").val();
	content += "】";
	$(".currentActiveText").html(content);		//设置活动类别、起止时间、活动地点
	
	content = editor.getContent();
	$(".currentActiveDetail").html(content);	//设置详细信息
	
	$(".currentActiveJoinCnt").html("0");		//设置活动报名人数
	
	//显示活动
	$("#lastActiveDiv").fadeIn(4000);
}


//新鲜事中追加显示
function showNewActiveList(){
	
}

//清空发布活动的表单
function clearASForm(){
	$("#typeValue").val(defaultType);
	$("#startTime").val(defaultType);
	$("#endTime").val(defaultType);
	$("#activeLocation").val("");
	$("#lat").val("");
	$("#lng").val("");
	editor.setContent("");
}

//初始化各个标签的事件
function initEvent(){
	//发布活动的Form提交事件
	$("#addActiveForm").submit(function(event){
		checkASForm();
		event.preventDefault();		//取消form默认的提交行为
	});
	
	//设置时间控件的onFocus事件
	$("#startTime").focus(function(){
		var s = $("#startTime");
		calendar.style.display = "block";
		calendar.style.left = $id("startTime").getBoundingClientRect().left + document.body.scrollLeft;
		calendar.style.top = $id("startTime").getBoundingClientRect().bottom + document.body.scrollTop;
		c.onSelect['+='](function(v){
			s.val(new DateEx(v).format("%4y-%2m-%2d"));
			calendar.style.display = "none";
		});
	});
	$("#endTime").focus(function(){
		var e = $("#endTime");
		calendar.style.display = "block";
		calendar.style.left = $id("endTime").getBoundingClientRect().left + document.body.scrollLeft;
		calendar.style.top = $id("endTime").getBoundingClientRect().bottom + document.body.scrollTop;
		c.onSelect['+='](function(v){
			e.val(new DateEx(v).format("%4y-%2m-%2d"));
			calendar.style.display = "none";
		});
	});
	
	//任意点击时关闭该控件
	$("body").click(function(event){
		var obj = event.srcElement ? event.srcElement : event.target;
		if (obj.id != "startTime"
			&& obj.id != "endTime" 
			&& obj.getAttribute("author") != "zhaocq")
		    calendar.style.display = "none";
	});
	//按ESC键关闭该控件
	$("body").keypress(function(event){
		if( event.keyCode == 27 ){
			calendar.style.display = "none";
		}
	});
	
	window.onscroll = loadMore;

}


/**
 * 作用：结束报名<br/>
 * 参数：<br/>
 * status,活动当前的状态。0,报名阶段；1,结束报名出发阶段；2,结束活动。<br/>
 * sid,活动的ID
*/
function finish(status,sid){
	var newStatus = status +1;
	var pram = "";
	pram += "status=";
	pram += newStatus;
	pram += "&sid=";
	pram += sid;
	
	$.ajax({
		type: "post",
		cache: false,
		url: "modifyShare.do?method=changeStatus",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("请求失败!请检查网络连接是否正确!");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){	//修改成功
				//修改按钮状态
				chgBtnSt(newStatus,sid);
				var msg = "";
				msg = (status == 0) ? "已结束报名" : "已结束活动";
				showMsg(msg);
				//给所有人发送一个邮件
				sendMailToAll(newStatus,sid);
			}else{				//发布失败
				showMsg("状态修改失败！请重试！");
			}
		}
	});
}

function chgBtnSt(status,sid){
	var btnText = (status == 1) ? "结束活动" : "活动已结束";
	$("#finishBtn").html(btnText);
	
	//需要修改按钮的样式
	if(status == 1){
		$("#finishBtn").removeClass().addClass("finishActiveBtn");
		$id("finishBtn").onclick=function(){
			finish(status,sid);
		};
	}else if(status == 2){
		$("#finishBtn").removeClass().addClass("finishedActiveBtn");
		$id("finishBtn").onclick=function(){};	//清空onclick事件
	}
}

/**
 * 给所有参加了这个活动的用户发送一封邮件，
 * 提醒他们这个活动的状态已经改变
 * @param status 活动的新状态
 * @param sid 活动的ID
 */
function sendMailToAll(status,sid){
	
}

/**
 * 获取指定活动的相关人员
 * @param type 获取的列表类型。0：参与列表；1：围观列表
 * @param sid 活动的ID
 */
function getCntList(obj,type,sid){
	var pram = "";
	var urlStr = "";
	pram += "sid=";
	pram += sid;
	
	urlStr += "getShareInfo.do?method=";
	if(type == 0){
		urlStr += "getJoinList";
	}else if(type == 1){
		urlStr += "getViewList";
	}else{
		showMsg("参数错误！请重试！");
		return;
	}

	//先隐藏所有用户列表
	$("#usrListDiv").slideUp("slow");

	$.ajax({
		type: "post",
		cache: false,
		url: urlStr,
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("请求失败!请检查网络连接是否正确!");
		},
		success: function(data){
			//移除所有用户列表
			$("#usrListDiv").remove();
			//向body最后添加返回的列表信息
			//默认列表的display=none
			$("body").append(trim(data));
			//调整位置
			$id("usrListDiv").style.left = obj.getBoundingClientRect().left
											+ document.body.scrollLeft
											- 250;
			$id("usrListDiv").style.top = obj.getBoundingClientRect().bottom
											+ document.body.scrollTop;
			//显示列表
			openUsrLstDiv();
		}
	});

}

function commentBarChange(obj,f){
	if(f==0){					//获得焦点
		if(obj.rows == 1){
			obj.rows = 2;
		}
	}else if(f==1){				//失去焦点
		if(obj.value==""){
			obj.rows = 1;
		}
	}
}

function toggleShow(sid){
	var trId = "#scTr" + sid;
	$(trId).toggle();
	showAllComment(sid);
}

/**
 * 监视ctrl+enter进行提交
 * @param sid 要提交的评论所对应的活动的ID
 */
function sendMonitor(sid){
}

/**
 * 发送评论
 * @param {Object} sid
 * @return {TypeName} 
 */
function sendComment(sid){
	var txtId = "#ca" + sid;
	var comment = $(txtId).val();
	if(comment == ""){
		return;
	}
	var pram = "";
	pram += "shareId=";
	pram += sid;
	pram += "&content=";
	pram += comment;
	$.ajax({
		type: "post",
		cache: false,
		url: "comment.do?method=add",
		data: pram,
		timeout: 50000,
		error: function(){
			showMsg("请求失败!请确认评论内容是否正确输入！");
		},
		success: function(data){
			data = trim(data);
			if(data == "OK"){					//评论成功
				//清空文本框内容
				$(txtId).val("");
				$(txtId).attr("rows","1");
				
				//更新评论条数
				updateCnt(sid,2,2);
				
				//重新显示所有评论内容
				showAllComment(sid);
				
				showMsg("评论成功！");
			}else if(data == "NG"){				//评论失败
				showMsg("评论失败！请重试！");
			}else if(data == "Del"){			//评论的活动已被删除
				showMsg("您要评论的活动已被删除！");
			}else{
				showMsg("评论失败！请确认操作是否正常！");
			}
		}
	});
}

/**
 * 追加显示新的评论
 * @param content 要显示的内容
 * @param sid 活动ID
 * @param time 活动的发布时间（服务器时间）
 */
function showNewComment(content,sid,time){
	var htmlC = "";
	var tblId = "#commentList" + sid;
	htmlC += "<div class='commentBody'>";
	htmlC += "<a href='myHome.do' ";
	htmlC += "style='margin-right: 6px; height: 30px; width: 30px; background-img: url(\"";
	htmlC += $("#myPhoto").attr("src");
	htmlC += "\")' target='_blank'>";
	htmlC += "<div class='commentBox'><span class='commentAuthor'>";
	htmlC += $("#curUserId").val();
	htmlC += "</span>";
	htmlC += "<span class='commentTime'>";
	htmlC += time;
	htmlC += "</span><br />";
	htmlC += "<span class='commentDetail'>";
	htmlC += content;
	htmlC += "</span>";
	htmlC += "</div></div>";
	
	$(tblId).prepend(htmlC);
	var commentTag = "#commentList" + sid;
	trTag += " div:first";
	$(trTag).slideDown();
}

/**
 *  更新指定活动的数量
 * @param sid 活动ID
 * @param type 数量的类别。0:参与人数; 1:围观人数; 2:评论条数
 * @param method 对数量的操作方式。0:追加; 1:删除; 2:获取
 * @param show 是否显示提示信息。true:显示; false: 不显示。目前只是为了防止参与已围观的活动时可能多出来一次提示信息
 */
function updateCnt(sid,type,method,show){
	var pram = "";
	pram += "shareId=";
	pram += sid;
	pram += "&type=";
	pram += type;
	
	var cntId = "#";
	var txtId = "#";
	var txtId2 = "";
	var viewCntId = "#viewCnt" + sid;
	var viewTxtId = "#viewTxt" + sid;
	var viewTxtId2 = "viewTxt" + sid;
	if(type == 0){
		cntId += "joinCnt";
		txtId += "joinTxt";
		txtId2 += "joinTxt";
	}else if(type == 1){
		cntId += "viewCnt";
		txtId += "viewTxt";
		txtId2 += "viewTxt";
	}else if(type == 2){
		cntId += "commentCnt";
	}else{
		return;
	}
	cntId += sid;
	txtId += sid;
	txtId2 += sid;
	
	var urlStr = "cntUpdate.do?method=";
	if(method == 0){
		urlStr += "add";
	}else if(method == 1){
		urlStr += "del";
	}else if(method == 2){
		urlStr += "get";
	}else{
		return;
	}
	
	$.ajax({
		type: "post",
		cache: false,
		url: urlStr,
		data: pram,
		timeout: 50000,
		error: function(){
			if(show==true){
				showMsg("请求异常！请刷新重试！");
			}
		},
		success: function(data){
			data = trim(data);
			if(data == "NG"){
				if(show==true){
					showMsg("更新数据出现异常！请刷新重试！");
				}
			}else if(data == "Del"){
				if(show==true){
					showMsg("该活动可能已被删除！");
				}
			}else if(parseInt(data) >= 0){
				$(cntId).html(data);
				if(type == 0){
					if(method == 0){
						$(txtId).html("取消参与");
						$id(txtId2).onclick = function(){updateCnt(sid,0,1,true);};
						showMsg("参与成功！");
						//围观数据减1
						updateCnt(sid,1,1,false);
						//设置围观按钮样式不可用，屏蔽onclick
						$(viewTxtId).removeClass().addClass("clickDisable");
						$id(viewTxtId2).onclick = function(){};
					}else{
						$(txtId).html("参与");
						$id(txtId2).onclick = function(){updateCnt(sid,0,0,true);};
						showMsg("成功退出该活动！");
						//恢复围观按钮的样式，附加onclick事件
						$(viewTxtId).removeClass().addClass("spanLink");
						$id(viewTxtId2).onclick = function(){updateCnt(sid,1,0,true);};
					}
				}else if(type == 1){
					if(method == 0){
						$(txtId).html("取消围观");
						$id(txtId2).onclick = function(){updateCnt(sid,1,1,true);};
						showMsg("围观成功！");
					}else{
						$(txtId).html("围观");
						$id(txtId2).onclick = function(){updateCnt(sid,1,0,true);};
						if(show==true){
							showMsg("成功取消围观！");
						}
					}
				}else if(type == 2){
				}
			}else{
				if(show==true){
					showMsg("未知异常！请刷新重试！");
				}
			}
		}
	});
}

/**
 * 加载更多新鲜事
 */
function loadMore(){
	var reached = reachBottom();
	if(reached == true){			//滚动条到达最底端
		if(loadTime == 1){			//只加载了一次，还可以自动加载一次
			//先给出提示信息
			$(".loadingTip").html("正在加载更多新鲜事...");
			$(".loadingTip").show(1000);
			//读取下一部分数据
			loadNextPage($("#lastShareId").val());
			loadTime++;
		}else if(loadTime == 2){	//已经自动加载完了，接下来显示一个提示框提示点击加载
			$(".loadingTip").html("<span id='loadClick'>点击加载更多新鲜事...</span>");
			$("#loadClick").click(function(){loadNextPage($("#lastShareId").val());});
			$(".loadingTip").show(1000);
		}else{						//异常情况
			showMsg("请求异常！请刷新页面重试！");
		}
	}else{
		
	}
}

/**
 * 根据上一页最后一条数据的ID，显示当前页的数据
 * @param {int} lastShareId
 */
function loadNextPage(lastShareId){
	if(lastShareId == ""){
		return;
	}
	var pram = "lastShareId=" + lastShareId;
	pram += "&pageSize=";
	pram += $("#pageSize").val();
	pram += "&type=";
	pram += $("#newsType").val();
	$.ajax({
		type: "post",
		cache: false,
		url: "getNews.do?method=getNextPage",
		data: pram,
		timeout: 50000,
		error: function(){
			$(".loadingTip").html("没有更多新鲜事");
			window.onscroll = null;
		},
		success: function(data){
			data = trim(data);
			if(data == "NG"){
				$(".loadingTip").html("加载新鲜事失败！");
				window.onscroll = null;
			}else if(data == ""){
				$(".loadingTip").html("没有更多新鲜事");
				window.onscroll = null;
			}else{
				$(".loadingTip").before(data);

				//设置最新的Tip、lastShareID和firstShareID
				if($("#noMoreId").val() == 1){
					$(".loadingTip").html("没有更多新鲜事");
					window.onscroll = null;
				}else{
					$(".loadingTip").hide(1000);
				}
				$("#noMoreId").remove();
				$("#lastShareId").val($("#lsId").val());
				$("#firstShareId").val($("#fsId").val());
				$("#lsId").remove();
				$("#fsId").remove();
			}
		}
	});
}

function refreshNews(){
	//先取消当前所有新鲜事
	$(".oneActive").remove();
	$(".loadingTip").html("正在加载更多新鲜事...");
	$(".loadingTip").show(1000);
	loadNextPage(1);
	window.onscroll = loadMore;
	loadTime = 1;
}

google.maps.event.addDomListener(window, "load", initialize);













