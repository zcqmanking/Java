/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.weshare.struts.form;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * MyEclipse Struts Creation date: 06-04-2011
 * 
 * XDoclet definition:
 * 
 * @struts.form name="loginForm"
 */
@SuppressWarnings("serial")
public class MyPageForm extends ActionForm {

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors err = new ActionErrors();
		String un = null;
		String pw = null;
		HttpSession session = request.getSession();
		un = (String) session.getAttribute("curUserName");
		pw = (String) session.getAttribute("curPassWord");
		if (un == null || un.equals("") || pw == null
				|| pw.equals("")) {						//session�в������û���Ϣ
			Cookie cookies[] = null;
			cookies = request.getCookies();
			if (cookies != null) {
				String strKey;
				for (int i = 0; i < cookies.length; i++) {
					strKey = cookies[i].getName();
					if (strKey.equalsIgnoreCase("curUserName")) {
						un = cookies[i].getValue();
						session.setAttribute("curUserName", un);
					} else if (strKey.equalsIgnoreCase("curPassWord")) {
						pw = cookies[i].getValue();
						session.setAttribute("curPassWord", pw);
					}
				}
			}
		}
		if ((un == null) || (un.equals(""))){
			err.add("usernameErr", new ActionMessage("err.login.username"));
		}
		if ((pw == null) || (pw.equals(""))) {
			err.add("passwordErr", new ActionMessage("err.login.password"));
		}
		return err;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}
}