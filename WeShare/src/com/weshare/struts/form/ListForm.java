/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.weshare.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 10-07-2011
 * 
 * XDoclet definition:
 * @struts.form name="listForm"
 */
@SuppressWarnings("serial")
public class ListForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** uid property */
	private Integer uid;
	
	private Integer lastShareId;
	
	private String reqType;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the uid.
	 * @return Integer
	 */
	public Integer getUid() {
		return uid;
	}

	/** 
	 * Set the uid.
	 * @param uid The uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getLastShareId() {
		return lastShareId;
	}

	public void setLastShareId(Integer lastShareId) {
		this.lastShareId = lastShareId;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}
}