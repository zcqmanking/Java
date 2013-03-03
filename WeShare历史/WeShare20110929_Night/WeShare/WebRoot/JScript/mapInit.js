var infoWin;	//信息窗口
var geocoder;	//地址解析服务
var popMap;		//弹出的地图
var bounds;		//初始地图的viewport
var markerArray = [];	//标记的数组
var locNameFromInfoWin;	//信息窗口中用户输入的地名
var parentMap;			//父窗体地图

//重置父窗体地图
function resetParentMap() {
	// 默认位置的经纬度
	var centerLatLng = new google.maps.LatLng(39.962797,116.358111);//北邮
	var myOptions = {
	  zoom: 14,
	  center: centerLatLng,
	  disableDefaultUI: true,	//	禁用默认控件
	  mapTypeId: google.maps.MapTypeId.ROADMAP	//只显示默认的地图界面
	};
	
	parentMap = new google.maps.Map(window.parent.$id("map"),
		myOptions);
}

//添加标记
//position: 标记的位置
//content: 显示的信息窗口的内容
//mapFlg: 标记的所属地图
//showSingleMarker: 是否只显示一个标记，并且在信息窗口中显示按钮，只有搜索不到结果时才设置为true，同时也没有mouseout和mouseover事件
function placeMarker(position , content , mapFlg, showSingleMarker){
	//删除所有的标记
	if(showSingleMarker == true){
		delMarkerArray();
	}

	var marker = new google.maps.Marker({
		position: position,	//显示位置
		map: mapFlg,		//所属地图
		draggable: true 	//可以拖拽			
	});

	//显示信息窗口
	if(showSingleMarker == true){
		infoWin.setContent(content);
		infoWin.open(mapFlg,marker);
	}
	
//	if(showSingleMarker == false){
//		mapFlg.panTo(position); //将地图中心移动到指定位置
//	}


	if(showSingleMarker == true){
		//添加标记的click事件的监听，单击显示信息窗口，显示当前位置的经纬度。
		google.maps.event.addListener(marker, "click", function(){
			infoWin.open(mapFlg,marker);
		});
	}

	if(showSingleMarker == false){
		//添加标记的mouseover事件的监听，鼠标悬停时，显示信息窗口。
		google.maps.event.addListener(marker, "mouseover", function(){
			infoWin.open(mapFlg,marker);
		});
	
		//添加标记的mouseout事件的监听，鼠标移开时，关闭信息窗口。
		google.maps.event.addListener(marker, "mouseout", function(){
			infoWin.close();
		});
	}

	//添加标记的dragstart事件的监听，拖拽标记时，不显示信息窗口。
	google.maps.event.addListener(marker, "dragstart", function(){
		infoWin.close();
	});
	
	//添加标记的dragend事件的监听，拖拽标记结束后显示信息窗口。
	google.maps.event.addListener(marker, "dragend", function(){
		infoWin.open(mapFlg,marker);
	});
	
	//添加标记到标记的数组
	markerArray.push(marker);
}

//删除所有标记
function delMarkerArray(){
	if(markerArray){
		for(i in markerArray){
			markerArray[i].setMap(null);
		}
		markerArray.length = 0;
	}
}

//初始化弹出的地图
function initPopMap(){
	// 默认位置的经纬度
	var centerLatLng = new google.maps.LatLng(39.962797,116.358111);//北邮
	var myOptions = {
	  zoom: 14,
	  center: centerLatLng,
	  disableDefaultUI: true,	//	禁用默认控件
	  mapTypeId: google.maps.MapTypeId.ROADMAP	//只显示默认的地图界面
	};
	
	popMap = new google.maps.Map($id("popMapDiv"),myOptions);
//		bounds = map.getBounds();	//获得初始地图的viewport

	//初始化信息窗口
	infoWin = new google.maps.InfoWindow({
			content: "",
			position: new google.maps.LatLng(0,0)
	});

	var curLoc = window.parent.$id("activeLocation").value;	//获得上一次选定的地名
	var curLat = window.parent.$id("lat").value;		//获得上一次选定的经度
	var curLng = window.parent.$id("lng").value;		//获得上一次选定的纬度
	var curLatLng = new google.maps.LatLng(curLat,curLng);
	if((curLoc != "") && (curLat != "") && (curLng != "")){
		var content = "请输入地名：";
		content += "<input type='text' name='locPopMap' id='locPopMap' value='"+curLoc+"'><br />";
		content += "<input type='button' name='selectBtn' onclick='setAddr($id(\"locPopMap\").value,0);' value='选为目的地'>";
		placeMarker(curLatLng, content, popMap, true);
		popMap.setCenter(curLatLng);
	}else{
		//点击后添加一个标记，并弹出一个信息窗口，显示一个地名输入文本框和提交按钮
		clickMapEnable(true);
	}
}

//搜索地址
function searchPopMap(){
	//获取搜索关键字
	var addr = $id("locTmp").value;
	if(addr == ""){
		return;
	}

	//如果关键字不为空，则清空上次搜索结果
	clearRet();

	//取消直接点击地图选择地点的功能
	clickMapEnable(false);

	if(!geocoder){
		geocoder = new google.maps.Geocoder();
	}
	geocoder.geocode({"address": addr,"bounds": bounds},function(results,status){
		var retStr = "";
		switch(status){
			case google.maps.GeocoderStatus.OK:
				var loc;	// 结果的经纬度
				var addr;	//地点的地址
				var locName;	//地点名称
				retStr += "<div style='padding-top: 10px;margin-left:10px;'>";
				retStr += "没找到想要的结果？<span class='clearRet' onclick='clearRet();'>清空结果，猛击地图选择地点！</span>";
				//编辑搜索结果
				for( i in results){
					loc = results[i].geometry.location;
					locName = results[i].address_components[0].long_name;
					addr = results[i].formatted_address;
					placeMarker(loc, locName, popMap, false);
					retStr += "<div style='padding-top: 10px;margin-left:10px;' onmouseover='showLocation(this, ";
					retStr += "\"" + locName + "\"," + i + ");'";
					retStr += " onmouseout='resetStyle(this," + i + ");'>地点：";
					retStr += locName;
					retStr += "<br />地址：" + addr;
					retStr += "<br />";
					retStr += "<input type='button' name='selectBtn' onclick='setAddr(\"" + locName + "\"," + i + ");' ";
					retStr += "value='选为目的地'>";
					retStr += "</div>";
				}
				//地图默认显示第一个结果
				var bounds = results[0].geometry.viewport;
                popMap.fitBounds(bounds);
				
				$id("locResult").innerHTML += retStr;
				break;
			case google.maps.GeocoderStatus.ZERO_RESULTS://没有查询结果
				retStr = "<div style='padding-top: 10px;margin-left:10px;'>";
				retStr += "暂无搜索结果，请在左侧地图中单击选择您想要去的地点！";
				retStr += "</div>";
				$id("locResult").innerHTML += retStr;
				
				//点击后添加一个标记，并弹出提示窗口显示搜索的地名
				google.maps.event.addListener(popMap, "click", function(event) {
				  var currentLatLng = event.latLng;
				  var locTmp = $id("locTmp").value;
				  var content = "请输入地名：";
				  content += "<input type='text' name='locPopMap' id='locPopMap' value='"+locTmp+"'><br />";
				  content += "<input type='button' name='selectBtn' onclick='setAddr($id(\"locPopMap\").value,0);' value='选为目的地'>";
				  placeMarker(currentLatLng, content, popMap, true);
				});
	
				break;
			case google.maps.GeocoderStatus.OVER_QUERY_LIMIT:
				showMsg("您查询的次数太频繁了~喝杯咖啡歇一会儿吧~！");
				break;
			default:
				showMsg("连接服务器错误！请确认您的网络连接或者刷新本页重新尝试！");
		}
	});
}


//根据LatLng数据在地图上显示地点，如果要显示的地址不在当前视图界面中，则移动当前视图界面
function showLocation(obj,locName,markerIndex){
	obj.className = "highLightRet";
	var loc = markerArray[markerIndex].getPosition();
	moveMap(loc);	//移动地图视图以显示标记
	setMarkerInfoWin(true,locName,markerIndex);	//设置标记
}

//重置div样式
function resetStyle(obj,markerIndex){
	obj.className = "normalRet";
	setMarkerInfoWin(false,"",markerIndex);	//设置标记
}

//移动地图视图以显示标记
function moveMap(location){
	var ret;
	ret = popMap.getBounds().contains(location);
	if(ret == false){	//如果当前位置不在当前地图的视图中
		popMap.setCenter(location);
	}		
}

//设置标记和InfoWin
//flag: true,放大显示标记和InfoWin;false,还原标记并取消显示InfoWin
function setMarkerInfoWin(flag,locName,markerIndex){
	if(flag == true){
	//			markerArray[markerIndex].setIcon("大标记.png");
		if(infoWin == "" || infoWin == null){
			infoWin = new google.maps.InfoWindow({	//初始化信息窗口
				content: "",
				position: new google.maps.LatLng(0,0)
			});
		}
		infoWin.setContent(locName);
		infoWin.open(popMap,markerArray[markerIndex]);
	}else{
	//			markerArray[markerIndex].setIcon("小标记.png");
		if(infoWin != "" && infoWin != null){
			infoWin.close();
		}
	}
}

//设置最终选择好的地址
function setAddr(locName, markerIndex){
	if(locName == ""){
		showMsg("请先输入地名！");
		return;
	}
	window.parent.$id("activeLocation").value = locName;
	window.parent.$id("lat").value = markerArray[markerIndex].getPosition().lat();
	window.parent.$id("lng").value = markerArray[markerIndex].getPosition().lng();
	
	//设置父窗体的地图
	resetParentMap();
	var latlng = new google.maps.LatLng(markerArray[markerIndex].getPosition().lat(),
										markerArray[markerIndex].getPosition().lng());	//显示位置	
	//设置父窗体的地图,定位刚刚选择的地点
	var marker = new google.maps.Marker({
		position: latlng,	//显示位置
		map: parentMap,		//所属地图
		draggable: true 	//可以拖拽			
	});
	
	parentMap.panTo(latlng);		//将标记移动到地图视图中心
	
	//关闭对话框
	window.parent.$EDITORUI["edui18"]._onClick();
}

//清空搜索结果
function clearRet(){
	$id("locResult").innerHTML = "";	//清空上次搜索结果
	delMarkerArray();				//清空上次结果的所有标记
	clickMapEnable(true);
}

//设置是否可以点击地图选择地点
function clickMapEnable(flag){
	if(flag == true){
		google.maps.event.addListener(popMap, "click", function(event) {
		  delMarkerArray();
		  var currentLatLng = event.latLng;
		  var content = "请输入地名：";
		  content += "<input type='text' name='locPopMap' id='locPopMap'><br />";
		  content += "<input type='button' name='selectBtn' onclick='setAddr($id(\"locPopMap\").value,0);' value='选为目的地'>";
		  placeMarker(currentLatLng, content, popMap, true);
		});	  
	}else{
		google.maps.event.clearListeners(popMap, "click");
	}
}
google.maps.event.addDomListener(window, "load", initPopMap);