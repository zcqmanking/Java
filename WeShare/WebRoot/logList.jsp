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
	<link rel="stylesheet" type="text/css" href="CSS/logList.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script type="text/javascript" src="JScript/logList.js"></script>
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
		
		<!-- 日志列表 -->
		<div class="log">
        	<div class="logTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的游记</div>
        	<div class="logList">
        		<logic:notEmpty name="logs">
				<logic:iterate id="l" name="logs">
				<div class="oneLog">
					<div class="oneLogTitle"><bean:write name="l" property="title" /></div>
					<div class="logBox" onmouseover="showHL(<bean:write name='l' property='slId' />);" onmouseout="showHL(<bean:write name='l' property='slId' />);">
						<a class="highlight" id="<bean:write name='l' property='slId' />" href="showLog.do?id=<bean:write name='l' property='slId' />" target="_blank">
							<bean:write name="l" property="updateTime" />
						</a>
						<bean:write name="l" property="content" />
					</div>
				</div>
				</logic:iterate>
				</logic:notEmpty>
				<logic:empty name="logs">
				<div class="logTip">
                	还没有任何游记~
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
