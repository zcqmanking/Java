/**
 * 
 */
package org.archive.crawler.frontier;

import org.archive.crawler.datamodel.CandidateURI;
import org.archive.crawler.framework.CrawlController;

/**
 * 重写QueueAssignmentPolicy类<br>
 * 本类的主要目的是针对同一Host时，爬虫速度过慢问题的修正。<br>
 * 
 * 默认配置queue-assignment-policy中使用的HostnameQueueAssignmentPolicy类
 * 会将同一host下的所有url放置在一个线程中，所以当只爬行一个站点时，速度会很慢。
 * 
 * @author zhaocq
 * 
 */
public class ELFHashQueueAssignmentPolicy extends QueueAssignmentPolicy {

	@Override
	public String getClassKey(CrawlController controller, CandidateURI cauri) {
		return this.ELFHash(cauri.getUURI().toString(), 50) + "";
	}

	public int ELFHash(String str, int number) {
		int hash = 0;
		long x = 0l;
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			hash = (hash << 4) + array[i];
			if ((x = (hash & 0xF0000000L)) != 0) {
				hash ^= (x >> 24);
				hash &= ~x;
			}
		}
		int result = (hash & 0x7FFFFFFF) % number;
		return result;
	}

}
