package com.grs.exception.block;


import java.io.FileNotFoundException;
import java.io.FileReader;


public class ExceptionEx {

	public static String name;
	public static int number; 
	
	static {
		System.out.println("👉NumberFormatException👈");
		name = "GRS";
		try {
		number = Integer.parseInt(name);	
		}catch(NumberFormatException e){
			System.err.println(e.getMessage());
		}
		{
			System.out.println();
			System.out.println("👉ArrayOutOfBoundsException👈");
			int[] num = {1,2,3,6,5};
			try {
				System.out.println(num[5]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	
	
	{
		System.out.println();
		System.out.println("👉NullPointerException👈");
		String[] names = {"Subhash","Azad",null,"Gavi"};
		for (int i = 0; i < names.length; i++) {
			String string = names[i];
			try {
			System.out.println(string.toUpperCase());
			}catch (NullPointerException e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public static int sum() {
			return sum();
	}
	
	public ExceptionEx() {
		System.out.println();
		System.out.println("Class Constructor");
		System.out.println("👉StackOverflowError👈");
		{
			try {
			ExceptionEx.sum();
			}catch(StackOverflowError e) {
				System.err.println(e);
			}
		
		}
	}
	
	
	{
		System.out.println();
		System.out.println("👉FileNotFoundException👈");
		try {
			FileReader fileReader = new FileReader("E:\\Test");
			
		} catch (FileNotFoundException e) {
			
			System.err.println(e.getMessage());
		}      
	}
	
	{
		System.out.println();
		System.out.println("👉ClassCastException👈");
		
		Object name1 = new String();
		try {
		Integer num = (Integer) name1;
		}catch (ClassCastException e) {
			System.err.println(e.getMessage());
		}
				
	}
	
}
