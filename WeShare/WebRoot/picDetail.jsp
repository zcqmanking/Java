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
	<link rel="stylesheet" type="text/css" href="CSS/picDetail.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script type="text/javascript" src="JScript/picDetail.js"></script>
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
		<logic:equal value="0" name="pic" property="spId">
		<div class="picTip">此照片可能已经被删除！</div>
		</logic:equal>
		<!-- 个人信息 -->
		<logic:notEqual value="0" name="pic" property="spId">
		<div class="personalInfo">
			<input type="hidden" id="curUserName" value="<%=session.getAttribute("curUserName") %>" />
			<input type="hidden" id="curUserId" value="<%=session.getAttribute("curUserId") %>" />
			<input type="hidden" id="curUserPhoto" value="<%=session.getAttribute("curUserIcon") %>" />
			<input type="hidden" id="uid" value="<bean:write name='pic' property='user.userId'/>" />
			<input type="hidden" id="owner" value="<bean:write name='owner' />" />
			<img border="0" src="<bean:write name='pic' property='user.photo'/>" /><br />
			<bean:write name="pic" property="user.userName"/>
		</div>
		
		<!-- 日志详细 -->
		<div class="pic">
			<input type="hidden" id="picId" value="<bean:write name='pic' property='spId'/>" />
			<input type="hidden" id="nextPre" value="1" />
        	<div class="activeBelong">
        	<logic:equal value="1" name="owner">
        		<span class="ownerEdit">
        		<logic:equal value="0" name="pic" property="indexPic">
        			<span id="setIndex" class="clickSpan" onclick="setIndex();">设为封面</span>
        		</logic:equal>
        		<logic:equal value="1" name="pic" property="indexPic">
        			<span id="setIndex" class="indexPicBtn">设为封面</span>
        		</logic:equal>
        			<span class="clickSpan" onclick="delPic();">删除</span>
        		</span>
       		</logic:equal>
        		所属活动：由
        		<a href="home.do?id=<bean:write name='pic' property='share.users.userId' />" target="_blank"><bean:write name="pic" property="share.users.userName"/></a>
        		发起的活动<a href="shareDetail.do?id=<bean:write name='pic' property='share.id' />" target="_blank"><bean:write name="pic" property="share.title"/></a>
        	</div>
        	<div class="postTime"><bean:write name="pic" property="updateTime"/></div>
        	<div class="picContent">
        		<div class="curPic" id="curPic" title="下一张" style="cursor: url('Images/next.cur'),auto;" onclick="showNext();" onmousemove="changeCursor();">
        			<img id="curPicImg" width="500" src="<bean:write name="pic" property="photoURL" />"/>
        		</div>
        		<span class="imgTitle"><bean:write name="pic" property="title"/></span><br />
        	</div>
 	      	<!-- 评论详细 -->
	      	<div class="picComment">
	      		<logic:notEmpty name="commentList">
	      		<logic:iterate id="c" name="commentList">
		      	<div class="picCommentOne">
		      		<table>
		      			<tr>
		      				<td><img src="<bean:write name="c" property="user.photo"/>" height="30px" width="30px" /></td>
		      				<td>
		      					<div class="commentNameTime">
		      						<span class="commentName"><a href="home.do?id=<bean:write name="c" property="user.userId"/>" target="_blank" ><bean:write name="c" property="user.userName"/></a></span>
		      						<span class="cmntTime"><bean:write name="c" property="updateTime"/></span>
		      					</div>
		      					<div class="conmemntCotent"><bean:write name="c" property="comment"/></div>
		      				</td>
		      			</tr>
		      		</table>
		      	</div>
		      	</logic:iterate>
		      	</logic:notEmpty>
		      	<div class="postBox">
		      		<div class="postTitle">评论：</div>
		      		<div class="postContent">
		      			<textarea class="commentBar" rows="1" cols="40" 
		      			onfocus="commentBarChange(this,0);" onblur="commentBarChange(this,1);"
		      			onkeypress="postMonitor();"></textarea>
		      		</div>
		      		<div class="postBtn"><input type="button" name="postBtn" onclick="post();" value="发表评论" /></div>
		      	</div>
	      	</div>
      	</div>
      	</logic:notEqual>
		<!--版权信息-->
		<div class="copyRight">
			<%=session.getAttribute("CopyRight")%>
		</div>
	</div>
	<%@ include file="Inc/showMsg.jsp" %>
</body>
</html:html>
