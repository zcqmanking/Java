package org.archive.crawler.postprocessor;

import org.archive.crawler.datamodel.CandidateURI;

public class FrontierSchedulerForJD extends FrontierScheduler {

	private static final long serialVersionUID = 1L;

	public FrontierSchedulerForJD(String name) {
		super(name);
	}
	
	/**
	 * ֻ�о��������Ӳ���ץȡ����
	 */
	protected void schedule(CandidateURI caURI){
		String uri = caURI.toString();
		if(uri.contains("360buy.com")){
			getController().getFrontier().schedule(caURI);
		}
	}

}
