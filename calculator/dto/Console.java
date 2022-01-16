package com.grs.calculator.dto;

import java.util.Scanner;

public class Console {

	public static void calculate() {
		FunctionsImp fuction = new FunctionsImp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are sure you want procced (YES/NO)");
		String option = scanner.next().toUpperCase();
		switch (option) {
		case "YES":
			System.out.println("Options:" + "\n Press 1 for Addition" + "\n Press 2 for Subtraction"
					+ "\n Press 3 for Multiplication" + "\n Press 4 for Division");
			while (true) {
				int function = scanner.nextInt();
				switch (function) {
				case 1:
					System.out.println("Your Selected function : Addition");
					System.out.println(fuction.add());
					break;
				case 2:
					System.out.println("Your Selected function : Subtraction");
					System.out.println(fuction.sub());
					break;
				case 3:
					System.out.println("Your Selected function : Multiplication");
					System.out.println(fuction.multiplication());
					break;
				case 4:
					System.out.println("Your Selected function is: Division");
					System.out.println(fuction.divide());
					break;
				}
				if (function > 0 && function <= 4)
					break;
				System.out.println("Invalid Option : Please Enter Valid Option");
			}
			break;
		case "NO":
			System.out.println("Thank for your response");
			break;
		default:
			System.out.println("Invalid Option : Please Enter Valid Option");
		}
	}
}
