package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t<title>为晒网 WeShare</title>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\">\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"为晒,WeShare,分享,社交\">\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/index.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"main_index\">\r\n");
      out.write("\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"\r\n");
      out.write("\t\t\t\twidth=\"60%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\" align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"Images/ppleft.jpg\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"login.jsp\" target=\"_self\"><img src=\"Images/login.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=0 />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\"\r\n");
      out.write("\t\t\t\twidth=\"60%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"reg.jsp\" target=\"_self\"><img src=\"Images/reg.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\tborder=0 />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"150px\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"Images/ppright.jpg\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
}
