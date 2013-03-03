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
		<script type="text/javascript" src="js/query.js">
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
					<li class="cur">
						运单查询
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
				<html:form action="/query" target="_self" styleId="queryForm"
					method="post" onsubmit="return queryCheck();">
					 查询单号：
					<html:text property="danhao" styleId="danhao" />
				</html:form>
				<script type="text/javascript">
$("#danhao").focus();
</script>
			</div>
			<logic:present name="jg">
				<div class="result">
					单号【<span style="color:red"><bean:write name="jg" property="danhao" /></span>】的查询结果如下：
					<br /><br />
					<bean:write name="jg" property="updateTime" />：进港扫描
					<br />
					<logic:notEmpty name="pj">
						<bean:write name="pj" property="updateTime" />：派件，派件员<span style="color:red"><bean:write
							name="pj" property="e.paijianyuan" /></span>，电话<span style="color:red"><bean:write name="pj"
							property="e.phone" /></span><br />
						<logic:notEmpty name="qs">
							<bean:write name="qs" property="updateTime" />：签收，签收人<span style="color:red"><bean:write
								name="qs" property="qianshouren" /></span>
						</logic:notEmpty>
					</logic:notEmpty>
				</div>
			</logic:present>
			<logic:present name="noResult">
				<div class="err">
					单号【<bean:write name="dh" />】没有找到相关信息！
				</div>
			</logic:present>
		</div>
		<div id="showMsg"></div>
	</body>
</html>
