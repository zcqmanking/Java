'''��ȡ�������
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

'''��ȡ���������ָ��ҳ��������
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

'''�ύ������Ӵ���
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
	if content="��ӳɹ���" then
		document.getElementById("alm").style.color = "#00CC99"
	else
		document.getElementById("alm").style.color = "#FF0000"
	end if
	document.getElementById("alm").innerHTML = content
End Function

'''��ȡ��Ӵ�����Form��
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
