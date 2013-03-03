<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="/struts-tags" prefix="html" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="true">
  <head>
    
    <title>login.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <html:form action="/myStruts2/login" method="get" focus="login">
      <table border="0">
        <tr>
          <td>Login:</td>
          <td><html:textfield name="login" label="用户名"/></td>
        </tr>
        <tr>
          <td>Password:</td>
          <td><html:password name="password" label="密码" /></td>
        </tr>
        <tr>
          <td colspan="2" align="center"><html:submit value="提交"/></td>
        </tr>
      </table>
    </html:form>
  </body>
</html>
