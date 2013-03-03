package com.zhaocq.algorithm;

public class Algorithms {

	/**
	 * ð������
	 * 
	 * @param a
	 *            ����������
	 */
	public void burbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				// ����С�ķ�����ǰ��
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// ��ӡ���
		print(a);
	}

	/**
	 * ��ӡ����Ԫ�أ���ÿ��Ԫ��˳���ӡ������Ԫ��֮���ÿո������
	 * 
	 * @param a
	 *            ����ӡ����
	 */
	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	/**
	 * ѡ������ <br />
	 * ԭ�����������飬�ѵ�ǰԪ����Ϊ��СԪ�أ��Ѹ�Ԫ��������Ԫ�����Ƚϣ����и�С�ģ��ͽ���Ԫ�ء�
	 * 
	 * @param a
	 *            ����������
	 */
	public void chooseSort(int[] a) {

		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		// ��ӡ���
		print(a);
	}

	/**
	 * ��������<br />
	 * ԭ����ǰ�벿��������������飬������벿�֣���ÿһ��Ԫ��֮ͬǰ��ÿһ��Ԫ�رȽϣ����ǰ��Ĵ󣬾ͽ���ֵ��
	 * 
	 * @param a
	 *            ����������
	 */
	public void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int j;
			int t = a[i]; // �ݴ�������Ԫ��
			for (j = i; j > 0 && a[j - 1] > t; j--) {
				a[j] = a[j - 1];
			}
			a[j] = t; // ���������һ��j--���������д˴�Ӧ����a[j]��������a[j-1]
		}
		print(a);
	}

	/**
	 * ��������<br />
	 * ԭ����<br />
	 * 1.�ȴ�������ȡ��һ������Ϊ��׼����<br />
	 * 2.�������̣���������������ȫ�ŵ������ұߣ�С�ڻ����������ȫ�ŵ�������ߡ�<br />
	 * 3.�ٶ����������ظ��ڶ�����ֱ��������ֻ��һ������
	 * 
	 * @param a
	 *            ����������
	 */
	public void quickSort(int[] a) {
		int start = 0, end = a.length - 1;
		quickSort1(a, start, end);
	}

	/**
	 * ���ν������򡣵ݹ���ã�������һ��Ϊ������������
	 * 
	 * @param a
	 *            ����������
	 * @param start
	 *            ��ʼλ��
	 * @param end
	 *            ����λ��
	 */
	private void quickSort1(int[] a, int start, int end) {
		if (start < end) {
			// �Ƚ������򣬰Ѵ���keyֵ��Ԫ�طŵ��ұߣ�С��keyֵ��Ԫ�طŵ���ߣ���������key���ڵ�λ��
			int keyPos = adjustArray(a, start, end);
			// ������һ��Ϊ�����ֱ�ݹ�����
			quickSort1(a, start, keyPos - 1);
			// ����������Ϊ���������ô��ݣ����Դ˴��ٴ���Ϊ��������������ִ����Ϻ�����顣
			quickSort1(a, keyPos + 1, end);
		}
		// ��ӡ���
		print(a);
	}

	/**
	 * �Ѵ���keyֵ��Ԫ�طŵ��ұߣ�С��keyֵ��Ԫ�طŵ���ߣ���������key���ڵ�λ�á�
	 * 
	 * @param a
	 *            ����������
	 * @param start
	 *            ��ʼλ��
	 * @param end
	 *            ����λ��
	 * @return key����λ��
	 */
	private int adjustArray(int[] a, int start, int end) {
		int i = start, j = end;
		int key = a[i]; // ȡ��һ��Ԫ��Ϊ�ؼ�keyֵ��
		while (i < j) {
			// ���ұ�ȡ��һ��С��keyֵ��Ԫ�أ���䵽���
			while (i < j && a[j] >= key) {
				j--;
			}
			if (i < j) { // ���һ���жϣ���ֹ����
				a[i] = a[j];
				i++; // ���󣬰�iָ�����Ԫ��
			}
			// ������ҵ�һ������keyֵ��Ԫ�أ���䵽�ұ�
			while (i < j && a[i] < key) {
				i++;
			}
			if (i < j) { // ���һ���жϣ���ֹ����
				a[j] = a[i];
				j--; // ���󣬰�jָ�����Ԫ��
			}
		}
		// ���ѿճ�����λ������keyֵ
		a[i] = key;

		return i;
	}
	
	/**
	 * ������
	 * @param a ����������
	 */
	public void heapSort(int[] a){
		
	}
}