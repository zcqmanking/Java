/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.weshare.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.weshare.struts.form.SearchForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-24-2011
 * 
 * XDoclet definition:
 * @struts.action path="/search" name="searchForm" input="/myPage.jsp" scope="request" validate="true"
 * @struts.action-forward name="searchResult" path="/search.jsp"
 */
public class SearchAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		SearchForm searchForm = (SearchForm) form;
		ActionForward af = new ActionForward();
		return null;
	}
}