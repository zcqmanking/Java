<%@page import="java.net.URLDecoder" %>
<%
	//读取用户的登录信息
	String username = null;
	String password = null;
	username = (String) session.getAttribute("curUserName");
	password = (String) session.getAttribute("curPassWord");
	if (username == null || username == "" || password == null
			|| password == "") {
		Cookie cookies[] = null;
		cookies = request.getCookies();
		if (cookies != null) {
			String strKey;
			for (int i = 0; i < cookies.length; i++) {
				strKey = cookies[i].getName();
				if (strKey.equalsIgnoreCase("curUserName")) {
					username = URLDecoder.decode(cookies[i].getValue(),"UTF-8");
					session.setAttribute("curUserName", username);
				} else if (strKey.equalsIgnoreCase("curPassWord")) {
					password = cookies[i].getValue();
					session.setAttribute("curPassWord", password);
				}
			}
		}
	}

	if (username == null || username == "" || password == null
			|| password == "") {
		response.sendRedirect("login.jsp");
	}
%>