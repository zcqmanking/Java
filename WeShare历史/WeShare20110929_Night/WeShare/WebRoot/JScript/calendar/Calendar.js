function Calendar(selectedDate,type){
    var isIE = false;
    var isFF = false;
    var isSa = false;

    if ((navigator.userAgent.indexOf("MSIE")>0) && (parseInt(navigator.appVersion) >=4))isIE = true;
    if(navigator.userAgent.indexOf("Firefox")>0)isFF = true;
    if(navigator.userAgent.indexOf("Safari")>0)isSa = true;

    var container=document.createElement("div");
    container.style.cssText="display:block;overflow:hidden;height:180px;width:179px;position:relative;";
    container.className="Calendar";
    container.author="zhaocq";
    container.onselectstart=function(){return false;}    
    
    var head=document.createElement("div");
    head.style.cssText="width:179px;height:30px;overflow:hidden;text-align:center;";
    head.className="Calendar CalendarHead";
    head.author="zhaocq";
    
    var title;
    
    head.appendChild(document.createElement("span"));
    head.firstChild.appendChild(document.createTextNode("←"));
    head.firstChild.style.cssText="position:absolute;float:left;left:0px;top:0px;";
    head.firstChild.author="zhaocq";
    head.lastChild.onclick=new Function("this.parentNode.parentNode.lastChild.lastCard();");
    head.lastChild.author="zhaocq";
    
    head.appendChild(title=document.createElement("span"));
    title.style.cssText="margin:auto auto auto auto;";
    title.author="zhaocq";
//    title.onclick=new Function("this.parentNode.parentNode.lastChild.upperCard();");

    
    head.appendChild(document.createElement("span"));
    head.lastChild.appendChild(document.createTextNode("→"));
    head.lastChild.author="zhaocq";
    head.lastChild.style.cssText="position:absolute;float:right;right:0px;top:0px;";
    head.lastChild.onclick=new Function("this.parentNode.parentNode.lastChild.nextCard();");

    container.appendChild(head);
    
    
    var body=document.createElement("div");
    body.style.cssText="width:179px;height:150px;overflow:hidden;";
    body.className="Calendar CalendarBody";
    body.author="zhaocq";
    container.appendChild(body);    
    container.selectedDate=selectedDate||new Date();

    
    var months=new String("1月,2月,3月,4月,5月,6月,7月,8月,9月,10月,11月,12月").split(",");
        
    function DayPicker(selectedDate)
    {
        var container=document.createElement("div");
        container.style.cssText="position:absolute;left:0;width:179px;height:150px;overflow:hidden;text-align:center";
        container.author="zhaocq";
        var month=selectedDate.getMonth();
        container.title=selectedDate.getYear() + "年 "+ months[month];
        var date=new Date();
        date.setTime(selectedDate.getTime());
        
        while(date.getDate()!=1)
        {
            date.setHours(date.getHours()-24);
        }
        while(date.getDay()!=0)
        {
            date.setHours(date.getHours()-24);
        }
        var datepicker=document.createElement("table");
        datepicker.style.cssText="width:179px;height:150px;overflow:hidden;text-align:center;font-size:15px;";
        datepicker.author="zhaocq";
        datepicker.appendChild(document.createElement("tbody"));
        datepicker.cellSpacing="0";
        datepicker.border="0";
        
        datepicker.firstChild.appendChild(document.createElement("tr"));
        datepicker.firstChild.author="zhaocq";
        datepicker.firstChild.lastChild.author="zhaocq";
        var weekdays=new String("日一二三四五六");
        for(var days=0;days<7;days++){
            datepicker.firstChild.lastChild.appendChild(document.createElement("td"));
            datepicker.firstChild.lastChild.lastChild.appendChild(document.createTextNode(weekdays.charAt(days)));
            datepicker.firstChild.lastChild.lastChild.author="zhaocq";
        }
		var curDay = 0;//当前月份的当前日期
		var flag = false;
        for(var weeks=0;weeks<6;weeks++)
        {
            datepicker.firstChild.appendChild(document.createElement("tr"));
            datepicker.firstChild.lastChild.author="zhaocq";
            for(var days=0;days<7;days++)
            {
                datepicker.firstChild.lastChild.appendChild(document.createElement("td"));
                datepicker.firstChild.lastChild.lastChild.appendChild(document.createTextNode(date.getDate().toString()));
				datepicker.firstChild.lastChild.lastChild.author="zhaocq";
                //getServerTime();
				//var now = serverDate;
				var now = $("#nowDate").val();
				var curDateArr = now.split("-");
				var curMonth = date.getMonth()+1;
				if(selectedDate.getYear() == curDateArr[0] && curMonth==curDateArr[1]){
					if(flag == false){
						curDay = 1;
						flag = true;
					}else{
						curDay++;
					}
				}
                if(date.getMonth()==month)
                {
					if(selectedDate.getYear() == curDateArr[0] && curMonth == curDateArr[1]){
						if(curDay >= curDateArr[2]){
							datepicker.firstChild.lastChild.lastChild.className="Calendar CalendarCell";
							datepicker.firstChild.lastChild.lastChild.type="Calendar CalendarCell"
							datepicker.firstChild.lastChild.lastChild.onmouseover=new Function("this.className=\"Calendar CalendarHoverCell\"");
							datepicker.firstChild.lastChild.lastChild.onmouseout=new Function("this.className=this.type");
							datepicker.firstChild.lastChild.lastChild.value=new Date();
							datepicker.firstChild.lastChild.lastChild.value.setTime(date.getTime());
							datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.onSelect(this.value)");
						}else{
							datepicker.firstChild.lastChild.lastChild.className="Calendar CalendarDisabledCell";
							datepicker.firstChild.lastChild.lastChild.type="Calendar CalendarDisabledCell";
							if(date>selectedDate)datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.nextCard()");
							else datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.lastCard()");
						}
					}else{
						datepicker.firstChild.lastChild.lastChild.className="Calendar CalendarCell";
						datepicker.firstChild.lastChild.lastChild.type="Calendar CalendarCell"
						datepicker.firstChild.lastChild.lastChild.onmouseover=new Function("this.className=\"Calendar CalendarHoverCell\"");
						datepicker.firstChild.lastChild.lastChild.onmouseout=new Function("this.className=this.type");
						datepicker.firstChild.lastChild.lastChild.value=new Date();
						datepicker.firstChild.lastChild.lastChild.value.setTime(date.getTime());
						datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.parentNode.onSelect(this.value)");
					}
                }
                else 
                {
                    datepicker.firstChild.lastChild.lastChild.className="Calendar CalendarDisabledCell";
                    datepicker.firstChild.lastChild.lastChild.type="Calendar CalendarDisabledCell";
                    if(date>selectedDate)datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.nextCard()");
                    else datepicker.firstChild.lastChild.lastChild.onclick=new Function("this.parentNode.parentNode.parentNode.parentNode.parentNode.lastCard()");
                }                
                date.setHours(date.getHours()+24);
            }
        }
        //container.selectedDate.setMonth();
        //container.onSelect=new EventHandler();
        
        //container.onSelect["+="](function(v){alert(v)});       
        
        container.appendChild(datepicker);
        
        
        Picker.call(container);
        return container;
    }
    
    
    function Picker()
    {
        var d=500;
        this.slideinLeft=new StoryBoard(d);
        this.slideinLeft.appendAnimation(new Animation(this.style,"left",function(t){return (179-Math.floor(t/d*179))+"px"}));
        this.slideoutLeft=new StoryBoard(d);
        this.slideoutLeft.appendAnimation(new Animation(this.style,"left",function(t){return (-Math.floor(t/d*179))+"px"}));
        
        this.slideinRight=new StoryBoard(d);
        this.slideinRight.appendAnimation(new Animation(this.style,"left",function(t){return (-179+Math.floor(t/d*179))+"px"}));
        this.slideoutRight=new StoryBoard(d);
        this.slideoutRight.appendAnimation(new Animation(this.style,"left",function(t){return (Math.floor(t/d*179))+"px"}));

        this.hide=new StoryBoard(d);
        if(this.style.opacity!==undefined)
            this.hide.appendAnimation(new Animation(this.style,"opacity",function(t){return (d-t)/d}));
        else if(isIE)
            this.hide.appendAnimation(new Animation(this.style,"filter",function(t){return "alpha(opacity="+Math.floor((d-t)/5)+")";}));
        else if(isFF)
            this.hide.appendAnimation(new Animation(this.style,"MozOpacity",function(t){return (d-t)/d}));
        else if(isSa)
            this.hide.appendAnimation(new Animation(this.style,"KHTMLOpacity",function(t){return (d-t)/d}));
            
        this.show=new StoryBoard(d);
        if(this.style.opacity!==undefined)
            this.show.appendAnimation(new Animation(this.style,"opacity",function(t){return (t)/d}));
        else if(isIE)
            this.show.appendAnimation(new Animation(this.style,"filter",function(t){return "alpha(opacity="+Math.floor((t)/d*100)+")";}));
        else if(isFF)
            this.show.appendAnimation(new Animation(this.style,"MozOpacity",function(t){return (t)/d}));
        else if(isSa)
            this.show.appendAnimation(new Animation(this.style,"KHTMLOpacity",function(t){return (t)/d}));       
    }
    function Opacity(){
        if(this.style.opacity!==undefined)
            this.style.opacity=0;
        else if(isIE)
            this.style.filter="alpha(opacity=0)";
        else if(isFF)
            this.style.MozOpacity=0;
        else if(isSa)
            this.style.KHTMLOpacity=0;
    }
    
    body.Card=[DayPicker];
//    body.Card=[DayPicker,MonthPicker,YearPicker,TenyearPicker,HandredyearPicker];
//    body.Type=type||0;
//    body.appendChild(new body.Card[body.Type](container.selectedDate));
    body.appendChild(new body.Card[0](container.selectedDate));
    title.innerHTML=body.firstChild.title;

    
    with(Calendar.events)
    {
        body.nextCard=nextCardBuilder(title,Opacity);   
        body.lastCard=lastCardBuilder(title,Opacity);
    }
    //body.firstChild.hide.start();
    container.onSelect=new EventHandler();
    //container.onSelect["+="](function(v){alert(v)});
    return container;
}
Calendar.events={};
Calendar.events.lastCardBuilder=function(title,Opacity){
    return function(){
		var selectedYear = this.parentNode.selectedDate.getYear();
		var selectedMonth = this.parentNode.selectedDate.getMonth();
		var selectedDay =  this.parentNode.selectedDate.getDay();
		//getServerTime();
		//var now = serverDate;
		var now = "2011-09-13";
		var curDateArr = now.split("-");
		if((selectedYear < curDateArr[0]) ||				//不显示小于当前时间的月份
			(selectedYear == curDateArr[0] &&
			 selectedMonth < curDateArr[1])){
		}else{
			this.parentNode.selectedDate.setMonth(this.parentNode.selectedDate.getMonth()-1);
			
			this.appendChild(new this.Card[0](this.parentNode.selectedDate));
			title.innerHTML=this.lastChild.title;
			this.lastChild.slideinRight.start();
			this.firstChild.slideoutRight.start();
			
			var me=this;
			setTimeout(function(){me.removeChild(me.firstChild);},500);
		}
    }
}
Calendar.events.nextCardBuilder=function(title,Opacity){
    return function(){
        this.parentNode.selectedDate.setMonth(this.parentNode.selectedDate.getMonth()+1);
        
        this.appendChild(new this.Card[0](this.parentNode.selectedDate));
        title.innerHTML=this.lastChild.title;
        this.lastChild.slideinLeft.start();
        this.firstChild.slideoutLeft.start();        
        
        var me=this;     
        setTimeout(function(){me.removeChild(me.firstChild);},500);
    }
}