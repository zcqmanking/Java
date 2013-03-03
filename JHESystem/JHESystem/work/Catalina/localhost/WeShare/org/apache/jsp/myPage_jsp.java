package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLDecoder;

public final class myPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/Inc/isUserLogin.jsp");
    _jspx_dependants.add("/Inc/showMsg.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang.release();
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.release();
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.release();
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty.release();
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("﻿\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

	//è¯»åç¨æ·çç»å½ä¿¡æ¯
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

      out.write('\r');
      out.write('\n');
      //  html:html
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_005fhtml_005f0 = (org.apache.struts.taglib.html.HtmlTag) _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_005fhtml_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005fhtml_005f0.setParent(null);
      _jspx_th_html_005fhtml_005f0.setLang(true);
      int _jspx_eval_html_005fhtml_005f0 = _jspx_th_html_005fhtml_005f0.doStartTag();
      if (_jspx_eval_html_005fhtml_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n");
          out.write("\t");
          if (_jspx_meth_html_005fbase_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\r\n");
          out.write("\t<title>");
          out.print(session.getAttribute("curUserName"));
          out.write("--首页--");
          out.print(session.getAttribute("WebName"));
          out.write("</title>\r\n");
          out.write("\t<meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\" />\r\n");
          out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
          out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
          out.write("\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
          out.write("\t<meta http-equiv=\"keywords\" content=\"晒活动,活动,出游\">\r\n");
          out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
          out.write("\t<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/myPage.css\">\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/ueditor/ueditor.css\">\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/usersList.css\">\r\n");
          out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/common.css\">\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/jquery.js\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/common.js\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/Animation.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/StoryBoard.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/EventHandler.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/ImageBox.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/BorderDiv.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/DateEx.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script src=\"JScript/calendar/Calendar.js\" type=\"text/javascript\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/editor_config.js\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/editor_ui_all.js\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/editor.js\"></script>\r\n");
          out.write("\t<script type=\"text/javascript\" src=\"JScript/myPage.js\"></script>\r\n");
          out.write("</head>\r\n");
          out.write("\r\n");
          out.write("<body>\r\n");
          out.write("\t<div class=\"body\">\r\n");
          out.write("\t\t<!--头部导航-->\r\n");
          out.write("\t\t<div class=\"head\">\r\n");
          out.write("\t\t\t<!-- <img border=\"0\" src=\"Images/icon.jpg\" /> -->\r\n");
          out.write("\t\t\t");

			java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd");
			java.util.Date curTime = new java.util.Date();
			String stCurTime = f.format(curTime);
			
          out.write("\r\n");
          out.write("\t\t\t<input type=\"hidden\" id=\"nowDate\" value=\"");
          out.print(stCurTime);
          out.write("\" />\r\n");
          out.write("\t\t\t<ul>\r\n");
          out.write("\t\t\t\t<li class=\"cur\">\r\n");
          out.write("\t\t\t\t\t<a href=\"myPage.do\">首页</a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li class=\"line\">\r\n");
          out.write("\t\t\t\t\t|\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t<a href=\"home.do\">我的主页</a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li class=\"line\">\r\n");
          out.write("\t\t\t\t\t|\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t<a href=\"myFriends.do\">晒友</a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li class=\"line\">\r\n");
          out.write("\t\t\t\t\t|\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t\t<li>\r\n");
          out.write("\t\t\t\t\t<a href=\"myZone.do\">地盘</a>\r\n");
          out.write("\t\t\t\t</li>\r\n");
          out.write("\t\t\t</ul>\r\n");
          out.write("\t\t\t<div class=\"search\">\r\n");
          out.write("\t\t\t\t");
          if (_jspx_meth_html_005fform_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t\t<span><a href=\"myInfo.do\" target=\"_self\">我的账号</a> </span>\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t\t<table cellspacing=\"1\" cellpadding=\"0\">\r\n");
          out.write("\t\t\t<tr valign=\"top\">\r\n");
          out.write("\t\t\t\t<!--左侧内容-->\r\n");
          out.write("\t\t\t\t<td width=\"600\">\r\n");
          out.write("\t\t\t\t\t<!--当前活动-->\r\n");
          out.write("\t\t\t\t\t<div class=\"currentActive\">\r\n");
          out.write("\t\t\t\t\t\t<table border=\"0\" bordercolor=\"#000000\" cellpadding=\"2\"\r\n");
          out.write("\t\t\t\t\t\t\tcellspacing=\"0\">\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<img id=\"myPhoto\" border=\"0\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\tsrc=\"");
          if (_jspx_meth_bean_005fwrite_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"curUserId\" readonly=\"readonly\" value=\"");
          if (_jspx_meth_bean_005fwrite_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<div class=\"currentActiveAll\" id=\"lastActiveDiv\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotPresent_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fpresent_005f0(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--发布活动-->\r\n");
          out.write("\t\t\t\t\t<div class=\"addActiveDiv\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"typeBtn\">\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink activeBtn\"></span>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink yuluBtn\"></span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"sign\">");
          out.print(session.getAttribute("Slogan"));
          out.write("</div>\r\n");
          out.write("\t\t\t\t\t\t<!--发布新活动-->\r\n");
          out.write("\t\t\t\t\t\t<div class=\"addNewActive\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          //  html:form
          org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f1 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_005fform_005f1.setPageContext(_jspx_page_context);
          _jspx_th_html_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_html_005fform_005f1.setAction("/addShare");
          _jspx_th_html_005fform_005f1.setTarget("_self");
          _jspx_th_html_005fform_005f1.setStyleId("addActiveForm");
          _jspx_th_html_005fform_005f1.setMethod("post");
          int _jspx_eval_html_005fform_005f1 = _jspx_th_html_005fform_005f1.doStartTag();
          if (_jspx_eval_html_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t类别：\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"activeType\" id=\"activeType\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<!-- 默认设置第一个类别为选中状态 -->\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f0 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f0.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
              _jspx_th_logic_005fiterate_005f0.setId("st");
              _jspx_th_logic_005fiterate_005f0.setName("shareType");
              _jspx_th_logic_005fiterate_005f0.setIndexId("firstIndex");
              int _jspx_eval_logic_005fiterate_005f0 = _jspx_th_logic_005fiterate_005f0.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object st = null;
                java.lang.Integer firstIndex = null;
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f0.doInitBody();
                }
                st = (java.lang.Object) _jspx_page_context.findAttribute("st");
                firstIndex = (java.lang.Integer) _jspx_page_context.findAttribute("firstIndex");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f3(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fnotEqual_005f0(_jspx_th_logic_005fiterate_005f0, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"line\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t|\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f0.doAfterBody();
                  st = (java.lang.Object) _jspx_page_context.findAttribute("st");
                  firstIndex = (java.lang.Integer) _jspx_page_context.findAttribute("firstIndex");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005findexId_005fid.reuse(_jspx_th_logic_005fiterate_005f0);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t时间：\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005ftext_005f1(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t到\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005ftext_005f2(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"tip\">(选择活动时间吧~)</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t地点：\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005ftext_005f3(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" onClick=\"clearLocation();\" name=\"next\" value=\"清空\" />\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"tip\">(去哪儿呢~)</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005fhidden_005f1(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005fhidden_005f2(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t标题：\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005ftext_005f4(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"tip\">(最多20个字符~)</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t详细：\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<div id=\"detailEditor\"></div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"activeTools\">\r\n");
              out.write("<!-- \t\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\">表情</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\">图片</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\">视频</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\">音乐</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
              out.write("-->\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"publicArea\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"pbArea\" id=\"pbArea\" checked=\"checked\" onclick=\"setSchoolId(1,");
              if (_jspx_meth_bean_005fwrite_005f17(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write(")\" />对所有公开\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005fhidden_005f3(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
              if (_jspx_meth_html_005fsubmit_005f1(_jspx_th_html_005fform_005f1, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t\t\t\t\t</table>\r\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_005fform_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleId_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f1);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--广告部分-->\r\n");
          out.write("\t\t\t\t\t<div class=\"ads\"><!-- ");
          out.print(session.getAttribute("AdvURL"));
          out.write(" --></div>\r\n");
          out.write("\t\t\t\t\t<!--最新活动-->\r\n");
          out.write("\t\t\t\t\t<div class=\"activeList\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"newsTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"activeCatalog\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<span>新鲜事</span>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"searchActive\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"searchActiveKey\" id=\"searchActiveKey\"\r\n");
          out.write("\t\t\t\t\t\t\t\t\tvalue=\"请输入搜索主题\" />\r\n");
          out.write("\t\t\t\t\t\t\t\t<input type=\"image\" class=\"goBtn\" src=\"Images/goBtn.png\" />\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"catalogDetail\">\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\">我的地盘</span>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\">所有地盘</span>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\">我的晒友</span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"catalogDetail2\">\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\">我的活动</span>\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\">我的围观</span>\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"refreshBtn\"\r\n");
          out.write("\t\t\t\t\t\t\t\tonclick=\"refreshNews();\">\r\n");
          out.write("\t\t\t\t\t\t\t\t刷新\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<!--活动列表-->\r\n");
          out.write("\t\t\t\t\t\t<div class=\"newActive\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotPresent_005f1(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f1 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f1.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_logic_005fpresent_005f1.setName("shareList");
          int _jspx_eval_logic_005fpresent_005f1 = _jspx_th_logic_005fpresent_005f1.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"firstShareId\" readonly=\"readonly\" value=\"");
              if (_jspx_meth_bean_005fwrite_005f18(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
                return;
              out.write("\" />\r\n");
              out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"lastShareId\" readonly=\"readonly\" value=\"");
              if (_jspx_meth_bean_005fwrite_005f19(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
                return;
              out.write("\" />\r\n");
              out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"pageSize\" readonly=\"readonly\" value=\"");
              if (_jspx_meth_bean_005fwrite_005f20(_jspx_th_logic_005fpresent_005f1, _jspx_page_context))
                return;
              out.write("\" />\r\n");
              out.write("\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"newsType\" readonly=\"readonly\" value=\"0\" />\r\n");
              out.write("\t\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f1 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f1.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
              _jspx_th_logic_005fiterate_005f1.setId("sl");
              _jspx_th_logic_005fiterate_005f1.setName("shareList");
              int _jspx_eval_logic_005fiterate_005f1 = _jspx_th_logic_005fiterate_005f1.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object sl = null;
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f1.doInitBody();
                }
                sl = (java.lang.Object) _jspx_page_context.findAttribute("sl");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<div class=\"oneActive\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t<table>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
                  if (_jspx_meth_bean_005fwrite_005f21(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\" border=\"0\" /></a><br />\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"home.do?id=");
                  if (_jspx_meth_bean_005fwrite_005f22(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\" target=\"_self\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f23(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</a><br />\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\">");
                  if (_jspx_meth_bean_005fwrite_005f24(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</a><br />\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<table id=\"oneShareTbl\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t类别：\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f25(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t时间：\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f26(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t~\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f27(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t地点：\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"showMapBtn\" onclick=\"showMap(");
                  if (_jspx_meth_bean_005fwrite_005f28(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(',');
                  if (_jspx_meth_bean_005fwrite_005f29(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(')');
                  out.write('"');
                  out.write('>');
                  if (_jspx_meth_bean_005fwrite_005f30(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(" </span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"shareDetail.do?sid=");
                  if (_jspx_meth_bean_005fwrite_005f31(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\" target=\"_blank\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f32(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</a>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" colspan=\"2\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"submitTime\">");
                  if (_jspx_meth_bean_005fwrite_005f33(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(" </span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"submitMethod\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f4(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--");
                  if (_jspx_meth_bean_005fwrite_005f34(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("-->\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"activeAction\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f5(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f6(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f7(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f8(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f9(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveJoinCnt\" onmouseover=\"cntOnMouseOver(this);\" onmouseout=\"cntOnMouseOut(this);\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"getCntList(this,0,");
                  if (_jspx_meth_bean_005fwrite_005f42(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(");\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t( <span id=\"joinCnt");
                  if (_jspx_meth_bean_005fwrite_005f43(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write('"');
                  out.write('>');
                  if (_jspx_meth_bean_005fwrite_005f44(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</span> )\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t | \r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f10(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f11(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_logic_005fequal_005f12(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveViewCnt\" onmouseover=\"cntOnMouseOver(this);\" onmouseout=\"cntOnMouseOut(this);\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"getCntList(this,1,");
                  if (_jspx_meth_bean_005fwrite_005f50(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(");\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t( <span id=\"viewCnt");
                  if (_jspx_meth_bean_005fwrite_005f51(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write('"');
                  out.write('>');
                  if (_jspx_meth_bean_005fwrite_005f52(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</span> )\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t | \r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\" onclick=\"toggleShow(");
                  if (_jspx_meth_bean_005fwrite_005f53(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(")\">评论<span class=\"currentActiveComtCnt\"> ( <span id=\"commentCnt");
                  if (_jspx_meth_bean_005fwrite_005f54(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write('"');
                  out.write('>');
                  if (_jspx_meth_bean_005fwrite_005f55(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("</span> ) </span></span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr class=\"shareComments\" id=\"scTr");
                  if (_jspx_meth_bean_005fwrite_005f56(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"sendCommentBar\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"cArea\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<textarea id=\"ca");
                  if (_jspx_meth_bean_005fwrite_005f57(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\" name=\"commentArea\" cols=\"40\" rows=\"1\" class=\"commentBar\" \r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\tonfocus=\"commentBarChange(this,0);\" onblur=\"commentBarChange(this,1);\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\tonkeypress=\"sendMonitor(");
                  if (_jspx_meth_bean_005fwrite_005f58(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(");\"></textarea>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t<div class=\"commentSubmitBtn\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"button\" name=\"csBtn\" onclick=\"sendComment(this,");
                  if (_jspx_meth_bean_005fwrite_005f59(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write(");\" value=\"评论\" />\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"commentList\" id=\"commentList");
                  if (_jspx_meth_bean_005fwrite_005f60(_jspx_th_logic_005fiterate_005f1, _jspx_page_context))
                    return;
                  out.write("\"></div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f1.doAfterBody();
                  sl = (java.lang.Object) _jspx_page_context.findAttribute("sl");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f1);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t\t<div class=\"loadingTip\"></div>\r\n");
              out.write("\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f1);
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"bottomShow\">\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t<!-- \r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"pageDiv\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"spanLink\">上一页</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"currentPage\">第2页</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t<span class=\"spanLink\">下一页</span>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t\t-->\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t<!--右侧内容-->\r\n");
          out.write("\t\t\t\t<td valign=\"top\" width=\"400px\">\r\n");
          out.write("\t\t\t\t\t<!--地图-->\r\n");
          out.write("\t\t\t\t\t<div id=\"map\" class=\"map\"></div>\r\n");
          out.write("\t\t\t\t\t<!--现在最想去的地方-->\r\n");
          out.write("\t\t\t\t\t<div class=\"favLocation\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"favTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t晒一晒现在最想去哪里？\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"fLDiv\">\r\n");
          out.write("\t\t\t\t\t\t\t请输入您想去的地点：\r\n");
          out.write("\t\t\t\t\t\t\t<input type=\"text\" size=\"25\"\r\n");
          out.write("\t\t\t\t\t\t\t\tonchange=\"saveFavLocation(");
          if (_jspx_meth_bean_005fwrite_005f61(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write(",this.value);\"\r\n");
          out.write("\t\t\t\t\t\t\t\tname=\"favLocation\" id=\"favLocation\" />\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"favLocationTip\">\r\n");
          out.write("\t\t\t\t\t\t\t填写现在最想去的地方，当其他人也想去这里，或者发起了去这里的活动，您可以最先被通知哦^_^～\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"favLocationHelp\">\r\n");
          out.write("\t\t\t\t\t\t\t<span class=\"spanLink\" onclick=\"showHelp();\">如何晒活动？</span>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--热门活动-->\r\n");
          out.write("\t\t\t\t\t<div class=\"hotActive\">\r\n");
          out.write("\t\t\t\t\t\t<!--热门标题-->\r\n");
          out.write("\t\t\t\t\t\t<div class=\"hotTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t<table width=\"300\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t热门活动\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<td align=\"right\" style=\"font-size: 14px;\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\">更多&gt;&gt;</span>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<!--热门活动-->\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotPresent_005f2(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f2 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f2.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_logic_005fpresent_005f2.setName("hotShare");
          int _jspx_eval_logic_005fpresent_005f2 = _jspx_th_logic_005fpresent_005f2.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f2 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f2.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f2);
              _jspx_th_logic_005fiterate_005f2.setId("hs");
              _jspx_th_logic_005fiterate_005f2.setName("hotShare");
              int _jspx_eval_logic_005fiterate_005f2 = _jspx_th_logic_005fiterate_005f2.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object hs = null;
                if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f2.doInitBody();
                }
                hs = (java.lang.Object) _jspx_page_context.findAttribute("hs");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t<div class=\"hotActiveDetail\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t【\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f62(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t】\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\thref=\"shareDetail.do?id=");
                  if (_jspx_meth_bean_005fwrite_005f63(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                    return;
                  out.write("\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\ttarget=\"_self\">");
                  if (_jspx_meth_bean_005fwrite_005f64(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                    return;
                  out.write('(');
                  if (_jspx_meth_bean_005fwrite_005f65(_jspx_th_logic_005fiterate_005f2, _jspx_page_context))
                    return;
                  out.write(")</a>\r\n");
                  out.write("\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f2.doAfterBody();
                  hs = (java.lang.Object) _jspx_page_context.findAttribute("hs");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f2);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f2);
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--可能感兴趣的活动-->\r\n");
          out.write("\t\t\t\t\t<div class=\"interestAvtive\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"interestTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t可能感兴趣的活动\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_logic_005fnotPresent_005f3(_jspx_th_html_005fhtml_005f0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          //  logic:present
          org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f3 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
          _jspx_th_logic_005fpresent_005f3.setPageContext(_jspx_page_context);
          _jspx_th_logic_005fpresent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
          _jspx_th_logic_005fpresent_005f3.setName("favShare");
          int _jspx_eval_logic_005fpresent_005f3 = _jspx_th_logic_005fpresent_005f3.doStartTag();
          if (_jspx_eval_logic_005fpresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t\t\t");
              //  logic:iterate
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_005fiterate_005f3 = (org.apache.struts.taglib.logic.IterateTag) _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_005fiterate_005f3.setPageContext(_jspx_page_context);
              _jspx_th_logic_005fiterate_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f3);
              _jspx_th_logic_005fiterate_005f3.setId("fs");
              _jspx_th_logic_005fiterate_005f3.setName("favShare");
              int _jspx_eval_logic_005fiterate_005f3 = _jspx_th_logic_005fiterate_005f3.doStartTag();
              if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object fs = null;
                if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_logic_005fiterate_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_logic_005fiterate_005f3.doInitBody();
                }
                fs = (java.lang.Object) _jspx_page_context.findAttribute("fs");
                do {
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t<div class=\"interestAvtiveDetail\">\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t【\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t");
                  if (_jspx_meth_bean_005fwrite_005f66(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
                    return;
                  out.write("\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t】\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\thref=\"shareDetail.do?id=");
                  if (_jspx_meth_bean_005fwrite_005f67(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
                    return;
                  out.write("\"\r\n");
                  out.write("\t\t\t\t\t\t\t\t\t\ttarget=\"_self\">");
                  if (_jspx_meth_bean_005fwrite_005f68(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
                    return;
                  out.write('(');
                  if (_jspx_meth_bean_005fwrite_005f69(_jspx_th_logic_005fiterate_005f3, _jspx_page_context))
                    return;
                  out.write(")</a>\r\n");
                  out.write("\t\t\t\t\t\t\t\t</div>\r\n");
                  out.write("\t\t\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_005fiterate_005f3.doAfterBody();
                  fs = (java.lang.Object) _jspx_page_context.findAttribute("fs");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_005fiterate_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_logic_005fiterate_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
                return;
              }
              _005fjspx_005ftagPool_005flogic_005fiterate_0026_005fname_005fid.reuse(_jspx_th_logic_005fiterate_005f3);
              out.write("\r\n");
              out.write("\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_logic_005fpresent_005f3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_logic_005fpresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
            return;
          }
          _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f3);
          out.write("\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--可能认识的人-->\r\n");
          out.write("\t\t\t\t\t<div class=\"knownPerson\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"knownTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t可能认识的晒友\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<table class=\"knownPersonDetail\">\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td rowspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"Images/ppleft.jpg\" border=\"0\" /> </a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\">微尘小粒</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button name=\"addFriend\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+加晒友\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t我们有5个共同好友\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t<table>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td rowspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsrc=\"Images/ppleft.jpg\" border=\"0\" /> </a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"###\" target=\"_self\">微尘小粒</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button name=\"addFriend\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+加晒友\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"2\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t我们有5个共同好友\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t</table>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--意见反馈-->\r\n");
          out.write("\t\t\t\t\t<div class=\"advise\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"adviseTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t意见反馈\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"adviseDetail\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"javascript:addAdvice();\" target=\"_self\">点击这里</a>提交您的意见，我们将在第一时间处理您的意见和建议。感谢您的参与！\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<!--举报恶意信息-->\r\n");
          out.write("\t\t\t\t\t<div class=\"expose\">\r\n");
          out.write("\t\t\t\t\t\t<div class=\"exposeTitle\">\r\n");
          out.write("\t\t\t\t\t\t\t举报恶意信息\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"exposeDetail\">\r\n");
          out.write("\t\t\t\t\t\t\t<a href=\"javascript:addExpose();\" target=\"_self\">点击这里</a>提交您举报的恶意信息，我们将在第一时间处理您的举报信息。感谢您的参与！\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t</td>\r\n");
          out.write("\t\t\t</tr>\r\n");
          out.write("\t\t</table>\r\n");
          out.write("\t\t<!--版权信息-->\r\n");
          out.write("\t\t<div class=\"copyRight\">\r\n");
          out.write("\t\t\t");
          out.print(session.getAttribute("CopyRight"));
          out.write("\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</div>\r\n");
          out.write("\t");
          out.write("\r\n");
          out.write("<div id=\"showMsg\" class=\"showMsg\"></div>\r\n");
          out.write("<style type=\"text/css\">\r\n");
          out.write(".showMsg{\r\n");
          out.write("\tbackground-color: #32A3D3;\r\n");
          out.write("\tposition: absolute;\r\n");
          out.write("\twidth: 220px;\r\n");
          out.write("\ttext-align: center;\r\n");
          out.write("\tvertical-align: middle;\r\n");
          out.write("\tpadding: 10px 30px;\r\n");
          out.write("\tborder: #CCFF99 1px dashed;\r\n");
          out.write("\tz-index: 10000;\r\n");
          out.write("\tdisplay: none;\r\n");
          out.write("}\r\n");
          out.write("</style>");
          out.write("\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_005fhtml_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_005fhtml_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang.reuse(_jspx_th_html_005fhtml_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fhtml_005fhtml_0026_005flang.reuse(_jspx_th_html_005fhtml_005f0);
      out.write('\r');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_html_005fbase_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:base
    org.apache.struts.taglib.html.BaseTag _jspx_th_html_005fbase_005f0 = (org.apache.struts.taglib.html.BaseTag) _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.get(org.apache.struts.taglib.html.BaseTag.class);
    _jspx_th_html_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fbase_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    int _jspx_eval_html_005fbase_005f0 = _jspx_th_html_005fbase_005f0.doStartTag();
    if (_jspx_th_html_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fbase_005fnobody.reuse(_jspx_th_html_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:form
    org.apache.struts.taglib.html.FormTag _jspx_th_html_005fform_005f0 = (org.apache.struts.taglib.html.FormTag) _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fform_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_html_005fform_005f0.setStyleClass("searchForm");
    _jspx_th_html_005fform_005f0.setAction("/search");
    _jspx_th_html_005fform_005f0.setTarget("_self");
    _jspx_th_html_005fform_005f0.setMethod("post");
    _jspx_th_html_005fform_005f0.setOnsubmit("return onSearch();");
    int _jspx_eval_html_005fform_005f0 = _jspx_th_html_005fform_005f0.doStartTag();
    if (_jspx_eval_html_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_005fselect_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_005ftext_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_html_005fsubmit_005f0(_jspx_th_html_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fform_0026_005ftarget_005fstyleClass_005fonsubmit_005fmethod_005faction.reuse(_jspx_th_html_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fselect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:select
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_005fselect_005f0 = (org.apache.struts.taglib.html.SelectTag) _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_005fselect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fselect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fselect_005f0.setProperty("searchType");
    _jspx_th_html_005fselect_005f0.setStyleId("searchType");
    _jspx_th_html_005fselect_005f0.setName("searchType");
    _jspx_th_html_005fselect_005f0.setValue("1");
    int _jspx_eval_html_005fselect_005f0 = _jspx_th_html_005fselect_005f0.doStartTag();
    if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fselect_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fselect_005f0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_005foption_005f0(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_005foption_005f1(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t");
        if (_jspx_meth_html_005foption_005f2(_jspx_th_html_005fselect_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_005fselect_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fselect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fselect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname.reuse(_jspx_th_html_005fselect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fselect_0026_005fvalue_005fstyleId_005fproperty_005fname.reuse(_jspx_th_html_005fselect_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f0 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    _jspx_th_html_005foption_005f0.setValue("1");
    int _jspx_eval_html_005foption_005f0 = _jspx_th_html_005foption_005f0.doStartTag();
    if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f0.doInitBody();
      }
      do {
        out.write('贴');
        out.write('士');
        int evalDoAfterBody = _jspx_th_html_005foption_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f1 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    _jspx_th_html_005foption_005f1.setValue("2");
    int _jspx_eval_html_005foption_005f1 = _jspx_th_html_005foption_005f1.doStartTag();
    if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f1.doInitBody();
      }
      do {
        out.write('地');
        out.write('盘');
        int evalDoAfterBody = _jspx_th_html_005foption_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005foption_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fselect_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:option
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_005foption_005f2 = (org.apache.struts.taglib.html.OptionTag) _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_005foption_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005foption_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fselect_005f0);
    _jspx_th_html_005foption_005f2.setValue("3");
    int _jspx_eval_html_005foption_005f2 = _jspx_th_html_005foption_005f2.doStartTag();
    if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005foption_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005foption_005f2.doInitBody();
      }
      do {
        out.write('晒');
        out.write('友');
        int evalDoAfterBody = _jspx_th_html_005foption_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005foption_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005foption_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005foption_0026_005fvalue.reuse(_jspx_th_html_005foption_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005ftext_005f0.setProperty("searchKey");
    _jspx_th_html_005ftext_005f0.setStyleId("searchKey");
    int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
    if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f0 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f0);
    _jspx_th_html_005fsubmit_005f0.setProperty("goSearch");
    _jspx_th_html_005fsubmit_005f0.setValue("Go");
    int _jspx_eval_html_005fsubmit_005f0 = _jspx_th_html_005fsubmit_005f0.doStartTag();
    if (_jspx_th_html_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_html_005fsubmit_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f0 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f0.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_bean_005fwrite_005f0.setName("curUser");
    _jspx_th_bean_005fwrite_005f0.setProperty("photo");
    int _jspx_eval_bean_005fwrite_005f0 = _jspx_th_bean_005fwrite_005f0.doStartTag();
    if (_jspx_th_bean_005fwrite_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f1 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f1.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_bean_005fwrite_005f1.setName("curUser");
    _jspx_th_bean_005fwrite_005f1.setProperty("userId");
    int _jspx_eval_bean_005fwrite_005f1 = _jspx_th_bean_005fwrite_005f1.doStartTag();
    if (_jspx_th_bean_005fwrite_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f0 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_logic_005fnotPresent_005f0.setName("lastActive");
    int _jspx_eval_logic_005fnotPresent_005f0 = _jspx_th_logic_005fnotPresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveText\">您还没有发布活动，赶快去发布吧！</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f0);
    return false;
  }

  private boolean _jspx_meth_logic_005fpresent_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:present
    org.apache.struts.taglib.logic.PresentTag _jspx_th_logic_005fpresent_005f0 = (org.apache.struts.taglib.logic.PresentTag) _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.get(org.apache.struts.taglib.logic.PresentTag.class);
    _jspx_th_logic_005fpresent_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fpresent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_logic_005fpresent_005f0.setName("lastActive");
    int _jspx_eval_logic_005fpresent_005f0 = _jspx_th_logic_005fpresent_005f0.doStartTag();
    if (_jspx_eval_logic_005fpresent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveText\">【");
        if (_jspx_meth_bean_005fwrite_005f2(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write('】');
        out.write('【');
        if (_jspx_meth_bean_005fwrite_005f3(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write('~');
        if (_jspx_meth_bean_005fwrite_005f4(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write('】');
        out.write('【');
        if (_jspx_meth_bean_005fwrite_005f5(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("】</span><br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveDetail\">");
        if (_jspx_meth_bean_005fwrite_005f6(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write(" </span><br />\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"currentActiveInfo\">已有<span id=\"joinCnt\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"currentActiveJoinCnt\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tonmouseover=\"cntOnMouseOver(this);\"  onmouseout=\"cntOnMouseOut(this);\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"getCntList(0,");
        if (_jspx_meth_bean_005fwrite_005f7(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write(");\">");
        if (_jspx_meth_bean_005fwrite_005f8(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</span>人参加，\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"viewCnt\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tclass=\"currentActiveViewCnt\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tonmouseover=\"cntOnMouseOver(this);\"  onmouseout=\"cntOnMouseOut(this);\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"getCntList(this,1,");
        if (_jspx_meth_bean_005fwrite_005f9(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write(");\">");
        if (_jspx_meth_bean_005fwrite_005f10(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("</span>人围观</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f0(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f1(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_logic_005fequal_005f2(_jspx_th_logic_005fpresent_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fpresent_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fpresent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fpresent_0026_005fname.reuse(_jspx_th_logic_005fpresent_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f2 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f2.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f2.setName("lastActive");
    _jspx_th_bean_005fwrite_005f2.setProperty("shareType.typeName");
    int _jspx_eval_bean_005fwrite_005f2 = _jspx_th_bean_005fwrite_005f2.doStartTag();
    if (_jspx_th_bean_005fwrite_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f3 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f3.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f3.setName("lastActive");
    _jspx_th_bean_005fwrite_005f3.setProperty("startDate");
    int _jspx_eval_bean_005fwrite_005f3 = _jspx_th_bean_005fwrite_005f3.doStartTag();
    if (_jspx_th_bean_005fwrite_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f4 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f4.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f4.setName("lastActive");
    _jspx_th_bean_005fwrite_005f4.setProperty("endDate");
    int _jspx_eval_bean_005fwrite_005f4 = _jspx_th_bean_005fwrite_005f4.doStartTag();
    if (_jspx_th_bean_005fwrite_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f5 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f5.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f5.setName("lastActive");
    _jspx_th_bean_005fwrite_005f5.setProperty("location");
    int _jspx_eval_bean_005fwrite_005f5 = _jspx_th_bean_005fwrite_005f5.doStartTag();
    if (_jspx_th_bean_005fwrite_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f6 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f6.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f6.setName("lastActive");
    _jspx_th_bean_005fwrite_005f6.setProperty("title");
    _jspx_th_bean_005fwrite_005f6.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f6 = _jspx_th_bean_005fwrite_005f6.doStartTag();
    if (_jspx_th_bean_005fwrite_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f7 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f7.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f7.setName("lastActive");
    _jspx_th_bean_005fwrite_005f7.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f7 = _jspx_th_bean_005fwrite_005f7.doStartTag();
    if (_jspx_th_bean_005fwrite_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f8 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f8.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f8.setName("lastActive");
    _jspx_th_bean_005fwrite_005f8.setProperty("joinCount");
    int _jspx_eval_bean_005fwrite_005f8 = _jspx_th_bean_005fwrite_005f8.doStartTag();
    if (_jspx_th_bean_005fwrite_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f9 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f9.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f9.setName("lastActive");
    _jspx_th_bean_005fwrite_005f9.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f9 = _jspx_th_bean_005fwrite_005f9.doStartTag();
    if (_jspx_th_bean_005fwrite_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f10 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f10.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_bean_005fwrite_005f10.setName("lastActive");
    _jspx_th_bean_005fwrite_005f10.setProperty("viewCount");
    int _jspx_eval_bean_005fwrite_005f10 = _jspx_th_bean_005fwrite_005f10.doStartTag();
    if (_jspx_th_bean_005fwrite_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f10);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f0 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_logic_005fequal_005f0.setName("lastActive");
    _jspx_th_logic_005fequal_005f0.setProperty("status");
    _jspx_th_logic_005fequal_005f0.setValue("0");
    int _jspx_eval_logic_005fequal_005f0 = _jspx_th_logic_005fequal_005f0.doStartTag();
    if (_jspx_eval_logic_005fequal_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button id=\"finishBtn\" class=\"finishJoinBtn\" onclick=\"finish(0,");
        if (_jspx_meth_bean_005fwrite_005f11(_jspx_th_logic_005fequal_005f0, _jspx_page_context))
          return true;
        out.write(");\">结束报名</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f11 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f11.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f0);
    _jspx_th_bean_005fwrite_005f11.setName("lastActive");
    _jspx_th_bean_005fwrite_005f11.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f11 = _jspx_th_bean_005fwrite_005f11.doStartTag();
    if (_jspx_th_bean_005fwrite_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f11);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f1 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_logic_005fequal_005f1.setName("lastActive");
    _jspx_th_logic_005fequal_005f1.setProperty("status");
    _jspx_th_logic_005fequal_005f1.setValue("1");
    int _jspx_eval_logic_005fequal_005f1 = _jspx_th_logic_005fequal_005f1.doStartTag();
    if (_jspx_eval_logic_005fequal_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button id=\"finishBtn\" class=\"finishActiveBtn\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"finish(1,");
        if (_jspx_meth_bean_005fwrite_005f12(_jspx_th_logic_005fequal_005f1, _jspx_page_context))
          return true;
        out.write(");\">结束活动</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f12 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f12.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f1);
    _jspx_th_bean_005fwrite_005f12.setName("lastActive");
    _jspx_th_bean_005fwrite_005f12.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f12 = _jspx_th_bean_005fwrite_005f12.doStartTag();
    if (_jspx_th_bean_005fwrite_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f12);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f2 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f0);
    _jspx_th_logic_005fequal_005f2.setName("lastActive");
    _jspx_th_logic_005fequal_005f2.setProperty("status");
    _jspx_th_logic_005fequal_005f2.setValue("2");
    int _jspx_eval_logic_005fequal_005f2 = _jspx_th_logic_005fequal_005f2.doStartTag();
    if (_jspx_eval_logic_005fequal_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t<button id=\"finishBtn\" class=\"finishedActiveBtn\">活动已结束</button>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f2);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f3 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_logic_005fequal_005f3.setValue("0");
    _jspx_th_logic_005fequal_005f3.setName("firstIndex");
    int _jspx_eval_logic_005fequal_005f3 = _jspx_th_logic_005fequal_005f3.doStartTag();
    if (_jspx_eval_logic_005fequal_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_html_005fhidden_005f0(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"selectedType\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"setShareType(this,");
        if (_jspx_meth_bean_005fwrite_005f13(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
          return true;
        out.write(");\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f14(_jspx_th_logic_005fequal_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fequal_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f0 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f0.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    _jspx_th_html_005fhidden_005f0.setProperty("typeValue");
    _jspx_th_html_005fhidden_005f0.setStyleId("typeValue");
    int _jspx_eval_html_005fhidden_005f0 = _jspx_th_html_005fhidden_005f0.doStartTag();
    if (_jspx_th_html_005fhidden_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f13 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f13.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    _jspx_th_bean_005fwrite_005f13.setName("st");
    _jspx_th_bean_005fwrite_005f13.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f13 = _jspx_th_bean_005fwrite_005f13.doStartTag();
    if (_jspx_th_bean_005fwrite_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f13);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f14 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f14.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f3);
    _jspx_th_bean_005fwrite_005f14.setName("st");
    _jspx_th_bean_005fwrite_005f14.setProperty("typeName");
    int _jspx_eval_bean_005fwrite_005f14 = _jspx_th_bean_005fwrite_005f14.doStartTag();
    if (_jspx_th_bean_005fwrite_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f14);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotEqual_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notEqual
    org.apache.struts.taglib.logic.NotEqualTag _jspx_th_logic_005fnotEqual_005f0 = (org.apache.struts.taglib.logic.NotEqualTag) _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.get(org.apache.struts.taglib.logic.NotEqualTag.class);
    _jspx_th_logic_005fnotEqual_005f0.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotEqual_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f0);
    _jspx_th_logic_005fnotEqual_005f0.setValue("0");
    _jspx_th_logic_005fnotEqual_005f0.setName("firstIndex");
    int _jspx_eval_logic_005fnotEqual_005f0 = _jspx_th_logic_005fnotEqual_005f0.doStartTag();
    if (_jspx_eval_logic_005fnotEqual_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<li class=\"spanLink\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"setShareType(this,");
        if (_jspx_meth_bean_005fwrite_005f15(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
          return true;
        out.write(");\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_bean_005fwrite_005f16(_jspx_th_logic_005fnotEqual_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotEqual_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotEqual_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotEqual_0026_005fvalue_005fname.reuse(_jspx_th_logic_005fnotEqual_005f0);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f15 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f15.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    _jspx_th_bean_005fwrite_005f15.setName("st");
    _jspx_th_bean_005fwrite_005f15.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f15 = _jspx_th_bean_005fwrite_005f15.doStartTag();
    if (_jspx_th_bean_005fwrite_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f15);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fnotEqual_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f16 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f16.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fnotEqual_005f0);
    _jspx_th_bean_005fwrite_005f16.setName("st");
    _jspx_th_bean_005fwrite_005f16.setProperty("typeName");
    int _jspx_eval_bean_005fwrite_005f16 = _jspx_th_bean_005fwrite_005f16.doStartTag();
    if (_jspx_th_bean_005fwrite_005f16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f16);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f1 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005ftext_005f1.setProperty("startTime");
    _jspx_th_html_005ftext_005f1.setReadonly(true);
    _jspx_th_html_005ftext_005f1.setStyleId("startTime");
    _jspx_th_html_005ftext_005f1.setSize("16");
    int _jspx_eval_html_005ftext_005f1 = _jspx_th_html_005ftext_005f1.doStartTag();
    if (_jspx_th_html_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f2 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005ftext_005f2.setProperty("endTime");
    _jspx_th_html_005ftext_005f2.setReadonly(true);
    _jspx_th_html_005ftext_005f2.setStyleId("endTime");
    _jspx_th_html_005ftext_005f2.setSize("16");
    int _jspx_eval_html_005ftext_005f2 = _jspx_th_html_005ftext_005f2.doStartTag();
    if (_jspx_th_html_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f3 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005ftext_005f3.setProperty("activeLocation");
    _jspx_th_html_005ftext_005f3.setStyleId("activeLocation");
    _jspx_th_html_005ftext_005f3.setReadonly(true);
    _jspx_th_html_005ftext_005f3.setMaxlength("50");
    _jspx_th_html_005ftext_005f3.setSize("30");
    _jspx_th_html_005ftext_005f3.setOnfocus("$EDITORUI['edui21']._onClick();");
    _jspx_th_html_005ftext_005f3.setOnclick("$EDITORUI['edui21']._onClick();");
    int _jspx_eval_html_005ftext_005f3 = _jspx_th_html_005ftext_005f3.doStartTag();
    if (_jspx_th_html_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005freadonly_005fproperty_005fonfocus_005fonclick_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f1 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005fhidden_005f1.setProperty("lat");
    int _jspx_eval_html_005fhidden_005f1 = _jspx_th_html_005fhidden_005f1.doStartTag();
    if (_jspx_th_html_005fhidden_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f1);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f2 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f2.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005fhidden_005f2.setProperty("lng");
    int _jspx_eval_html_005fhidden_005f2 = _jspx_th_html_005fhidden_005f2.doStartTag();
    if (_jspx_th_html_005fhidden_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f2);
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f4 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_html_005ftext_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005ftext_005f4.setProperty("activeTitle");
    _jspx_th_html_005ftext_005f4.setStyleId("activeTitle");
    _jspx_th_html_005ftext_005f4.setMaxlength("20");
    _jspx_th_html_005ftext_005f4.setSize("30");
    int _jspx_eval_html_005ftext_005f4 = _jspx_th_html_005ftext_005f4.doStartTag();
    if (_jspx_th_html_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fstyleId_005fsize_005fproperty_005fmaxlength_005fnobody.reuse(_jspx_th_html_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f17(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f17 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f17.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_bean_005fwrite_005f17.setName("curUser");
    _jspx_th_bean_005fwrite_005f17.setProperty("school.id");
    int _jspx_eval_bean_005fwrite_005f17 = _jspx_th_bean_005fwrite_005f17.doStartTag();
    if (_jspx_th_bean_005fwrite_005f17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f17);
    return false;
  }

  private boolean _jspx_meth_html_005fhidden_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:hidden
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_005fhidden_005f3 = (org.apache.struts.taglib.html.HiddenTag) _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_005fhidden_005f3.setPageContext(_jspx_page_context);
    _jspx_th_html_005fhidden_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005fhidden_005f3.setProperty("schoolId");
    _jspx_th_html_005fhidden_005f3.setStyleId("schoolId");
    _jspx_th_html_005fhidden_005f3.setValue("1");
    int _jspx_eval_html_005fhidden_005f3 = _jspx_th_html_005fhidden_005f3.doStartTag();
    if (_jspx_th_html_005fhidden_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fhidden_0026_005fvalue_005fstyleId_005fproperty_005fnobody.reuse(_jspx_th_html_005fhidden_005f3);
    return false;
  }

  private boolean _jspx_meth_html_005fsubmit_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fform_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  html:submit
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_005fsubmit_005f1 = (org.apache.struts.taglib.html.SubmitTag) _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_005fsubmit_005f1.setPageContext(_jspx_page_context);
    _jspx_th_html_005fsubmit_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fform_005f1);
    _jspx_th_html_005fsubmit_005f1.setProperty("submitActive");
    int _jspx_eval_html_005fsubmit_005f1 = _jspx_th_html_005fsubmit_005f1.doStartTag();
    if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_html_005fsubmit_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_html_005fsubmit_005f1.doInitBody();
      }
      do {
        out.write("晒一晒/\\不缺钙");
        int evalDoAfterBody = _jspx_th_html_005fsubmit_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_005fsubmit_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_html_005fsubmit_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fhtml_005fsubmit_0026_005fproperty.reuse(_jspx_th_html_005fsubmit_005f1);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f1 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f1.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_logic_005fnotPresent_005f1.setName("shareList");
    int _jspx_eval_logic_005fnotPresent_005f1 = _jspx_th_logic_005fnotPresent_005f1.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<div class=\"oneActive\">\r\n");
        out.write("\t\t\t\t\t\t\t\t\t暂无新鲜事！\r\n");
        out.write("\t\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f1);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f18 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f18.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    _jspx_th_bean_005fwrite_005f18.setName("firstShareId");
    int _jspx_eval_bean_005fwrite_005f18 = _jspx_th_bean_005fwrite_005f18.doStartTag();
    if (_jspx_th_bean_005fwrite_005f18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f18);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f19(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f19 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f19.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    _jspx_th_bean_005fwrite_005f19.setName("lastShareId");
    int _jspx_eval_bean_005fwrite_005f19 = _jspx_th_bean_005fwrite_005f19.doStartTag();
    if (_jspx_th_bean_005fwrite_005f19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f19);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f20(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fpresent_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f20 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f20.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fpresent_005f1);
    _jspx_th_bean_005fwrite_005f20.setName("pageSize");
    int _jspx_eval_bean_005fwrite_005f20 = _jspx_th_bean_005fwrite_005f20.doStartTag();
    if (_jspx_th_bean_005fwrite_005f20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f20);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f21(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f21 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f21.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f21.setName("sl");
    _jspx_th_bean_005fwrite_005f21.setProperty("users.photo");
    int _jspx_eval_bean_005fwrite_005f21 = _jspx_th_bean_005fwrite_005f21.doStartTag();
    if (_jspx_th_bean_005fwrite_005f21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f21);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f22(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f22 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f22.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f22.setName("sl");
    _jspx_th_bean_005fwrite_005f22.setProperty("users.userId");
    int _jspx_eval_bean_005fwrite_005f22 = _jspx_th_bean_005fwrite_005f22.doStartTag();
    if (_jspx_th_bean_005fwrite_005f22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f22);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f23(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f23 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f23.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f23.setName("sl");
    _jspx_th_bean_005fwrite_005f23.setProperty("users.userName");
    int _jspx_eval_bean_005fwrite_005f23 = _jspx_th_bean_005fwrite_005f23.doStartTag();
    if (_jspx_th_bean_005fwrite_005f23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f23);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f24(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f24 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f24.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f24.setName("sl");
    _jspx_th_bean_005fwrite_005f24.setProperty("users.school.schoolName");
    int _jspx_eval_bean_005fwrite_005f24 = _jspx_th_bean_005fwrite_005f24.doStartTag();
    if (_jspx_th_bean_005fwrite_005f24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f24);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f25(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f25 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f25.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f25.setName("sl");
    _jspx_th_bean_005fwrite_005f25.setProperty("shareType.typeName");
    int _jspx_eval_bean_005fwrite_005f25 = _jspx_th_bean_005fwrite_005f25.doStartTag();
    if (_jspx_th_bean_005fwrite_005f25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f25);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f26(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f26 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f26.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f26.setName("sl");
    _jspx_th_bean_005fwrite_005f26.setProperty("startDate");
    int _jspx_eval_bean_005fwrite_005f26 = _jspx_th_bean_005fwrite_005f26.doStartTag();
    if (_jspx_th_bean_005fwrite_005f26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f26);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f27(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f27 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f27.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f27.setName("sl");
    _jspx_th_bean_005fwrite_005f27.setProperty("endDate");
    int _jspx_eval_bean_005fwrite_005f27 = _jspx_th_bean_005fwrite_005f27.doStartTag();
    if (_jspx_th_bean_005fwrite_005f27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f27);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f28(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f28 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f28.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f28.setName("sl");
    _jspx_th_bean_005fwrite_005f28.setProperty("longitude");
    int _jspx_eval_bean_005fwrite_005f28 = _jspx_th_bean_005fwrite_005f28.doStartTag();
    if (_jspx_th_bean_005fwrite_005f28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f28);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f29(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f29 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f29.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f29.setName("sl");
    _jspx_th_bean_005fwrite_005f29.setProperty("latitude");
    int _jspx_eval_bean_005fwrite_005f29 = _jspx_th_bean_005fwrite_005f29.doStartTag();
    if (_jspx_th_bean_005fwrite_005f29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f29);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f30(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f30 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f30.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f30.setName("sl");
    _jspx_th_bean_005fwrite_005f30.setProperty("location");
    int _jspx_eval_bean_005fwrite_005f30 = _jspx_th_bean_005fwrite_005f30.doStartTag();
    if (_jspx_th_bean_005fwrite_005f30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f30);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f31(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f31 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f31.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f31.setName("sl");
    _jspx_th_bean_005fwrite_005f31.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f31 = _jspx_th_bean_005fwrite_005f31.doStartTag();
    if (_jspx_th_bean_005fwrite_005f31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f31);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f32(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f32 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f32.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f32.setName("sl");
    _jspx_th_bean_005fwrite_005f32.setProperty("title");
    _jspx_th_bean_005fwrite_005f32.setFilter(false);
    int _jspx_eval_bean_005fwrite_005f32 = _jspx_th_bean_005fwrite_005f32.doStartTag();
    if (_jspx_th_bean_005fwrite_005f32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005ffilter_005fnobody.reuse(_jspx_th_bean_005fwrite_005f32);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f33(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f33 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f33.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f33.setName("sl");
    _jspx_th_bean_005fwrite_005f33.setProperty("addTime");
    int _jspx_eval_bean_005fwrite_005f33 = _jspx_th_bean_005fwrite_005f33.doStartTag();
    if (_jspx_th_bean_005fwrite_005f33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f33);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f4 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f4.setName("sl");
    _jspx_th_logic_005fequal_005f4.setProperty("submitFrom");
    _jspx_th_logic_005fequal_005f4.setValue("0");
    int _jspx_eval_logic_005fequal_005f4 = _jspx_th_logic_005fequal_005f4.doStartTag();
    if (_jspx_eval_logic_005fequal_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t来自WeShare\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f4);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f34(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f34 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f34.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f34.setName("sl");
    _jspx_th_bean_005fwrite_005f34.setProperty("submitFrom");
    int _jspx_eval_bean_005fwrite_005f34 = _jspx_th_bean_005fwrite_005f34.doStartTag();
    if (_jspx_th_bean_005fwrite_005f34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f34);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f5 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f5.setName("sl");
    _jspx_th_logic_005fequal_005f5.setProperty("joinStatus");
    _jspx_th_logic_005fequal_005f5.setValue("0");
    int _jspx_eval_logic_005fequal_005f5 = _jspx_th_logic_005fequal_005f5.doStartTag();
    if (_jspx_eval_logic_005fequal_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\" id=\"joinTxt");
        if (_jspx_meth_bean_005fwrite_005f35(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write("\" onclick=\"updateCnt(this,");
        if (_jspx_meth_bean_005fwrite_005f36(_jspx_th_logic_005fequal_005f5, _jspx_page_context))
          return true;
        out.write(",0,0,true);\">参与</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f5);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f35(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f35 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f35.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    _jspx_th_bean_005fwrite_005f35.setName("sl");
    _jspx_th_bean_005fwrite_005f35.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f35 = _jspx_th_bean_005fwrite_005f35.doStartTag();
    if (_jspx_th_bean_005fwrite_005f35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f35);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f36(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f36 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f36.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f5);
    _jspx_th_bean_005fwrite_005f36.setName("sl");
    _jspx_th_bean_005fwrite_005f36.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f36 = _jspx_th_bean_005fwrite_005f36.doStartTag();
    if (_jspx_th_bean_005fwrite_005f36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f36);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f6 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f6.setName("sl");
    _jspx_th_logic_005fequal_005f6.setProperty("joinStatus");
    _jspx_th_logic_005fequal_005f6.setValue("1");
    int _jspx_eval_logic_005fequal_005f6 = _jspx_th_logic_005fequal_005f6.doStartTag();
    if (_jspx_eval_logic_005fequal_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\" id=\"joinTxt");
        if (_jspx_meth_bean_005fwrite_005f37(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
          return true;
        out.write("\" onclick=\"updateCnt(this,");
        if (_jspx_meth_bean_005fwrite_005f38(_jspx_th_logic_005fequal_005f6, _jspx_page_context))
          return true;
        out.write(",0,1,true);\">取消参与</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f6);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f37(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f37 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f37.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    _jspx_th_bean_005fwrite_005f37.setName("sl");
    _jspx_th_bean_005fwrite_005f37.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f37 = _jspx_th_bean_005fwrite_005f37.doStartTag();
    if (_jspx_th_bean_005fwrite_005f37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f37);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f38(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f38 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f38.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f6);
    _jspx_th_bean_005fwrite_005f38.setName("sl");
    _jspx_th_bean_005fwrite_005f38.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f38 = _jspx_th_bean_005fwrite_005f38.doStartTag();
    if (_jspx_th_bean_005fwrite_005f38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f38);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f7 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f7.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f7.setName("sl");
    _jspx_th_logic_005fequal_005f7.setProperty("joinStatus");
    _jspx_th_logic_005fequal_005f7.setValue("2");
    int _jspx_eval_logic_005fequal_005f7 = _jspx_th_logic_005fequal_005f7.doStartTag();
    if (_jspx_eval_logic_005fequal_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"clickDisable\" id=\"joinTxt");
        if (_jspx_meth_bean_005fwrite_005f39(_jspx_th_logic_005fequal_005f7, _jspx_page_context))
          return true;
        out.write("\">参与</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f7);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f39(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f39 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f39.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f7);
    _jspx_th_bean_005fwrite_005f39.setName("sl");
    _jspx_th_bean_005fwrite_005f39.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f39 = _jspx_th_bean_005fwrite_005f39.doStartTag();
    if (_jspx_th_bean_005fwrite_005f39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f39);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f8 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f8.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f8.setName("sl");
    _jspx_th_logic_005fequal_005f8.setProperty("joinStatus");
    _jspx_th_logic_005fequal_005f8.setValue("3");
    int _jspx_eval_logic_005fequal_005f8 = _jspx_th_logic_005fequal_005f8.doStartTag();
    if (_jspx_eval_logic_005fequal_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"clickDisable\" id=\"joinTxt");
        if (_jspx_meth_bean_005fwrite_005f40(_jspx_th_logic_005fequal_005f8, _jspx_page_context))
          return true;
        out.write("\">参与</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f8);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f40(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f40 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f40.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f40.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f8);
    _jspx_th_bean_005fwrite_005f40.setName("sl");
    _jspx_th_bean_005fwrite_005f40.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f40 = _jspx_th_bean_005fwrite_005f40.doStartTag();
    if (_jspx_th_bean_005fwrite_005f40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f40);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f9 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f9.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f9.setName("sl");
    _jspx_th_logic_005fequal_005f9.setProperty("joinStatus");
    _jspx_th_logic_005fequal_005f9.setValue("4");
    int _jspx_eval_logic_005fequal_005f9 = _jspx_th_logic_005fequal_005f9.doStartTag();
    if (_jspx_eval_logic_005fequal_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"clickDisable\" id=\"joinTxt");
        if (_jspx_meth_bean_005fwrite_005f41(_jspx_th_logic_005fequal_005f9, _jspx_page_context))
          return true;
        out.write("\">已参与</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f9);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f41(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f41 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f41.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f41.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f9);
    _jspx_th_bean_005fwrite_005f41.setName("sl");
    _jspx_th_bean_005fwrite_005f41.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f41 = _jspx_th_bean_005fwrite_005f41.doStartTag();
    if (_jspx_th_bean_005fwrite_005f41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f41);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f42(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f42 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f42.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f42.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f42.setName("sl");
    _jspx_th_bean_005fwrite_005f42.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f42 = _jspx_th_bean_005fwrite_005f42.doStartTag();
    if (_jspx_th_bean_005fwrite_005f42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f42);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f43(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f43 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f43.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f43.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f43.setName("sl");
    _jspx_th_bean_005fwrite_005f43.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f43 = _jspx_th_bean_005fwrite_005f43.doStartTag();
    if (_jspx_th_bean_005fwrite_005f43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f43);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f44(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f44 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f44.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f44.setName("sl");
    _jspx_th_bean_005fwrite_005f44.setProperty("joinCount");
    int _jspx_eval_bean_005fwrite_005f44 = _jspx_th_bean_005fwrite_005f44.doStartTag();
    if (_jspx_th_bean_005fwrite_005f44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f44);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f10 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f10.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f10.setName("sl");
    _jspx_th_logic_005fequal_005f10.setProperty("viewStatus");
    _jspx_th_logic_005fequal_005f10.setValue("0");
    int _jspx_eval_logic_005fequal_005f10 = _jspx_th_logic_005fequal_005f10.doStartTag();
    if (_jspx_eval_logic_005fequal_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\" id=\"viewTxt");
        if (_jspx_meth_bean_005fwrite_005f45(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
          return true;
        out.write("\" onclick=\"updateCnt(this,");
        if (_jspx_meth_bean_005fwrite_005f46(_jspx_th_logic_005fequal_005f10, _jspx_page_context))
          return true;
        out.write(",1,0,true);\">围观</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f10);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f45(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f45 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f45.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f45.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    _jspx_th_bean_005fwrite_005f45.setName("sl");
    _jspx_th_bean_005fwrite_005f45.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f45 = _jspx_th_bean_005fwrite_005f45.doStartTag();
    if (_jspx_th_bean_005fwrite_005f45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f45);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f46(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f46 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f46.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f46.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f10);
    _jspx_th_bean_005fwrite_005f46.setName("sl");
    _jspx_th_bean_005fwrite_005f46.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f46 = _jspx_th_bean_005fwrite_005f46.doStartTag();
    if (_jspx_th_bean_005fwrite_005f46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f46);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f11 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f11.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f11.setName("sl");
    _jspx_th_logic_005fequal_005f11.setProperty("viewStatus");
    _jspx_th_logic_005fequal_005f11.setValue("1");
    int _jspx_eval_logic_005fequal_005f11 = _jspx_th_logic_005fequal_005f11.doStartTag();
    if (_jspx_eval_logic_005fequal_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"spanLink\" id=\"viewTxt");
        if (_jspx_meth_bean_005fwrite_005f47(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
          return true;
        out.write("\" onclick=\"updateCnt(this,");
        if (_jspx_meth_bean_005fwrite_005f48(_jspx_th_logic_005fequal_005f11, _jspx_page_context))
          return true;
        out.write(",1,1,true);\">取消围观</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f11);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f47(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f47 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f47.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f47.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    _jspx_th_bean_005fwrite_005f47.setName("sl");
    _jspx_th_bean_005fwrite_005f47.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f47 = _jspx_th_bean_005fwrite_005f47.doStartTag();
    if (_jspx_th_bean_005fwrite_005f47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f47);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f48(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f48 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f48.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f48.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f11);
    _jspx_th_bean_005fwrite_005f48.setName("sl");
    _jspx_th_bean_005fwrite_005f48.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f48 = _jspx_th_bean_005fwrite_005f48.doStartTag();
    if (_jspx_th_bean_005fwrite_005f48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f48);
    return false;
  }

  private boolean _jspx_meth_logic_005fequal_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:equal
    org.apache.struts.taglib.logic.EqualTag _jspx_th_logic_005fequal_005f12 = (org.apache.struts.taglib.logic.EqualTag) _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.get(org.apache.struts.taglib.logic.EqualTag.class);
    _jspx_th_logic_005fequal_005f12.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fequal_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_logic_005fequal_005f12.setName("sl");
    _jspx_th_logic_005fequal_005f12.setProperty("viewStatus");
    _jspx_th_logic_005fequal_005f12.setValue("2");
    int _jspx_eval_logic_005fequal_005f12 = _jspx_th_logic_005fequal_005f12.doStartTag();
    if (_jspx_eval_logic_005fequal_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"clickDisable\" id=\"viewTxt");
        if (_jspx_meth_bean_005fwrite_005f49(_jspx_th_logic_005fequal_005f12, _jspx_page_context))
          return true;
        out.write("\">围观</span>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fequal_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fequal_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fequal_0026_005fvalue_005fproperty_005fname.reuse(_jspx_th_logic_005fequal_005f12);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f49(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fequal_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f49 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f49.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f49.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fequal_005f12);
    _jspx_th_bean_005fwrite_005f49.setName("sl");
    _jspx_th_bean_005fwrite_005f49.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f49 = _jspx_th_bean_005fwrite_005f49.doStartTag();
    if (_jspx_th_bean_005fwrite_005f49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f49);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f50(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f50 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f50.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f50.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f50.setName("sl");
    _jspx_th_bean_005fwrite_005f50.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f50 = _jspx_th_bean_005fwrite_005f50.doStartTag();
    if (_jspx_th_bean_005fwrite_005f50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f50);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f50);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f51(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f51 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f51.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f51.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f51.setName("sl");
    _jspx_th_bean_005fwrite_005f51.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f51 = _jspx_th_bean_005fwrite_005f51.doStartTag();
    if (_jspx_th_bean_005fwrite_005f51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f51);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f51);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f52(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f52 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f52.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f52.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f52.setName("sl");
    _jspx_th_bean_005fwrite_005f52.setProperty("viewCount");
    int _jspx_eval_bean_005fwrite_005f52 = _jspx_th_bean_005fwrite_005f52.doStartTag();
    if (_jspx_th_bean_005fwrite_005f52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f52);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f52);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f53(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f53 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f53.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f53.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f53.setName("sl");
    _jspx_th_bean_005fwrite_005f53.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f53 = _jspx_th_bean_005fwrite_005f53.doStartTag();
    if (_jspx_th_bean_005fwrite_005f53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f53);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f53);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f54(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f54 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f54.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f54.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f54.setName("sl");
    _jspx_th_bean_005fwrite_005f54.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f54 = _jspx_th_bean_005fwrite_005f54.doStartTag();
    if (_jspx_th_bean_005fwrite_005f54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f54);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f54);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f55(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f55 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f55.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f55.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f55.setName("sl");
    _jspx_th_bean_005fwrite_005f55.setProperty("commentCount");
    int _jspx_eval_bean_005fwrite_005f55 = _jspx_th_bean_005fwrite_005f55.doStartTag();
    if (_jspx_th_bean_005fwrite_005f55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f55);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f55);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f56(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f56 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f56.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f56.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f56.setName("sl");
    _jspx_th_bean_005fwrite_005f56.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f56 = _jspx_th_bean_005fwrite_005f56.doStartTag();
    if (_jspx_th_bean_005fwrite_005f56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f56);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f56);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f57(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f57 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f57.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f57.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f57.setName("sl");
    _jspx_th_bean_005fwrite_005f57.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f57 = _jspx_th_bean_005fwrite_005f57.doStartTag();
    if (_jspx_th_bean_005fwrite_005f57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f57);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f57);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f58(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f58 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f58.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f58.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f58.setName("sl");
    _jspx_th_bean_005fwrite_005f58.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f58 = _jspx_th_bean_005fwrite_005f58.doStartTag();
    if (_jspx_th_bean_005fwrite_005f58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f58);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f58);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f59(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f59 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f59.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f59.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f59.setName("sl");
    _jspx_th_bean_005fwrite_005f59.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f59 = _jspx_th_bean_005fwrite_005f59.doStartTag();
    if (_jspx_th_bean_005fwrite_005f59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f59);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f59);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f60(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f60 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f60.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f60.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f1);
    _jspx_th_bean_005fwrite_005f60.setName("sl");
    _jspx_th_bean_005fwrite_005f60.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f60 = _jspx_th_bean_005fwrite_005f60.doStartTag();
    if (_jspx_th_bean_005fwrite_005f60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f60);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f60);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f61(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f61 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f61.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f61.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_bean_005fwrite_005f61.setName("curUser");
    _jspx_th_bean_005fwrite_005f61.setProperty("userId");
    int _jspx_eval_bean_005fwrite_005f61 = _jspx_th_bean_005fwrite_005f61.doStartTag();
    if (_jspx_th_bean_005fwrite_005f61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f61);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f61);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f2 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f2.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_logic_005fnotPresent_005f2.setName("hotShare");
    int _jspx_eval_logic_005fnotPresent_005f2 = _jspx_th_logic_005fnotPresent_005f2.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"hotActiveDetail\">\r\n");
        out.write("\t\t\t\t\t\t\t\t暂无热门活动\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f2);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f62(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f62 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f62.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f62.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    _jspx_th_bean_005fwrite_005f62.setName("hs");
    _jspx_th_bean_005fwrite_005f62.setProperty("shareType.typeName");
    int _jspx_eval_bean_005fwrite_005f62 = _jspx_th_bean_005fwrite_005f62.doStartTag();
    if (_jspx_th_bean_005fwrite_005f62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f62);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f62);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f63(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f63 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f63.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f63.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    _jspx_th_bean_005fwrite_005f63.setName("hs");
    _jspx_th_bean_005fwrite_005f63.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f63 = _jspx_th_bean_005fwrite_005f63.doStartTag();
    if (_jspx_th_bean_005fwrite_005f63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f63);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f63);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f64(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f64 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f64.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f64.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    _jspx_th_bean_005fwrite_005f64.setName("hs");
    _jspx_th_bean_005fwrite_005f64.setProperty("location");
    int _jspx_eval_bean_005fwrite_005f64 = _jspx_th_bean_005fwrite_005f64.doStartTag();
    if (_jspx_th_bean_005fwrite_005f64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f64);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f64);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f65(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f65 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f65.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f65.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f2);
    _jspx_th_bean_005fwrite_005f65.setName("hs");
    _jspx_th_bean_005fwrite_005f65.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f65 = _jspx_th_bean_005fwrite_005f65.doStartTag();
    if (_jspx_th_bean_005fwrite_005f65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f65);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f65);
    return false;
  }

  private boolean _jspx_meth_logic_005fnotPresent_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_html_005fhtml_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  logic:notPresent
    org.apache.struts.taglib.logic.NotPresentTag _jspx_th_logic_005fnotPresent_005f3 = (org.apache.struts.taglib.logic.NotPresentTag) _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.get(org.apache.struts.taglib.logic.NotPresentTag.class);
    _jspx_th_logic_005fnotPresent_005f3.setPageContext(_jspx_page_context);
    _jspx_th_logic_005fnotPresent_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_html_005fhtml_005f0);
    _jspx_th_logic_005fnotPresent_005f3.setName("favShare");
    int _jspx_eval_logic_005fnotPresent_005f3 = _jspx_th_logic_005fnotPresent_005f3.doStartTag();
    if (_jspx_eval_logic_005fnotPresent_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t<div class=\"interestAvtiveDetail\">\r\n");
        out.write("\t\t\t\t\t\t\t\t暂无您可能感兴趣的活动\r\n");
        out.write("\t\t\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_logic_005fnotPresent_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_logic_005fnotPresent_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005flogic_005fnotPresent_0026_005fname.reuse(_jspx_th_logic_005fnotPresent_005f3);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f66(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f66 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f66.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f66.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    _jspx_th_bean_005fwrite_005f66.setName("fs");
    _jspx_th_bean_005fwrite_005f66.setProperty("shareType.typeName");
    int _jspx_eval_bean_005fwrite_005f66 = _jspx_th_bean_005fwrite_005f66.doStartTag();
    if (_jspx_th_bean_005fwrite_005f66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f66);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f66);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f67(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f67 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f67.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f67.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    _jspx_th_bean_005fwrite_005f67.setName("fs");
    _jspx_th_bean_005fwrite_005f67.setProperty("id");
    int _jspx_eval_bean_005fwrite_005f67 = _jspx_th_bean_005fwrite_005f67.doStartTag();
    if (_jspx_th_bean_005fwrite_005f67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f67);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f67);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f68(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f68 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f68.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f68.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    _jspx_th_bean_005fwrite_005f68.setName("fs");
    _jspx_th_bean_005fwrite_005f68.setProperty("location");
    int _jspx_eval_bean_005fwrite_005f68 = _jspx_th_bean_005fwrite_005f68.doStartTag();
    if (_jspx_th_bean_005fwrite_005f68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f68);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f68);
    return false;
  }

  private boolean _jspx_meth_bean_005fwrite_005f69(javax.servlet.jsp.tagext.JspTag _jspx_th_logic_005fiterate_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  bean:write
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_005fwrite_005f69 = (org.apache.struts.taglib.bean.WriteTag) _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_005fwrite_005f69.setPageContext(_jspx_page_context);
    _jspx_th_bean_005fwrite_005f69.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_logic_005fiterate_005f3);
    _jspx_th_bean_005fwrite_005f69.setName("fs");
    _jspx_th_bean_005fwrite_005f69.setProperty("title");
    int _jspx_eval_bean_005fwrite_005f69 = _jspx_th_bean_005fwrite_005f69.doStartTag();
    if (_jspx_th_bean_005fwrite_005f69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f69);
      return true;
    }
    _005fjspx_005ftagPool_005fbean_005fwrite_0026_005fproperty_005fname_005fnobody.reuse(_jspx_th_bean_005fwrite_005f69);
    return false;
  }
}
