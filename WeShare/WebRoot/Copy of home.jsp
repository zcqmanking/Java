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
   <table cellspacing="1" cellpadding="0">
		<tr valign="top">
			<!--左侧内容-->
			<td width="200">
                <div class="personalInfo">
                <input type="hidden" id="uid" value="<bean:write name='user' property='userId'/>" />
                    <img border="0" src="<bean:write name='user' property='photo'/>" /><br />
                    <bean:write name="user" property="userName"/>
                </div>
                <div class="activeCount">
                	<div class="submitTotal">已发布活动<a href="activeList.do?m=s"><bean:write name="sCnt" /></a>个</div>
                	<div class="JoinTotal">已参加他人活动<a href="activeList.do?m=j"><bean:write name="jCnt" /></a>个</div>
                	<div class="ViewTotal">已围观活动<a href="activeList.do?m=j"><bean:write name="vCnt" /></a>个</div>
                </div>
                <div class="favLocation">
                	<div class="favTitle">想去的地方</div>
                    <div class="favList">
                    <logic:empty name="favs">
                    	<div class="oneFav">还没有想去的地方~</div>
                    </logic:empty>
                    <logic:notEmpty name="favs">
                    <logic:iterate id="f" name="favs">
                    	<div class="oneFav"><bean:write name="f" property="location" /></div>
                    </logic:iterate>
                    </logic:notEmpty>
                    <logic:equal value="1" name="owner">
                    	<div class="favTip">想去<input type="text" name="favLocation" id="favLocation" size="15" /></div>
                    </logic:equal>
                    </div>
                </div>
            </td>
            <!--右侧内容-->
            <td width="800">
            	<table cellpadding="0" cellspacing="0">
                	<tr>
                    	<td width="400" align="left" valign="top">
                        	<!--最近活动列表-->
                        	<div  class="listDiv">
                                <div class="submitList">
                                	<span class="more">更多&gt;&gt;</span>
                                    <div class="sListTitle"><logic:equal value="1" name="owner">我</logic:equal><logic:equal value="0" name="owner">TA</logic:equal>的发起</div>
                                    <div class="sList">
                                    <logic:empty name="shares">
                                    	<div class="oneSubmit">
                                    		还没发起过活动？赶紧的~~
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
                                	<span class="more">更多&gt;&gt;</span>
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
                                	<span class="more">更多&gt;&gt;</span>
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
                    	<td width="400" valign="top" align="center">
                        	<div class="map" id="map"></div>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2">
                            <!--脚印连连看-->
                            <div class="feetLine">
                            	<div class="lineTitle">脚印连连看</div>
                                <table cellpadding="0" cellspacing="0">
                                	<tr class="feet">
                                	<logic:empty name="pics">
                                		<td class="onePic">
                                			<span class="noPicTip">还没有去过任何地方~</span>
                                		</td>
                                	</logic:empty>
                                	<logic:notEmpty name="pics">
                                	<logic:iterate id="p" name="pics">
                                		<td class="onePic">
                                		<logic:notEmpty name="p" property="photoURL">
                                            <img class="footPic" src="<bean:write name='p' property='photoURL' />" 
                                            	onclick="showAll(<bean:write name='p' property='userId' />,
                                            	<bean:write name='p' property='share.id' />);" />
                                        </logic:notEmpty>
                                		<logic:empty name="p" property="photoURL">
                                			<logic:equal value="1" name="owner">
                                            <img class="footPic" src="Images/uploadPhoto.jpg" 
                                            	onclick="uploadPhoto(<bean:write name='p' property='userId' />,<bean:write name='p' property='share.id' />);" />
                                            </logic:equal>
                                            <logic:equal value="0" name="owner">
                                            <img class="footPic" src="Images/noPhoto.jpg" />
                                            </logic:equal>
                                        </logic:empty>
                                            <br />
                                            <span class="activeStartTime"><bean:write name="p" property="share.startDate" /></span><br />
                                            <span class="activeLocation"><bean:write name="p" property="share.location" /></span>
                                        </td>
                                		<td class="guidePic" valign="top">
                                    		<img class="footPic" src="Images/foot.jpg" />
                                    	</td>
                                	</logic:iterate>
                                    	<td class="onePic">
                                            <img class="footPic" src="Images/icon.jpg" /><br />
                                            <span class="activeStartTime">猴年马月</span><br />
                                            <span class="activeLocation">在路上</span>
                                        </td>
                                    </logic:notEmpty>
                                	</tr>
                                </table>
                            </div>
                        </td>
                    </tr>
                    <tr>
                    	<td colspan="2">
                            <!--游记-->
                            <div class="log">
                            	<div class="logTitle">西游行记</div>
                                <div class="logList">
                                <logic:empty name="logs">
                                	<div class="oneLog">
                                		还没有去过任何地方~
                                	</div>
                                </logic:empty>
                                <logic:notEmpty name="logs">
                                <logic:iterate id="l" name="logs">
                                	<div class="oneLog">
                                    	<span class="activeStartTime"><bean:write name="l" property="share.startDate" /></span>
                                    	<logic:empty name="l" property="title">
                                    	<logic:equal value="1" name="owner">
                                    	<span class="logTitleTxt">为活动【<a href="active.do?id=<bean:write name='l' property='share.id' />" target="_blank"><bean:write name="l" property="share.title" /></a>】<a href="addLog.do?sid=<bean:write name='l' property='share.id' />" target="_blank">添加日记</a></span>
                                    	</logic:equal>
                                    	<logic:equal value="0" name="owner">
                                    	<span class="logTitleTxt">活动【<a href="active.do?id=<bean:write name='l' property='share.id' />" target="_blank"><bean:write name="l" property="share.title" /></a>】还没添加日记</span>
                                    	</logic:equal>
                                    	</logic:empty>
                                    	<logic:notEmpty name="l" property="title">
                                        <span class="logTitleTxt"><a href="showLog.do?id=<bean:write name='l' property="slId" />" target="_blank"><bean:write name="l" property="title" /></a></span>
                                    	</logic:notEmpty>
                                    </div>                                
                                </logic:iterate>
                                </logic:notEmpty>
                                </div>
                            </div>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
   </table>
		<!--版权信息-->
		<div class="copyRight">
			<%=session.getAttribute("CopyRight")%>
		</div>
	</div>
	<%@ include file="Inc/showMsg.jsp" %>
</body>
</html:html>
