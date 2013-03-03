/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.jhe.struts.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jhe.odbc.dbconn.DBManager;
import com.jhe.struts.form.JingangForm;

/**
 * MyEclipse Struts Creation date: 12-15-2011
 * 
 * XDoclet definition:
 * 
 * @struts.action path="/jingang" name="jingangForm" input="/jingang.jsp"
 *                scope="request" validate="true"
 */
public class JingangAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		JingangForm jingangForm = (JingangForm) form;
		try {
			PrintWriter out = response.getWriter();
			String dh = jingangForm.getDanhao();
			if (dh.trim().equals("")) {
				out.print("0");
			} else {
				String sql = "insert into JinGang (DanHao) values ('" + dh + "')";
				DBManager db = new DBManager();
				int cnt = db.doInsert(sql);
				out.print(cnt);
				db.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}