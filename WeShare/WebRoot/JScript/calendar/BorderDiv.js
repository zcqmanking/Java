function BorderedDiv(content,images,border)
{
	var container=document.createElement("div");
	container.style.width=parseInt(border.left)+parseInt(content.style.width)+parseInt(border.right);
	//container.style.border="solid 1px green";
	container.style.position="absolute";
	container.style.zIndex="65534";
	container.id="calendarDiv";
	container.author="zhaocq";

	var height=[border.top,content.style.height,border.bottom];
	var width=[border.left,content.style.width,border.right];
	var flt=["left","left","left"];
	for(var x=0;x<3;x++)
	{
		var line=document.createElement("div");
		container.appendChild(line);
		line.author="zhaocq";
		//line.style.border="solid 1px green";
		line.style.height=height[x];
		for(var y=0;y<3;y++)
		{
			if(x!=1||y!=1)
				var curr=new ImageBox(images[x][y],height[x],width[y]);
			else
				curr=content;

			if(navigator.appName==("Microsoft Internet Explorer"))curr.style.styleFloat=flt[y];
			else curr.style.cssFloat="left";
			curr.style.overflow="hidden";
			curr.author="zhaocq";
			line.appendChild(curr);
		
		}
	}
	return container;
}