<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>为晒网--快速注册</title>
	</head>
	<body>
		<div style="text-align: center">
			<html:form action="/reg">
				<table cellspacing="0" cellpadding="0" align="center" border="0">
					<tr>
						<td colspan="2" align="center">
							快速注册账户~
						</td>
					</tr>
					<tr align="left">
						<td colspan="2">
							<html:errors property="usernameErr"/><br />
							<html:errors property="passwordErr"/>
							<html:errors property="mailErr"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							用&nbsp;户&nbsp;名 : 
						</td>
						<td align="left">
							<html:text property="username"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							密&nbsp;&nbsp;&nbsp;&nbsp;码 : 
						</td>
						<td align="left">
							<html:password property="password"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							确认密码 : 
						</td>
						<td align="left">
							<html:password property="ckPassword"/>
						</td>
					</tr>
					<tr>
						<td align="right">
							电子邮件 : 
						</td>
						<td align="left">
							<html:text property="mail"/>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<table width="100%" align="center">
								<tr>
									<td align="center">
										<html:submit value="注册"/>
									</td>
									<td align="center">
										<html:reset value="重置"/>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</html:form>
		</div>
	</body>
</html>

