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
import com.jhe.struts.form.QianshouForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-17-2011
 * 
 * XDoclet definition:
 * @struts.action path="/qianshou" name="qianshouForm" input="/form/qianshou.jsp" scope="request" validate="true"
 */
public class QianshouAction extends Action {
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
		QianshouForm qianshouForm = (QianshouForm) form;// TODO Auto-generated method stub
		try {
			PrintWriter out = response.getWriter();
			String dh = qianshouForm.getDanhao();
			String qsr = qianshouForm.getQianshouren();
			if (dh.trim().equals("")) {
				out.print("0");
			} else {
				String sql = "insert into QianShou (DanHao,QianShouRen) values ('" + dh + "','" + qsr + "')";
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