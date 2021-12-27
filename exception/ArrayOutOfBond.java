package com.grs.exception;

public class ArrayOutOfBond {
	
	public static void main(String[] args) {
		
		int[] num = { 1, 2, 3, 4, 5, 8, 6, 5, 8, 4, };
		
		for (int index = 0; index <= num.length; index++) {

			System.out.print(num[index]+"  ");
		}
	}

}
