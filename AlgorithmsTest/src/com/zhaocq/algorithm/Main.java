package com.zhaocq.algorithm;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,23,5,2,7,3,22,43,12};
		
		Algorithms algorithms = new Algorithms();
		//ð������
		algorithms.burbleSort(a);
		//ѡ������
		algorithms.chooseSort(a);
		//��������
		algorithms.insertSort(a);
		//��������
		algorithms.quickSort(a);
	}

}
