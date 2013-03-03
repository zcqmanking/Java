<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<logic:present name="shareList">
	<input type="hidden" id="fsId" readonly="readonly" value="<bean:write name="firstShareId"/>" />
	<input type="hidden" id="lsId" readonly="readonly" value="<bean:write name="lastShareId"/>" />
	<input type="hidden" id="noMoreId" readonly="readonly" value="<bean:write name="noMore"/>" />
	<logic:iterate id="sl" name="shareList">
		<div class="oneActive">
			<table>
				<tr>
					<td align="center" valign="top">
						<a href="###" target="_self">
							<img src="<bean:write name='sl' property='users.photo'/>" border="0" /></a><br />
						<a href="myHome.do?id=<bean:write name='sl' property='users.userId'/>" target="_self">
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
									<bean:write name="sl" property="detail" filter="false" />
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
										<span class="spanLink" id="joinTxt<bean:write name='sl' property='id' />" onclick="updateCnt(<bean:write name='sl' property='id' />,0,0,true);">参与</span>
									</logic:equal>
									<logic:equal name="sl" property="joinStatus" value="1">
										<span class="spanLink" id="joinTxt<bean:write name='sl' property='id' />" onclick="updateCnt(<bean:write name='sl' property='id' />,0,1,true);">取消参与</span>
									</logic:equal>
									<logic:equal name="sl" property="joinStatus" value="2">
										<span class="clickDisable" id="joinTxt<bean:write name='sl' property='id' />">参与</span>
									</logic:equal>
									<span class="currentActiveJoinCnt" onmouseover="cntOnMouseOver(this);" onmouseout="cntOnMouseOut(this);"
									onclick="getCntList(this,0,<bean:write name='sl' property='id' />);">
									( <span id="joinCnt<bean:write name='sl' property='id' />"><bean:write name="sl" property="joinCount" /></span> )
									</span>
									 | 
									<logic:equal name="sl" property="viewStatus" value="0">
										<span class="spanLink" id="viewTxt<bean:write name='sl' property='id' />" onclick="updateCnt(<bean:write name='sl' property='id' />,1,0,true);">围观</span>
									</logic:equal>
									<logic:equal name="sl" property="viewStatus" value="1">
										<span class="spanLink" id="viewTxt<bean:write name='sl' property='id' />" onclick="updateCnt(<bean:write name='sl' property='id' />,1,1,true);">取消围观</span>
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
												<input type="button" name="csBtn" onclick="sendComment(<bean:write name='sl' property='id' />);" value="评论" />
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
</logic:present>
