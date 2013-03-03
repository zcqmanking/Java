<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%
	//读取用户的登录信息
	String username = null;
	String password = null;
	username = (String) session.getAttribute("curUserName");
	password = (String) session.getAttribute("curPassWord");
	if (username == null || username.equals("") || password == null
			|| password.equals("")) {
		Cookie cookies[] = null;
		cookies = request.getCookies();
		if (cookies != null) {
			String strKey;
			for (int i = 0; i < cookies.length; i++) {
				strKey = cookies[i].getName();
				if (strKey.equalsIgnoreCase("curUserName")) {
					username = cookies[i].getValue();
					session.setAttribute("curUserName", username);
				} else if (strKey.equalsIgnoreCase("curPassWord")) {
					password = cookies[i].getValue();
					session.setAttribute("curPassWord", password);
				}
			}
		}
	}

	if (username != null && !username.equals("") && password != null
			&& !password.equals("")) {
		response.sendRedirect("myPage.do");
	}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>为晒网 WeShare</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="为晒,WeShare,分享,社交">
		<!--
	<link rel="stylesheet" type="text/css" href="CSS/index.css">
	-->
	</head>

	<body>
		<div class="main_index">
			<table cellspacing="0" cellpadding="0" border="0" align="center"
				width="60%">
				<tr>
					<td width="150px" align="left">
						<img src="Images/ppleft.jpg" />
					</td>
					<td>
						<a href="login.jsp" target="_self"><img src="Images/login.jpg"
								border=0 />
						</a>
					</td>
				</tr>
			</table>
			<table cellspacing="0" cellpadding="0" border="0" align="center"
				width="60%">
				<tr>
					<td>
						<a href="reg.jsp" target="_self"><img src="Images/reg.jpg"
								border=0 />
						</a>
					</td>
					<td width="150px" align="right">
						<img src="Images/ppright.jpg" />
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>
