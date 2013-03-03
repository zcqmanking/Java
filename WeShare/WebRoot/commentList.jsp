<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<logic:present name="list">
	<logic:iterate id="l" name="list">
		<logic:equal value="1" name="l" property="owner">
		<div class="commentBody" id="comment<bean:write name='l' property='scId' />" onmouseover="showDel(this,true);" onmouseout="showDel(this,false);">
			<span title="删除" class="commentDel" onclick="delComment(<bean:write name='l' property='shareId'/>,<bean:write name='l' property='scId' />);"></span>
		</logic:equal>
		<logic:equal value="0" name="l" property="owner">
		<div class="commentBody" id="comment<bean:write name='l' property='scId' />">
		</logic:equal>
			<a href="home.do?id=<bean:write name='l' property='user.userId' />"
				class="commentUserPic" target="_blank">
				<img height="30px" width="30px" src="<bean:write name='l' property='user.photo' />" border="0"/>
			</a>
			<div class='commentBox'>
				<span class='commentAuthor'>
					<a href="home.do?id=<bean:write name='l' property='user.userId' />"
						target="_blank"><bean:write name="l" property="user.userName" /></a>
				</span>
				<span class="commentTime"><bean:write name="l" property="updateTime" /></span>
				<br />
				<span class="commentDetail"><bean:write name="l" property="comment" /></span>
			</div>
		</div>
	</logic:iterate>
</logic:present>
<logic:notPresent name="list">
	<div class='commentBody' style="text-align: center">
		拉取评论失败，请<span class="spanLink" onclick="showAllComment(<bean:write name='shareId' />);">刷新</span>重试！
	</div>
</logic:notPresent>