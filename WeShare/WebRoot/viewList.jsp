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
	<link rel="stylesheet" type="text/css" href="CSS/viewList.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script type="text/javascript" src="JScript/viewList.js"></script>
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
			<table cellspacing="0" cellpadding="0" >
				<tr valign="top">
					<td width="600">
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
                       	<!--最近活动列表-->
                       	<div  class="listDiv">
                            <div class="viewList">
                                <div class="vListTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的围观</div>
                                <div class="sList">
                                <logic:empty name="views">
                                	<div class="oneSubmit">
                                		还没围观过活动~~
                                	</div>
                                </logic:empty>
                                <logic:notEmpty name="views">
                                	<input type="hidden" id="lastShareId" value="<bean:write name="lastShareId"/>" />
                                 <logic:iterate id="v" name="views">
                                	<div class="oneSubmit">
                                    	<span class="clickSpan" onclick="showDetail(<bean:write name='v' property='id' />)">
                                    	<bean:write name="v" property="startDate"/>&nbsp;<bean:write name="v" property="title"/></span><br />
                                    	<span class="submitTime"><bean:write name="v" property="addTime"/></span>
                                        <span class="cntlist">
                                            <span class="cnt"><bean:write name="v" property="joinCount"/>人</span>参与
                                            <span class="cnt"><bean:write name="v" property="viewCount"/>人</span>围观
                                            <span class="cnt"><bean:write name="v" property="commentCount"/>人</span>评论
                                        </span>
                                    </div>
                                </logic:iterate>
                                	<div class="loadingTip"></div>
                                </logic:notEmpty>
                                </div>
                            </div>
                        </div>
					</td>
					<td>
						<div class="map" id="map"></div>
					</td>
				</tr>
			</table>
		</div>

		<!--版权信息-->
		<div class="copyRight">
			<%=session.getAttribute("CopyRight")%>
		</div>
	</div>
	<%@ include file="Inc/showMsg.jsp" %>
</body>
</html:html>
