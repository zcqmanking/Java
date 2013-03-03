package org.archive.crawler.postprocessor;

import org.archive.crawler.datamodel.CandidateURI;

public class FrontierSchedulerForSohu extends FrontierScheduler {

	private static final long serialVersionUID = 1L;

	public FrontierSchedulerForSohu(String name) {
		super(name);
	}
	
	/**
	 * ֻ���Ѻ�it�����Ӳ���ץȡ����
	 */
	protected void schedule(CandidateURI caURI){
		String uri = caURI.toString();
		if(uri.contains("it.sohu.com")){
			getController().getFrontier().schedule(caURI);
		}
	}

}
