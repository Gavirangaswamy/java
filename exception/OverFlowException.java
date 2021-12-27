package com.grs.exception;

public class OverFlowException {

	public OverFlowException() {
		this();
	}

}

class OverFlow extends OverFlowException {

	public OverFlow() {
		super();
		System.out.println("birds main property is flying");
	}

	public static void main(String[] args) {
		OverFlow overflow = new OverFlow();

	}

}
