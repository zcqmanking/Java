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
	<link rel="stylesheet" type="text/css" href="CSS/home.css">
	<link rel="stylesheet" type="text/css" href="CSS/ueditor/ueditor.css">
	<link rel="stylesheet" type="text/css" href="CSS/usersList.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="JScript/home.js"></script>
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
                            <div class="submitList">
                            	<logic:notEmpty name="shares"><span class="more"><a href="list.do?uid=<bean:write name='user' property='userId'/>&k=s">更多&gt;&gt;</a></span></logic:notEmpty>
                                <div class="sListTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的发起</div>
                                <div class="sList">
                                <logic:empty name="shares">
                                	<div class="oneSubmit">
                                		还没发起过活动~~
                                	</div>
                                </logic:empty>
                                <logic:notEmpty name="shares">
                                <logic:iterate id="s" name="shares">
                                	<div class="oneSubmit">
                                    	<span class="clickSpan" onclick="showDetail(<bean:write name='s' property='id' />)">
                                    	<bean:write name="s" property="startDate"/>&nbsp;<bean:write name="s" property="title"/></span>
                                    	<span class="submitTime"><bean:write name="s" property="addTime"/></span>
                                        <span class="cntlist">
                                            <span class="cnt"><bean:write name="s" property="joinCount"/>人</span>参与
                                            <span class="cnt"><bean:write name="s" property="viewCount"/>人</span>围观
                                            <span class="cnt"><bean:write name="s" property="commentCount"/>人</span>评论
                                        </span>
                                    </div>
                                </logic:iterate>
                                </logic:notEmpty>
                                </div>
                            </div>
                            <div class="joinList">
                            	<logic:notEmpty name="joins"><span class="more"><a href="list.do?uid=<bean:write name='user' property='userId'/>&k=j">更多&gt;&gt;</a></span></logic:notEmpty>
                                <div class="jListTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的参与</div>
                                <div class="sList">
                                <logic:empty name="joins">
                                	<div class="oneSubmit">
                                		还没参与过活动~~
                                	</div>
                                </logic:empty>
                                <logic:notEmpty name="joins">
                                <logic:iterate id="j" name="joins">
                                	<div class="oneSubmit">
                                    	<span class="clickSpan" onclick="showDetail(<bean:write name='j' property='id' />)">
                                    	<bean:write name="j" property="startDate"/>&nbsp;<bean:write name="j" property="title"/></span>
                                    	<span class="submitTime"><bean:write name="j" property="addTime"/></span>
                                        <span class="cntlist">
                                            <span class="cnt"><bean:write name="j" property="joinCount"/>人</span>参与
                                            <span class="cnt"><bean:write name="j" property="viewCount"/>人</span>围观
                                            <span class="cnt"><bean:write name="j" property="commentCount"/>人</span>评论
                                        </span>
                                    </div>
                                </logic:iterate>
                                </logic:notEmpty>
                                </div>
                            </div>
                            <div class="viewList">
                            	<logic:notEmpty name="views"><span class="more"><a href="list.do?uid=<bean:write name='user' property='userId'/>&k=v">更多&gt;&gt;</a></span></logic:notEmpty>
                                <div class="vListTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的围观</div>
                                <div class="sList">
                                <logic:empty name="views">
                                	<div class="oneSubmit">
                                		还没围观过活动~~
                                	</div>
                                </logic:empty>
                                <logic:notEmpty name="views">
                                 <logic:iterate id="v" name="views">
                                	<div class="oneSubmit">
                                    	<span class="clickSpan" onclick="showDetail(<bean:write name='v' property='id' />)">
                                    	<bean:write name="v" property="startDate"/>&nbsp;<bean:write name="v" property="title"/></span>
                                    	<span class="submitTime"><bean:write name="v" property="addTime"/></span>
                                        <span class="cntlist">
                                            <span class="cnt"><bean:write name="v" property="joinCount"/>人</span>参与
                                            <span class="cnt"><bean:write name="v" property="viewCount"/>人</span>围观
                                            <span class="cnt"><bean:write name="v" property="commentCount"/>人</span>评论
                                        </span>
                                    </div>
                                </logic:iterate>
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
		
		<!-- 日志列表 -->
		<div class="log">
        	<div class="logTitle"><logic:notEmpty name="lastMonthLogs"><span class="more"><a href="list.do?uid=<bean:write name='user' property='userId'/>&k=l">更多&gt;&gt;</a></span></logic:notEmpty>西游行记</div>
        	<div class="logList">
        		<logic:notEmpty name="lastMonthLogs">
				<div class="monthTitle"><bean:write name="lastMonthLogTitle" /></div>
				<div class="logBoxes">
					<logic:iterate id="l" name="lastMonthLogs">
					<div class="logBox" onmouseover="showHL(<bean:write name='l' property='slId' />);" onmouseout="showHL(<bean:write name='l' property='slId' />);">
					<a class="highlight" id="<bean:write name='l' property='slId' />" href="showLog.do?id=<bean:write name='l' property='slId' />" target="_blank">
						<bean:write name="l" property="updateTime" />
					</a>
					<span class="oneLogTitle"><bean:write name="l" property="title"/></span>
					<bean:write name="l" property="content" />
					</div>
					</logic:iterate>
				</div>
				<logic:notEmpty name="beforeMonthLogs">
				<div class="monthTitle">更早以前</div>
				<div class="logBoxes">
					<logic:iterate id="l" name="beforeMonthLogs">
					<div class="logBox" onmouseover="showHL(<bean:write name='l' property='slId' />);" onmouseout="showHL(<bean:write name='l' property='slId' />);">
					<a class="highlight" id="<bean:write name='l' property='slId' />" href="showLog.do?id=<bean:write name='l' property='slId' />" target="_blank">
						<bean:write name="l" property="updateTime" />
					</a>
					<span class="oneLogTitle"><bean:write name="l" property="title"/></span>
					<bean:write name="l" property="content" />
					</div>
					</logic:iterate>
				</div>
				</logic:notEmpty>
				</logic:notEmpty>
				<logic:empty name="lastMonthLogs">
				<div class="logTip">
                	还没有任何游记~
                </div>
				</logic:empty>
			</div>
      	</div>
		<!-- 相册列表 -->
		<div class="pic">
        	<div class="picTitle"><logic:notEmpty name="lastMonthPics"><span class="more"><a href="list.do?uid=<bean:write name='user' property='userId'/>&k=p">更多&gt;&gt;</a></span></logic:notEmpty>足迹风光</div>
        	<div class="picList">
        		<logic:notEmpty name="lastMonthPics">
				<div class="monthTitle"><bean:write name="lastMonthPicTitle" /></div>
				<div class="picBoxes">
					<logic:iterate id="p" name="lastMonthPics">
					<div class="picBox" onmouseover="showHLP(<bean:write name='p' property='spId' />);" onmouseout="showHLP(<bean:write name='p' property='spId' />);">
					<a class="highlight" id="pic<bean:write name='p' property='spId' />" href="showPic.do?id=<bean:write name='p' property='spId' />&m=cur" target="_blank">
						<bean:write name="p" property="share.startDate" />
					</a>
					<img src="<bean:write name='p' property='photoURL' />" width="100" height="100" />
					<br />
					<span class="activeLocation"><bean:write name="p" property="share.location"/></span>
					</div>
					</logic:iterate>
				</div>
				<logic:notEmpty name="beforeMonthPics">
				<div class="monthTitle">更早以前</div>
				<div class="picBoxes">
					<logic:iterate id="p" name="lastMonthPics">
					<span class="picBox">
					<a href="showPic.do?id=<bean:write name='p' property='spId' />&m=cur" target="_blank">
					<img src="<bean:write name='p' property='photoURL' />" width="100" height="100" />
					</a><br />
					<span class="activeLocation"><bean:write name="p" property="share.startDate" />&nbsp;<bean:write name="p" property="share.location"/></span>
					</span>
					</logic:iterate>
				</div>
				</logic:notEmpty>
				</logic:notEmpty>
				<logic:empty name="lastMonthPics">
				<div class="picTip">
                	还没有任何照片~
                </div>
				</logic:empty>
			</div>
      	</div>
		<!-- 留言模块 -->
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		<!--版权信息-->
		<div class="copyRight">
			<%=session.getAttribute("CopyRight")%>
		</div>
	</div>
	<%@ include file="Inc/showMsg.jsp" %>
</body>
</html:html>
