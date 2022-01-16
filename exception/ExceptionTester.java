package com.grs.exception;

import com.grs.exception.block.ExceptionEx;

public class ExceptionTester {

	public static void main(String[] args) {
		int number = ExceptionEx.number;
		
		System.out.println(number);
		
		ExceptionEx ex = new ExceptionEx();
	}

}
