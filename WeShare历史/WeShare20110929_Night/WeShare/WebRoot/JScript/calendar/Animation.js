function Animation(target,targetProperty,closure,precision)
{
	closure=closure||function(x){return x;};
	precision=precision||10;
	this.handle;

	var beginTime=new Date();
	var stopTime=new Date();
	this.Begin=function(){
		beginTime=new Date();
		this.handle=setInterval(
			function(){
				var now=new Date();
				target[targetProperty]=closure(now.getTime()-beginTime.getTime());
			},
			precision
		);
        }

	this.Continue=function(){
		var now=new Date();
		beginTime.setTime(now.getTime()-stopTime.getTime()+beginTime.getTime());

		this.handle=setInterval(
			function(){
				var now=new Date();
				target[targetProperty]=closure(now.getTime()-beginTime.getTime());
			},
			precision
		);
	}

	this.Stop=function(duration){
		
		clearInterval(this.handle);

		if(duration===undefined)
		{
			stopTime=new Date();
			duration=stopTime.getTime()-beginTime.getTime();
		}
		else stopTime.setTime(beginTime.getTime()+duration)
		target[targetProperty]=closure(duration);
	}
}

