var map,mapShareList;
function initialize(){
	initPage();
	initMap();
}

function initPage(){
	
}

function initMap(){
	// 默认位置的经纬度
	var centerLatLng = new google.maps.LatLng(39.962797,116.358111);//北邮
	var myOptions = {
	  zoom: 14,
	  center: centerLatLng,
	  disableDefaultUI: true,	//	禁用默认控件
	  mapTypeId: google.maps.MapTypeId.ROADMAP	//只显示默认的地图界面
	};
	
	map = new google.maps.Map($id("map"),
		myOptions);
	var uid = $("#uid").val();
	if(uid == "" || uid == null){
		showMsg("加载用户地图信息异常～");
		return;
	}
	getRecentJoin(uid,20);
}

/**
 * 获取一定数目的最近参加过的活动
 * @param uid 用户id
 * @param cnt 数量
 */
function getRecentJoin(uid, cnt){
	var url = "getShareInfo.do?method=getRJSON&uid=";
	url += uid;
	$.getJSON(url,function(result){
		$.each(result, function(idx, item){
			var location = new google.maps.LatLng(item[4], item[5]);
			var marker = new google.maps.Marker({
				position: location,
				map: map
          	});
			var showContent = "";
			showContent += decodeURI(item[3]);
			showContent += ": ";
			showContent += decodeURI(item[1]);
			var info = new google.maps.InfoWindow({
				content: showContent
			});
			google.maps.event.addListener(marker, "mouseover", function(){
				info.open(marker.getMap(), marker);
			});
			google.maps.event.addListener(marker, "mouseout", function(){
				info.close();
			});
      	});
    });
}

/**
 * 显示日志的覆盖层
 */
function showHL(slId){
	var highLight = "#" + slId;
	$(highLight).toggle();
}

function showHLP(spId){
	var highLight = "#pic" + spId;
	$(highLight).toggle();
}

google.maps.event.addDomListener(window, "load", initialize);
