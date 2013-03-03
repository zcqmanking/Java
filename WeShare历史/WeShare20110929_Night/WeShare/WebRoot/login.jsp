<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>为晒网--登录</title>
		
		<style type="text/css">
		.copyRight {
			margin-top: 20px;
			text-align: center;
			border-top: #9999CC 1px dashed;
			padding-top: 5px;
			font-size: 15px;
			width: 1000px;
		}
		</style>
	</head>
	<body style="background-image: url(Images/loginBg.png); background-repeat: repeat">
		<div style="text-align: center">
        	<div style="background-image :url(Images/loginTitle.png); background-repeat: no-repeat;background-position: center;width: 600px; height: 315px; margin-top: 30px; text-align: center"></div>
			<html:form action="/login" focus="username">
				<table cellspacing="5" cellpadding="5" align="center" border="0">
					<tr>
						<td align="right">
							用户名
						</td>
						<td align="left">
							<html:text property="username"/> <html:errors property="usernameErr"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							密&nbsp;&nbsp;&nbsp;&nbsp;码
						</td>
						<td align="left">
							<html:password property="password"/> <html:errors property="passwordErr"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							&nbsp;
						</td>
						<td align="left">
							<html:checkbox property="saveCookie"/> 下次自动登录
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<table width="100%" align="center">
								<tr>
									<td align="center">
										<input type="image" name="loginBtn" id="loginBtn" src="Images/loginBtn.png"/>
									</td>
									<td align="center">
										<a href="reg.jsp" target="_self" style="background-image: url(Images/regBtn.png); width:100px; height: 41px;"></a>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</html:form>
			<div class="copyRight">
				CopyRight©2011为晒网 
			</div>
		</div>
	</body>
</html>

