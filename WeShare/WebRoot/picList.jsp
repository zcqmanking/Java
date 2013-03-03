<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<%@ include file="Inc/isUserLogin.jsp"%>
<html:html lang="true">
<head>
	<html:base />

	<title><%=session.getAttribute("curUserName")%>--个人主页--<%=session.getAttribute("WebName")%></title>
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="晒活动,活动,出游">
	<meta http-equiv="description" content="This is my personal page">
	<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="CSS/picList.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script type="text/javascript" src="JScript/picList.js"></script>
</head>

<body>
	<div class="body">
		<!--头部导航-->
		<div class="head">
			<!-- <img border="0" src="Images/icon.jpg" /> -->
			<ul>
				<li class="cur">
					<a href="myPage.do">首页</a>
				</li>
				<li class="line">
					|
				</li>
				<li>
					<a href="home.do">我的主页</a>
				</li>
				<li class="line">
					|
				</li>
				<li>
					<a href="myFriends.do">晒友</a>
				</li>
				<li class="line">
					|
				</li>
				<li>
					<a href="myZone.do">地盘</a>
				</li>
			</ul>
			<div class="search">
				<html:form styleClass="searchForm" action="/search" target="_self"
					method="post" onsubmit="return onSearch();">
					<html:select property="searchType" styleId="searchType"
						name="searchType" value="1">
						<html:option value="1">贴士</html:option>
						<html:option value="2">地盘</html:option>
						<html:option value="3">晒友</html:option>
					</html:select>
					<html:text property="searchKey" styleId="searchKey" />
					<html:submit property="goSearch" value="Go" />
				</html:form>
			</div>
			<span><a href="myInfo.do" target="_self">我的账号</a> </span>
		</div>
		<!-- 个人信息 -->
		<div class="personal">
			<div class="myIcon">
				<table>
					<tr>
						<td align="center" width="100">
							<input type="hidden" id="uid" value="<bean:write name='user' property='userId'/>" />
							<img border="0" src="<bean:write name='user' property='photo'/>" /><br />
							<bean:write name="user" property="userName"/>
						</td>
						<td>
							<span class="total">已发起<a href="list.do?uid=<bean:write name='user' property='userId'/>&k=s"><bean:write name="sCnt" /></a>个</span>
           					<span class="total">已参与<a href="list.do?uid=<bean:write name='user' property='userId'/>&k=j"><bean:write name="jCnt" /></a>个</span>
           					<span class="total">已围观<a href="list.do?uid=<bean:write name='user' property='userId'/>&k=v"><bean:write name="vCnt" /></a>个</span>
						</td>
					</tr>
				</table>
			</div>
		</div>
		
		<!-- 照片列表 -->
		<div class="pic">
        	<div class="picTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的足迹</div>
        	<div class="picList">
        		<logic:notEmpty name="photoes">
				<logic:iterate id="p" name="photoes">
				<div class="onePic">
					<div class="onePicTitle"><bean:write name="p" property="share.title" /></div>
					<div class="picBox" onmouseover="showHL(<bean:write name='p' property='spId' />);" onmouseout="showHL(<bean:write name='p' property='spId' />);">
						<a class="highlight" id="<bean:write name='p' property='spId' />" href="showPic.do?id=<bean:write name='p' property='spId' />" target="_blank">
							<bean:write name="p" property="updateTime" />
						</a>
						<img class="photo" src="<bean:write name="p" property="photoURL" />" />
					</div>
				</div>
				</logic:iterate>
				</logic:notEmpty>
				<logic:empty name="photoes">
				<div class="picTip">
                	还没有任何照片~
                </div>
				</logic:empty>
			</div>
      	</div>
		<!--版权信息-->
		<div class="copyRight">
			<%=session.getAttribute("CopyRight")%>
		</div>
	</div>
	<%@ include file="Inc/showMsg.jsp" %>
</body>
</html:html>
