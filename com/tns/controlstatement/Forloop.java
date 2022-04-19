package com.bpal.controlstatement;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 0, 1, 2, 3 };
		for (int i : a) {
			System.out.println(i);
		}

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 5; j++) {
				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}

	}

}
