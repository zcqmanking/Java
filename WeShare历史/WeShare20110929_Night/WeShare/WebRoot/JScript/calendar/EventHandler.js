function EventHandler()
{
	var functions=new Array();
	var run=function (){
		var ret;
		for(var i=0;i<functions.length;i++){
			if(functions[i].apply(this,arguments)===false)
				ret=false;
		}
		return ret;
	}
	run["+="]=function(newFunction){
		if(newFunction instanceof Function)
		{
			functions.splice(0,1,newFunction);	//替换原来的元素
//			for(var i=0;i<functions.length;i++){
//				if(functions[i]==newFunction)return;
//			}
//			functions.push(newFunction);
		}
	}
	run["-="]=function(theFunction){
		for(var i=0;i<functions.length;i++){
			if(functions[i]==theFunction)functions.splice(i,1);
		}
	}
	run.view=function(){
		var tmp=function(){};
		tmp.prototype=functions;
		return Array.prototype.slice.apply(new tmp);
	}
	return run;
}