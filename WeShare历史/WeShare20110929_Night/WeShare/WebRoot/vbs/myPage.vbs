'''获取搜索结果
Function addShare(kw)
	dim shareInfo,oReq 
	shareInfo = URLEncoding(kw)
	set oReq = CreateObject("MSXML2.XMLHTTP") 
	oReq.open "POST","addShare.do",false 
	oReq.setRequestHeader "Content-Length",Len(shareInfo) 
	oReq.setRequestHeader "CONTENT-TYPE","application/x-www-form-urlencoded" 
	oReq.send shareInfo 
	document.getElementById("lastActiveDiv").innerHTML = bytes2BSTR(oReq.responseBody)
End Function

'''获取搜索结果的指定页数的内容
Function getPageResult(reqStr)
	dim strA,oReq 
	strA = URLEncoding(reqStr) 
	set oReq = CreateObject("MSXML2.XMLHTTP") 
	oReq.open "POST","getData.asp",false 
	oReq.setRequestHeader "Content-Length",Len(strA) 
	oReq.setRequestHeader "CONTENT-TYPE","application/x-www-form-urlencoded" 
	oReq.send strA 
	document.getElementById("result").innerHTML = bytes2BSTR(oReq.responseBody) 
End Function

'''提交数据添加词条
Function addData()
	dim strA,oReq,content
	strA = URLEncoding("nihongo=" & document.getElementById("nihongo").value & "&yomikata=" & document.getElementById("yomikata").value & "&eigo=" & document.getElementById("eigo").value & "&tyuugokugo=" & document.getElementById("tyuugokugo").value & "&tyuu=" & document.getElementById("tyuu").value & "&id=" & 37462 * Rnd + 32)
	set oReq = CreateObject("MSXML2.XMLHTTP") 
	oReq.open "POST","addData.asp",false
	oReq.setRequestHeader "Content-Length",Len(strA)
	oReq.setRequestHeader "If-Modified-Since",0 
	oReq.setRequestHeader "CONTENT-TYPE","application/x-www-form-urlencoded" 
	oReq.send strA
	content = bytes2BSTR(oReq.responseBody)
	if content="添加成功！" then
		document.getElementById("alm").style.color = "#00CC99"
	else
		document.getElementById("alm").style.color = "#FF0000"
	end if
	document.getElementById("alm").innerHTML = content
End Function

'''获取添加词条的Form表单
Function getAddDataPage()
	dim oReq,strA
	strA=""
	set oReq = CreateObject("MSXML2.XMLHTTP") 
	oReq.open "POST","addDataPage.asp",false 
	oReq.setRequestHeader "Content-Length",Len(strA)
	oReq.setRequestHeader "CONTENT-TYPE","application/x-www-form-urlencoded" 
	oReq.send strA 
	document.getElementById("contentText").innerHTML = bytes2BSTR(oReq.responseBody) 
End Function
