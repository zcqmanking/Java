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
		<script type="text/javascript" src="js/qianshou.js">
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
					<li class="cur">
						签收扫描
					</li>
					<li class="line">
						|
					</li>
					<li>
						<a href="query.jsp">运单查询</a>
					</li>
					<li class="line">
						|
					</li>
					<li>
						<a href="employee.do?m=get">派件员管理</a>
					</li>
				</ul>
			</div>

			<div class="action">
				<html:form action="/qianshou" target="_self" styleId="qianshouForm"
					method="post" onsubmit="return qianshouCheck();">
					签收单号：
					<html:text property="danhao" styleId="danhao" />
					签收人：
					<html:text property="qianshouren" styleId="qianshouren" size="8" />
					<input type="submit" value="签收" />
					<span id="count" class="tip">已签收<span id="sum"
						style="color: red;">0</span>票</span>
				</html:form>
				<script type="text/javascript">
				$("#danhao").focus();
				</script>
			</div>
		</div>
		<div id="showMsg"><bgsound loop="1" id="bgs"/></div>
	</body>
</html>
