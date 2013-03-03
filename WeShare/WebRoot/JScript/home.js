var map,mapShareList;
function initialize(){
	initPage();
	initMap();
}

function initPage(){
	
}

function initMap(){
	// Ĭ��λ�õľ�γ��
	var centerLatLng = new google.maps.LatLng(39.962797,116.358111);//����
	var myOptions = {
	  zoom: 14,
	  center: centerLatLng,
	  disableDefaultUI: true,	//	����Ĭ�Ͽؼ�
	  mapTypeId: google.maps.MapTypeId.ROADMAP	//ֻ��ʾĬ�ϵĵ�ͼ����
	};
	
	map = new google.maps.Map($id("map"),
		myOptions);
	var uid = $("#uid").val();
	if(uid == "" || uid == null){
		showMsg("�����û���ͼ��Ϣ�쳣��");
		return;
	}
	getRecentJoin(uid,20);
}

/**
 * ��ȡһ����Ŀ������μӹ��Ļ
 * @param uid �û�id
 * @param cnt ����
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
 * ��ʾ��־�ĸ��ǲ�
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
