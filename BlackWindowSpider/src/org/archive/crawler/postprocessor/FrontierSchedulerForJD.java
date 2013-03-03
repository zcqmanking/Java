package org.archive.crawler.postprocessor;

import org.archive.crawler.datamodel.CandidateURI;

public class FrontierSchedulerForJD extends FrontierScheduler {

	private static final long serialVersionUID = 1L;

	public FrontierSchedulerForJD(String name) {
		super(name);
	}
	
	/**
	 * 只有京东的链接才能抓取下来
	 */
	protected void schedule(CandidateURI caURI){
		String uri = caURI.toString();
		if(uri.contains("360buy.com")){
			getController().getFrontier().schedule(caURI);
		}
	}

}
