<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<div class="usrListDiv" id="usrListDiv">
	<script type="text/javascript" src="JScript/usersList.js"></script>
	<div class="titlebarShadow"></div>
	<div class="usrLstTitlebar">
		<div class="titleBarCaption">
			<span class="titleBarTxt">用户列表</span>
		</div>
		<div class="barCloseBtn" onclick="closeUsrLstDiv();" 
		onmouseover="closeUsrLstBtnOver();"	onmouseout="closeUsrLstBtnOut();">
		</div>
    </div>
	<table width="100%" cellpadding="0" cellspacing="5" border="0" align="center">
    	<logic:notPresent name="users">
	        <tr align="center">
     		<td>
     			<html:errors property="queryError"></html:errors>
     		</td>
    		</tr>
    	</logic:notPresent>
    	<logic:present name="users">
    		<logic:empty name="users">
    			<tr align="center">
    				<td>暂无信息</td>
    			</tr>
    		</logic:empty>
    		<logic:notEmpty name="users">
    			<logic:iterate id="u" name="users" indexId="index">
    				<%if(index%4==1){ %>
    				<tr align="center">
    				<%} %>
    					<td>
         				<img border="0" height="60" width="60" src="<bean:write name='u' property='photo' />" /><br />
             			<a href="myHome.do?id=<bean:write name='u' property='userId' />" target="_blank"><bean:write name="u" property="userName" /></a>                
         			</td>
    				<%if(index%4==1){ %>
    				</tr>
    				<%} %>
    			</logic:iterate>
    		</logic:notEmpty>
    	</logic:present>
	</table>
</div>