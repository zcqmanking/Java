//使用方法：
//① 显示窗口
//   Step1：调用draw_pop()函数绘制弹出的窗口
//   Step2：调用open_pop()函数显示窗口
//② 关闭窗口
//   调用close_pop()函数关闭窗口

var div_x,div_y;

//参数说明：
//title：对话框标题
//content：对话框显示的内容
//width：对话框宽度
//height：对话框高度
//closeFlag：是否显示关闭按钮。true：显示；false：不显示
function draw_pop(title,content,width,height,closeFlag)
{
	if($id("bgcolorDiv")==null)
	{
		var str;
		str="";
		str+="<div id='bgcolorDiv' style='position:absolute;top:0;left:0;filter: alpha(opacity=40); BACKGROUND-COLOR: #0000ff; text-align:center;z-index:1000;display:none'></div>";
		str+="<div id='windowDiv' style='font-size:12px;position:absolute;top:expression((body.clientHeight-550)/2);left:expression((body.clientWidth-800)/2);background-color:#dbdbdb;border:1px solid #cccccc;filter: alpha(opacity=100); text-align: center;z-index:1001;display:none'>";
		str+="<table id='windowDivTbl' height='20' bgcolor='green' onmousedown='div_x=event.x-parentNode.style.pixelLeft;div_y=event.y-parentNode.style.pixelTop;setCapture();' onmouseup='releaseCapture();' onmousemove='divMove(this.parentNode)' style='cursor:move;'>";
		str+="<tr align='center'>";
		str+="<td align='left'><span id='titleText'></span></td>";
		str+="<td align='right'><span style='cursor:hand;' onclick='close_pop();'><img src='Images/close.gif' height='15' width='15' border='0' /></span></td>";
		str+="</tr>";
		str+="</table>";
		str+="<div id='contentText' style='height:450px; width: 750px; margin-top:25px;margin-bottom:10px;text-align:center;  vertical-align:middle;filter: alpha(opacity=100);'></div>";
		str+="<span id='closeText' style='cursor:hand;display:none' onclick='close_pop();'>[关闭]</span>";
		str+="</div>";
		document.body.innerHTML+=str;
	}
	var divHeight,divWidth;
	divHeight = document.body.scrollHeight > document.body.clientHeight ? document.body.scrollHeight : document.body.clientHeight;
	divWidth = document.body.scrollWidth;
	$id("bgcolorDiv").style.height = divHeight;
	$id("bgcolorDiv").style.width = divWidth;
	$id("windowDiv").style.width = width;
	$id("windowDivTbl").style.width = width;
	$id("windowDiv").style.height = height;
	$id("titleText").innerText=title;
	$id("contentText").innerHTML=content;
	if(closeFlag==true)
	{
		$id("closeText").style.display="block";
	}else{
		$id("closeText").style.display="none";
	}
}

function open_pop()
{
	$id("bgcolorDiv").style.display="block";
	$id("windowDiv").style.display="block";
}

function close_pop()
{
	$id("bgcolorDiv").style.display="none";
	$id("windowDiv").style.display="none";
}

function divMove(obj)  //实现层的拖移
{
  if(event.button==1)
  {
    var divX=obj.clientLeft;
    var divY=obj.clientTop;
    obj.style.pixelLeft=divX+(event.x-div_x);
    obj.style.pixelTop=divY+(event.y-div_y);
  }
}
