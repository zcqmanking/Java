/**
 * 
 */
package org.archive.crawler.frontier;

import org.archive.crawler.datamodel.CandidateURI;
import org.archive.crawler.framework.CrawlController;

/**
 * ��дQueueAssignmentPolicy��<br>
 * �������ҪĿ�������ͬһHostʱ�������ٶȹ��������������<br>
 * 
 * Ĭ������queue-assignment-policy��ʹ�õ�HostnameQueueAssignmentPolicy��
 * �Ὣͬһhost�µ�����url������һ���߳��У����Ե�ֻ����һ��վ��ʱ���ٶȻ������
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
