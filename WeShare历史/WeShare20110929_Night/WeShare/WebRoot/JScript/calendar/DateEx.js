/*
DateEx类
说明：以参数形式继承自Date对象 为Date对象扩展方法
方法：
    format(formatString,[fun],......)
    参数：
        formatString：格式字符串 将日期转换成所规定的格式字符串
            格式说明：
                %[x]：
                    [x]代表日期的一个部分
                %y:年
                %m:月
                %d:日
                %w:星期
                %h:小时
                %i:分
                %s:秒
                
                %[num][x]：
                    [num]代表长度 [x]意义同上 如果长度不足则用0补齐 如果长度超出[num]则将高位截断
                    
                %f[x]：
                    以自定义函数处理%[x]得到的值，自定义函数在参数列表[fun]中给出，参数中[fun]的个数应与%f[x]的数目一致
               
        
        fun：可选的，处理函数，当格式字符串中有格式符%f出现时，则在fun中取相应的函数处理
*/




function DateEx(date){
    date=date||new Date();
    date.format=function(formatString)
    {    
        var f;
        var i=0;        
        function fbuilder(n){
            return function(v){
                var s=v.toString();
                if(s.length>=n)return s.slice(s.length-n,s.length);
                if(s.length<n)return new Array(n-s.length+1).join(0)+s;
            };            
        }
        var args=arguments;
        var resault=new String();
        var _1=function(c)//状态1 是读入格式字符串的状态 
        {
            if(c!="%")//对于非%字符按原样输出 
            {
                resault+=c;
                return _1;
            }
            else//读到%时进入状态2 否则延续状态1
            {
                return _2;
            }
        };
        var _2=function(c)//状态2 是读入特殊格式字符串的状态
        {
            if(c.match(/\d/)!=null)//对于数字 构造相应处理函数 返回状态3
            {
                f=fbuilder(Number(c));
                return _3;
            }
            else if(c=="f")//对于格式符f 从参数中获取相应处理函数 返回状态3
            {
                f=args[++i];
                return _3;
            }
            else//没有特殊格式符 直接进入状态3
            {
                f=function(v){return v;}
                return _3(c);
            }
            
            
        };
        var _3=function(c)
        {
            if(c=="%")//格式符% 连续2个%将被转义为一个% 返回状态1
            {
                resault+=c;
                return _1;                
            }
            else if(c=="y")//格式符y 取出年份 返回状态1
            {
                resault+=f(date.getFullYear());
                
                return _1;
            }
            else if(c=="m")//格式符m 取出月份 返回状态1
            {
                resault+=f(date.getMonth()+1);
                return _1;
            }
            else if(c=="d")//格式符d 取出日期 返回状态1
            {
                resault+=f(date.getDate());
                return _1;
            }
            else if(c=="w")//格式符w 取出星期 返回状态1
            {
                resault+=f(date.getDay());
                return _1;
            }            
            else if(c=="h")//格式符h 取出小时 返回状态1
            {
                resault+=f(date.getHours());
                return _1;
            }
            else if(c=="i")//格式符i 取出分 返回状态1
            {
                resault+=f(date.getMinutes());
                return _1;
            }
            else if(c=="s")//格式符s 取出秒 返回状态1
            {
                resault+=f(date.getSeconds());
                return _1;
            }
            else return _1//没有合法格式符 忽略 返回状态1
        };        
        var status=_1;
        for(var i=0;i<formatString.length;i++)
        {
            status=status(formatString.charAt(i));
        }
        return resault;
    }
    return date;
}
