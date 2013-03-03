function StoryBoard(Duration,onfinish,flag)
{
	onfinish=onfinish||function(){};
	var r=new Array();
	r.appendAnimation=function(animation)
	{
		if(animation instanceof Animation)
			this.push(animation);
	}
	r.removeAnimation=function(animation)
	{
		for(var i=0;i<r.length;i++)
		{
			if(r[i]==animation)
			{
				r.splice(i,1);
				break;
			}
		}
	}
	r.start=function(){		
		for(var i=0;i<r.length;i++)
		{
			r[i].Begin();
		}
		setTimeout(
			function(){
				for(var i=0;i<r.length;i++)
				{
					r[i].Stop(Duration);
				}
				onfinish();
			},
			Duration
		);

	}
	return r;
 
}
