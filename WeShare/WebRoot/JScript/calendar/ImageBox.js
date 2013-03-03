function ImageBox(url,height,width)
{
	var ret=document.createElement("div");
	ret.style.overflow="hidden";
	ret.style.height=height;
	ret.style.width=width;
	//ret.style.background="blue";
	if(url.indexOf("png")&& (navigator.appVersion.indexOf("MSIE 6.0")>-1) )
		ret.style.filter+="progid:DXImageTransform.Microsoft.AlphaImageLoader(src=\""+url+"\",sizingMethod=\"scale\")";
	else
		ret.style.background="url(\""+url+"\")";
	return ret;
}