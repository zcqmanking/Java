<%@ page language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>

<%@ include file="Inc/isUserLogin.jsp"%>
<html:html lang="true">
<head>
	<html:base />

	<title><%=session.getAttribute("curUserName")%>--首页--<%=session.getAttribute("WebName")%></title>
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="晒活动,活动,出游">
	<meta http-equiv="description" content="This is my page">
	<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="CSS/myPage.css">
	<link rel="stylesheet" type="text/css" href="CSS/ueditor/ueditor.css">
	<link rel="stylesheet" type="text/css" href="CSS/usersList.css">
	<link rel="stylesheet" type="text/css" href="CSS/common.css">
	<script type="text/javascript" src="JScript/jquery.js"></script>
	<script type="text/javascript" src="JScript/common.js"></script>
	<script src="JScript/calendar/Animation.js" type="text/javascript"></script>
	<script src="JScript/calendar/StoryBoard.js" type="text/javascript"></script>
	<script src="JScript/calendar/EventHandler.js" type="text/javascript"></script>
	<script src="JScript/calendar/ImageBox.js" type="text/javascript"></script>
	<script src="JScript/calendar/BorderDiv.js" type="text/javascript"></script>
	<script src="JScript/calendar/DateEx.js" type="text/javascript"></script>
	<script src="JScript/calendar/Calendar.js" type="text/javascript"></script>
	<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript" src="JScript/editor_config.js"></script>
	<script type="text/javascript" src="JScript/editor_ui_all.js"></script>
	<script type="text/javascript" src="JScript/editor.js"></script>
	<script type="text/javascript" src="JScript/myPage.js"></script>
</head>

<body>
	<div class="body">
		<!--头部导航-->
		<div class="head">
			<!-- <img border="0" src="Images/icon.jpg" /> -->
			<%
			java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
			java.util.Date curTime = new java.util.Date();
			String stCurTime = f.format(curTime);
			%>
			<input type="hidden" id="nowDate" value="<%=stCurTime%>" />
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
				<td width="600">
					<!--当前活动-->
					<div class="currentActive">
						<table border="0" bordercolor="#000000" cellpadding="2"
							cellspacing="0">
							<tr>
								<td valign="top">
									<img id="myPhoto" border="0"
										src="<bean:write name='curUser' property='photo' />" />
									<input type="hidden" id="curUserId" readonly="readonly" value="<bean:write name="curUser" property="userId" />" />
								</td>
								<td>
									<div class="currentActiveAll" id="lastActiveDiv">
										<logic:notPresent name="lastActive">
											<span class="currentActiveText">您还没有发布活动，赶快去发布吧！</span>
										</logic:notPresent>
										<logic:present name="lastActive">
											<span class="currentActiveText">【<bean:write
													name="lastActive" property="shareType.typeName" />】【<bean:write
													name="lastActive" property="startDate" />~<bean:write
													name="lastActive" property="endDate" />】【<bean:write
													name="lastActive" property="location" />】</span><br />
											<span class="currentActiveDetail"><bean:write name="lastActive" property="title" filter="false" /> </span><br />
											<span class="currentActiveInfo">已有<span id="joinCnt"
												class="currentActiveJoinCnt"
												onmouseover="cntOnMouseOver(this);"  onmouseout="cntOnMouseOut(this);"
												onclick="getCntList(0,<bean:write name='lastActive' property='id' />);"><bean:write
														name="lastActive" property="joinCount" /></span>人参加，
												<span id="viewCnt"
												class="currentActiveViewCnt"
												onmouseover="cntOnMouseOver(this);"  onmouseout="cntOnMouseOut(this);"
												onclick="getCntList(this,1,<bean:write name='lastActive' property='id' />);"><bean:write
														name="lastActive" property="viewCount" /></span>人围观</span>
											<logic:equal name="lastActive" property="status" value="0">
												<button id="finishBtn" class="finishJoinBtn" onclick="finish(0,<bean:write name='lastActive' property='id' />);">结束报名</button>
											</logic:equal>
											<logic:equal name="lastActive" property="status" value="1">
												<button id="finishBtn" class="finishActiveBtn"
													onclick="finish(1,<bean:write name='lastActive' property='id' />);">结束活动</button>
											</logic:equal>
											<logic:equal name="lastActive" property="status" value="2">
												<button id="finishBtn" class="finishedActiveBtn">活动已结束</button>
											</logic:equal>
										</logic:present>
									</div>
								</td>
							</tr>
						</table>
					</div>
					<!--发布活动-->
					<div class="addActiveDiv">
						<div class="typeBtn">
							<span class="spanLink activeBtn"></span>
							<span class="spanLink yuluBtn"></span>
						</div>
						<div class="sign"><%=session.getAttribute("Slogan")%></div>
						<!--发布新活动-->
						<div class="addNewActive">
							<html:form action="/addShare"
								target="_self" styleId="addActiveForm" method="post">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<td>
											类别：
										</td>
										<td>
											<ul class="activeType" id="activeType">
												<!-- 默认设置第一个类别为选中状态 -->
												<logic:iterate id="st" name="shareType" indexId="firstIndex">
													<logic:equal value="0" name="firstIndex">
														<html:hidden property="typeValue" styleId="typeValue"/>
														<li class="selectedType"
															onclick="setShareType(this,<bean:write name='st' property='id'/>);">
															<bean:write name="st" property="typeName" />
														</li>
													</logic:equal>
													<logic:notEqual value="0" name="firstIndex">
														<li class="spanLink"
															onclick="setShareType(this,<bean:write name='st' property='id'/>);">
																<bean:write name="st" property="typeName" />
														</li>
													</logic:notEqual>
													<li class="line">
														|
													</li>
												</logic:iterate>
											</ul>
										</td>
									</tr>
									<tr>
										<td>
											时间：
										</td>
										<td>
											<html:text property="startTime" readonly="true"
												styleId="startTime" size="16" />
											到
											<html:text property="endTime" readonly="true"
												styleId="endTime" size="16" />
											<span class="tip">(选择活动时间吧~)</span>
										</td>
									</tr>
									<tr>
										<td>
											地点：
										</td>
										<td>
											<html:text property="activeLocation" styleId="activeLocation" readonly="true"
												maxlength="50" size="30" onfocus="$EDITORUI['edui21']._onClick();" onclick="$EDITORUI['edui21']._onClick();"/>
											<input type="button" onClick="clearLocation();" name="next" value="清空" />
											<span class="tip">(去哪儿呢~)</span>
											<html:hidden property="lat"/>
											<html:hidden property="lng"/>
										</td>
									</tr>
									<tr>
										<td>
											标题：
										</td>
										<td>
											<html:text property="activeTitle" styleId="activeTitle"
												maxlength="20" size="30"/>
											<span class="tip">(最多20个字符~)</span>
										</td>
									</tr>
									<tr>
										<td valign="top">
											详细：
										</td>
										<td>
											<div id="detailEditor"></div>
											<div class="activeTools">
<!-- 												<ul>
													<li>
														<span class="spanLink">表情</span>
													</li>
													<li>
														<span class="spanLink">图片</span>
													</li>
													<li>
														<span class="spanLink">视频</span>
													</li>
													<li>
														<span class="spanLink">音乐</span>
													</li>
												</ul>
-->
												<table width="100%">
												<tr>
													<td align="left">
														<span class="publicArea">
															<input type="checkbox" name="pbArea" id="pbArea" checked="checked" onclick="setSchoolId(1,<bean:write name='curUser' property='school.id' />)" />对所有公开
															<html:hidden property="schoolId" styleId="schoolId" value="1"/>
														</span>
													</td>
													<td align="right">
														<html:submit property="submitActive">晒一晒/\不缺钙</html:submit>
													</td>
												</tr>
												</table>
											</div>
										</td>
									</tr>
								</table>
							</html:form>
						</div>
					</div>
					<!--广告部分-->
					<div class="ads"><!-- <%=session.getAttribute("AdvURL")%> --></div>
					<!--最新活动-->
					<div class="activeList">
						<div class="newsTitle">
							<div class="activeCatalog">
								<span>新鲜事</span>
							</div>
							<div class="searchActive">
								<input type="text" name="searchActiveKey" id="searchActiveKey"
									value="请输入搜索主题" />
								<input type="image" class="goBtn" src="Images/goBtn.png" />
							</div>
						</div>
						<div class="catalogDetail">
							<span class="spanLink">我的地盘</span>
							<span class="spanLink">所有地盘</span>
							<span class="spanLink">我的晒友</span>
						</div>
						<div class="catalogDetail2">
							<span class="spanLink">我的活动</span>
							<span class="spanLink">我的围观</span>
							<div class="refreshBtn"
								onclick="refreshNews();">
								刷新
							</div>
						</div>
						<!--活动列表-->
						<div class="newActive">
							<logic:notPresent name="shareList">
								<div class="oneActive">
									暂无新鲜事！
								</div>
							</logic:notPresent>
							<logic:present name="shareList">
								<input type="hidden" id="firstShareId" readonly="readonly" value="<bean:write name="firstShareId"/>" />
								<input type="hidden" id="lastShareId" readonly="readonly" value="<bean:write name="lastShareId"/>" />
								<input type="hidden" id="pageSize" readonly="readonly" value="<bean:write name="pageSize"/>" />
								<input type="hidden" id="newsType" readonly="readonly" value="0" />
								<logic:iterate id="sl" name="shareList">
									<div class="oneActive">
										<table>
											<tr>
												<td align="center" valign="top">
													<a href="###" target="_self">
														<img src="<bean:write name='sl' property='users.photo'/>" border="0" /></a><br />
													<a href="home.do?id=<bean:write name='sl' property='users.userId'/>" target="_self">
														<bean:write name="sl" property="users.userName" /></a><br />
													<a href="###" target="_self"><bean:write name="sl" property="users.school.schoolName" /></a><br />
												</td>
												<td>
													<table id="oneShareTbl">
														<tr>
															<td align="right">
																类别：
															</td>
															<td align="left">
																<bean:write name="sl" property="shareType.typeName" />
															</td>
														</tr>
														<tr>
															<td align="right">
																时间：
															</td>
															<td align="left">
																<bean:write name="sl" property="startDate" />
																~
																<bean:write name="sl" property="endDate" />
															</td>
														</tr>
														<tr>
															<td align="right">
																地点：
															</td>
															<td align="left">
																<span class="showMapBtn" onclick="showMap(<bean:write name='sl' property='longitude'/>,<bean:write name='sl' property='latitude'/>)"><bean:write
																		name="sl" property="location" /> </span>
															</td>
														</tr>
														<tr>
															<td>
																&nbsp;
															</td>
															<td align="left">
																<bean:write name="sl" property="title" filter="false" />
															</td>
														</tr>
														<tr>
															<td align="center" colspan="2">
																<span class="submitTime"><bean:write name="sl"
																		property="addTime" /> </span>
																<span class="submitMethod">
																	<logic:equal name="sl" property="submitFrom" value="0">
																		来自WeShare
																	</logic:equal>
																<!--<bean:write name="sl"
																		property="submitFrom" />-->
																</span>
																<span class="activeAction">
																<logic:equal name="sl" property="joinStatus" value="0">
																	<span class="spanLink" id="joinTxt<bean:write name='sl' property='id' />" onclick="updateCnt(this,<bean:write name='sl' property='id' />,0,0,true);">参与</span>
																</logic:equal>
																<logic:equal name="sl" property="joinStatus" value="1">
																	<span class="spanLink" id="joinTxt<bean:write name='sl' property='id' />" onclick="updateCnt(this,<bean:write name='sl' property='id' />,0,1,true);">取消参与</span>
																</logic:equal>
																<logic:equal name="sl" property="joinStatus" value="2">
																	<span class="clickDisable" id="joinTxt<bean:write name='sl' property='id' />">参与</span>
																</logic:equal>
																<logic:equal name="sl" property="joinStatus" value="3">
																	<span class="clickDisable" id="joinTxt<bean:write name='sl' property='id' />">参与</span>
																</logic:equal>
																<logic:equal name="sl" property="joinStatus" value="4">
																	<span class="clickDisable" id="joinTxt<bean:write name='sl' property='id' />">已参与</span>
																</logic:equal>
																<span class="currentActiveJoinCnt" onmouseover="cntOnMouseOver(this);" onmouseout="cntOnMouseOut(this);"
																onclick="getCntList(this,0,<bean:write name='sl' property='id' />);">
																( <span id="joinCnt<bean:write name='sl' property='id' />"><bean:write name="sl" property="joinCount" /></span> )
																</span>
																 | 
																<logic:equal name="sl" property="viewStatus" value="0">
																	<span class="spanLink" id="viewTxt<bean:write name='sl' property='id' />" onclick="updateCnt(this,<bean:write name='sl' property='id' />,1,0,true);">围观</span>
																</logic:equal>
																<logic:equal name="sl" property="viewStatus" value="1">
																	<span class="spanLink" id="viewTxt<bean:write name='sl' property='id' />" onclick="updateCnt(this,<bean:write name='sl' property='id' />,1,1,true);">取消围观</span>
																</logic:equal>
																<logic:equal name="sl" property="viewStatus" value="2">
																	<span class="clickDisable" id="viewTxt<bean:write name='sl' property='id' />">围观</span>
																</logic:equal>
																<span class="currentActiveViewCnt" onmouseover="cntOnMouseOver(this);" onmouseout="cntOnMouseOut(this);"
																onclick="getCntList(this,1,<bean:write name='sl' property='id' />);">
																( <span id="viewCnt<bean:write name='sl' property='id' />"><bean:write name="sl" property="viewCount" /></span> )
																</span>
																 | 
																<span class="spanLink" onclick="toggleShow(<bean:write name='sl' property='id' />)">评论<span class="currentActiveComtCnt"> ( <span id="commentCnt<bean:write name='sl' property='id' />"><bean:write name="sl" property="commentCount" /></span> ) </span></span>
																</span>
															</td>
														</tr>
														<tr class="shareComments" id="scTr<bean:write name='sl' property='id' />">
															<td colspan="2">
																<div class="sendCommentBar">
																	<div class="cArea">
																		<textarea id="ca<bean:write name='sl' property='id' />" name="commentArea" cols="40" rows="1" class="commentBar" 
																 		onfocus="commentBarChange(this,0);" onblur="commentBarChange(this,1);"
																 		onkeypress="sendMonitor(<bean:write name='sl' property='id' />);"></textarea>
																 		<div class="commentSubmitBtn">
																			<input type="button" name="csBtn" onclick="sendComment(this,<bean:write name='sl' property='id' />);" value="评论" />
																		</div>
																	</div>
																</div>
																<div class="commentList" id="commentList<bean:write name='sl' property='id' />"></div>
															</td>
														</tr>
													</table>
												</td>
											</tr>
										</table>
									</div>
								</logic:iterate>
								<div class="loadingTip"></div>
							</logic:present>
							<div class="bottomShow">
							</div>
							<!-- 
							<div class="pageDiv">
								<span class="spanLink">上一页</span>
								<span class="currentPage">第2页</span>
								<span class="spanLink">下一页</span>
							</div>
							-->
						</div>
					</div>
				</td>
				<!--右侧内容-->
				<td valign="top" width="400px">
					<!--地图-->
					<div id="map" class="map"></div>
					<!--现在最想去的地方-->
					<div class="favLocation">
						<div class="favTitle">
							晒一晒现在最想去哪里？
						</div>
						<div class="fLDiv">
							请输入您想去的地点：
							<input type="text" size="25"
								onchange="saveFavLocation(<bean:write name='curUser' property='userId' />,this.value);"
								name="favLocation" id="favLocation" />
						</div>
						<div class="favLocationTip">
							填写现在最想去的地方，当其他人也想去这里，或者发起了去这里的活动，您可以最先被通知哦^_^～
						</div>
						<div class="favLocationHelp">
							<span class="spanLink" onclick="showHelp();">如何晒活动？</span>
						</div>
					</div>
					<!--热门活动-->
					<div class="hotActive">
						<!--热门标题-->
						<div class="hotTitle">
							<table width="300" cellpadding="0" cellspacing="0">
								<tr>
									<td align="left">
										热门活动
									</td>
									<td align="right" style="font-size: 14px;">
										<span class="spanLink">更多&gt;&gt;</span>
									</td>
								</tr>
							</table>
						</div>
						<!--热门活动-->
						<logic:notPresent name="hotShare">
							<div class="hotActiveDetail">
								暂无热门活动
							</div>
						</logic:notPresent>
						<logic:present name="hotShare">
							<logic:iterate id="hs" name="hotShare">
								<div class="hotActiveDetail">
									【
									<bean:write name="hs" property="shareType.typeName" />
									】
									<a
										href="shareDetail.do?id=<bean:write name='hs' property='id'/>"
										target="_self"><bean:write name="hs" property="location" />(<bean:write
											name="hs" property="title" />)</a>
								</div>
							</logic:iterate>
						</logic:present>
					</div>
					<!--可能感兴趣的活动-->
					<div class="interestAvtive">
						<div class="interestTitle">
							可能感兴趣的活动
						</div>
						<logic:notPresent name="favShare">
							<div class="interestAvtiveDetail">
								暂无您可能感兴趣的活动
							</div>
						</logic:notPresent>
						<logic:present name="favShare">
							<logic:iterate id="fs" name="favShare">
								<div class="interestAvtiveDetail">
									【
									<bean:write name="fs" property="shareType.typeName" />
									】
									<a
										href="shareDetail.do?id=<bean:write name='fs' property='id'/>"
										target="_self"><bean:write name="fs" property="location" />(<bean:write
											name="fs" property="title" />)</a>
								</div>
							</logic:iterate>
						</logic:present>
					</div>
					<!--可能认识的人-->
					<div class="knownPerson">
						<div class="knownTitle">
							可能认识的晒友
						</div>
						<table class="knownPersonDetail">
							<tr>
								<td>
									<table>
										<tr>
											<td rowspan="2">
												<a href="###" target="_self"><img
														src="Images/ppleft.jpg" border="0" /> </a>
											</td>
											<td>
												<a href="###" target="_self">微尘小粒</a>
											</td>
										</tr>
										<tr>
											<td>
												<button name="addFriend">
													+加晒友
												</button>
											</td>
										</tr>
										<tr>
											<td colspan="2">
												我们有5个共同好友
											</td>
										</tr>
									</table>
								</td>
								<td>
									<table>
										<tr>
											<td rowspan="2">
												<a href="###" target="_self"><img
														src="Images/ppleft.jpg" border="0" /> </a>
											</td>
											<td>
												<a href="###" target="_self">微尘小粒</a>
											</td>
										</tr>
										<tr>
											<td>
												<button name="addFriend">
													+加晒友
												</button>
											</td>
										</tr>
										<tr>
											<td colspan="2">
												我们有5个共同好友
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</div>
					<!--意见反馈-->
					<div class="advise">
						<div class="adviseTitle">
							意见反馈
						</div>
						<div class="adviseDetail">
							<a href="javascript:addAdvice();" target="_self">点击这里</a>提交您的意见，我们将在第一时间处理您的意见和建议。感谢您的参与！
						</div>
					</div>
					<!--举报恶意信息-->
					<div class="expose">
						<div class="exposeTitle">
							举报恶意信息
						</div>
						<div class="exposeDetail">
							<a href="javascript:addExpose();" target="_self">点击这里</a>提交您举报的恶意信息，我们将在第一时间处理您的举报信息。感谢您的参与！
						</div>
					</div>

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
