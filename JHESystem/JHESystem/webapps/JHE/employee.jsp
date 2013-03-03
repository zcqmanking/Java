<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>沈阳佳惠尔快递服务有限公司抚顺分公司</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/index.css">
		<script type="text/javascript" src="js/jquery.js">
</script>
		<script type="text/javascript" src="js/common.js">
</script>
		<script type="text/javascript" src="js/employee.js">
</script>
	</head>

	<body>
		<div class="main">
			<div class="title">
				<h1>
					佳惠尔内部物流管理系统
				</h1>
			</div>
			<div class="nav">
				<ul>
					<li>
						<a href="index.jsp">进港扫描</a>
					</li>
					<li class="line">
						|
					</li>
					<li>
						<a href="prePaiJian.do">派件扫描</a>
					</li>
					<li class="line">
						|
					</li>
					<li>
						<a href="qianshou.jsp">签收扫描</a>
					</li>
					<li class="line">
						|
					</li>
					<li>
						<a href="query.jsp">运单查询</a>
					</li>
					<li class="cur">
						派件员管理
					</li>
				</ul>
			</div>

			<div class="action">
				添加派件员：
				<input type="text" name="employee" id="employee" />
				手机号：
				<input type="text" name="phone" id="phone" />
				<input type="button" name="submt" value="添加" onclick="employeCheck()"/>
			</div>
			<div class="employee">
				<logic:present name="employee">
					<table class="etable" cellpadding="2">
						<logic:iterate id="e" name="employee">
							<tr>
								<td width="50px" align="center">
									<bean:write name="e" property="paijianyuan" />
								</td>
								<td width="100px">
									<bean:write name="e" property="phone" />
								</td>
								<td width="50px">
									<a href="###" onclick="javascript: checkDel(<bean:write name="e" property="id" />);return false;">删除</a>
								</td>
							</tr>
						</logic:iterate>
					</table>
				</logic:present>
				<logic:notPresent name="employee">
					<span style="color: red">还没有派件员！请添加！</span>
				</logic:notPresent>
			</div>
		</div>
		<div id="showMsg"></div>
	</body>
</html>
