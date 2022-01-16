package com.grs.calculator.dto;

import java.util.Scanner;

public class FunctionsImp extends Functions {

	public String divide() {
		String result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Options:" + "\n Press 1 for Addition of Double Values" + "\n Press 2 for Addition of Float Values"
						+ "\n Press 3 for Addition of Integer Values" + "\n Press 4 for Addition of Long Values"
						+ "\n Press 5 for Addition of Byte Values" + "\n Press 6 for Addition of Short Values");
		while (true) {
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				double value1;
				double value2;
				while (true) {
					System.out.println("Enter values");
					value1 = scanner.nextDouble();
					value2 = scanner.nextDouble();
					if (value1 % 1 != 0 && value2 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value1 / value2);
				break;
			case 2:
				float value3;
				float value4;
				while (true) {
					System.out.println("Enter values");
					value3 = scanner.nextFloat();
					value4 = scanner.nextFloat();
					if (value3 % 1 != 0 && value4 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value3 / value4);
				break;
			case 3:
				int value5;
				int value6;
				while (true) {
					System.out.println("Enter values");
					value5 = scanner.nextInt();
					value6 = scanner.nextInt();
					if (value6 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value5 / value6);
				break;
			case 4:
				long value7;
				long value8;
				while (true) {
					System.out.println("Enter values");
					value7 = scanner.nextLong();
					value8 = scanner.nextLong();
					if (value8 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value7 / value8);
				break;
			case 5:
				byte value9;
				byte value10;
				while (true) {
					System.out.println("Enter values");
					value9 = scanner.nextByte();
					value10 = scanner.nextByte();
					if (value10 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value9 / value10);
				break;
			case 6:
				Short value11;
				Short value12;
				while (true) {
					System.out.println("Enter values");
					value11 = scanner.nextShort();
					value12 = scanner.nextShort();
					if (value12 != 0.0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value11 / value12);
				break;
			}
			if (option > 0 && option <= 6)
				break;
			System.out.println("Invalid Option : Please Enter Valid Option");
		}

		return result;
	}

	public String add() {
		String result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Options:" + "\n Press 1 for Addition of Double Values" + "\n Press 2 for Addition of Float Values"
						+ "\n Press 3 for Addition of Integer Values" + "\n Press 4 for Addition of Long Values"
						+ "\n Press 5 for Addition of Byte Values" + "\n Press 6 for Addition of Short Values");
		while (true) {
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				double value1;
				double value2;
				while (true) {
					System.out.println("Enter values");
					value1 = scanner.nextDouble();
					value2 = scanner.nextDouble();
					if (value1 % 1 != 0 && value2 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value1 + value2);
				break;
			case 2:
				float value3;
				float value4;
				while (true) {
					System.out.println("Enter values");
					value3 = scanner.nextFloat();
					value4 = scanner.nextFloat();
					if (value3 % 1 != 0 && value4 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value3 + value4);
				break;
			case 3:
				int value5;
				int value6;
				while (true) {
					System.out.println("Enter values");
					value5 = scanner.nextInt();
					value6 = scanner.nextInt();
					if (value5 <= Integer.MAX_VALUE && value6 <= Integer.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value5 + value6);
				break;
			case 4:
				long value7;
				long value8;
				while (true) {
					System.out.println("Enter values");
					value7 = scanner.nextLong();
					value8 = scanner.nextLong();
					if (value8 <= Long.MAX_VALUE && value7 <= Long.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value7 + value8);
				break;
			case 5:
				byte value9;
				byte value10;
				while (true) {
					System.out.println("Enter values");
					value9 = scanner.nextByte();
					value10 = scanner.nextByte();
					if (value9 <= Byte.MAX_VALUE && value10 <= Byte.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value9 + value10);
				break;
			case 6:
				Short value11;
				Short value12;
				while (true) {
					System.out.println("Enter values");
					value11 = scanner.nextShort();
					value12 = scanner.nextShort();
					if (value11 <= Short.MAX_VALUE && value12 <= Short.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value11 + value12);
				break;
			}
			if (option > 0 && option <= 6)
				break;
			System.out.println("Invalid Option : Please Enter Valid Option");
		}
		return result;
	}

	public String sub() {
		String result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Options:" + "\n Press 1 for Addition of Double Values" + "\n Press 2 for Addition of Float Values"
						+ "\n Press 3 for Addition of Integer Values" + "\n Press 4 for Addition of Long Values"
						+ "\n Press 5 for Addition of Byte Values" + "\n Press 6 for Addition of Short Values");
		while (true) {
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				double value1;
				double value2;
				while (true) {
					System.out.println("Enter values");
					value1 = scanner.nextDouble();
					value2 = scanner.nextDouble();
					if (value1 % 1 != 0 && value2 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value1 - value2);
				break;
			case 2:
				float value3;
				float value4;
				while (true) {
					System.out.println("Enter values");
					value3 = scanner.nextFloat();
					value4 = scanner.nextFloat();
					if (value3 % 1 != 0 && value4 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value3 - value4);
				break;
			case 3:
				int value5;
				int value6;
				while (true) {
					System.out.println("Enter values");
					value5 = scanner.nextInt();
					value6 = scanner.nextInt();
					if (value5 <= Integer.MAX_VALUE && value6 <= Integer.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value5 - value6);
				break;
			case 4:
				long value7;
				long value8;
				while (true) {
					System.out.println("Enter values");
					value7 = scanner.nextLong();
					value8 = scanner.nextLong();
					if (value8 <= Long.MAX_VALUE && value7 <= Long.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value7 - value8);
				break;
			case 5:
				byte value9;
				byte value10;
				while (true) {
					System.out.println("Enter values");
					value9 = scanner.nextByte();
					value10 = scanner.nextByte();
					if (value9 <= Byte.MAX_VALUE && value10 <= Byte.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value9 - value10);
				break;
			case 6:
				Short value11;
				Short value12;
				while (true) {
					System.out.println("Enter values");
					value11 = scanner.nextShort();
					value12 = scanner.nextShort();
					if (value11 <= Short.MAX_VALUE && value12 <= Short.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value11 - value12);
				break;
			}
			if (option > 0 && option <= 6)
				break;
			System.out.println("Invalid Option : Please Enter Valid Option");
		}
		return result;
	}

	public String multiplication() {
		String result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Options:" + "\n Press 1 for Addition of Double Values" + "\n Press 2 for Addition of Float Values"
						+ "\n Press 3 for Addition of Integer Values" + "\n Press 4 for Addition of Long Values"
						+ "\n Press 5 for Addition of Byte Values" + "\n Press 6 for Addition of Short Values");
		while (true) {
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				double value1;
				double value2;
				while (true) {
					System.out.println("Enter values");
					value1 = scanner.nextDouble();
					value2 = scanner.nextDouble();
					if (value1 % 1 != 0 && value2 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value1 * value2);
				break;
			case 2:
				float value3;
				float value4;
				while (true) {
					System.out.println("Enter values");
					value3 = scanner.nextFloat();
					value4 = scanner.nextFloat();
					if (value3 % 1 != 0 && value4 % 1 != 0)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value3 * value4);
				break;
			case 3:
				int value5;
				int value6;
				while (true) {
					System.out.println("Enter values");
					value5 = scanner.nextInt();
					value6 = scanner.nextInt();
					if (value5 <= Integer.MAX_VALUE && value6 <= Integer.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value5 * value6);
				break;
			case 4:
				long value7;
				long value8;
				while (true) {
					System.out.println("Enter values");
					value7 = scanner.nextLong();
					value8 = scanner.nextLong();
					if (value8 <= Long.MAX_VALUE && value7 <= Long.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value7 * value8);
				break;
			case 5:
				byte value9;
				byte value10;
				while (true) {
					System.out.println("Enter values");
					value9 = scanner.nextByte();
					value10 = scanner.nextByte();
					if (value9 <= Byte.MAX_VALUE && value10 <= Byte.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value9 * value10);
				break;
			case 6:
				Short value11;
				Short value12;
				while (true) {
					System.out.println("Enter values");
					value11 = scanner.nextShort();
					value12 = scanner.nextShort();
					if (value11 <= Short.MAX_VALUE && value12 <= Short.MAX_VALUE)
						break;
					System.out.println("please enter a valid values");
				}
				result = String.valueOf(value11 * value12);
				break;
			}
			if (option > 0 && option <= 6)
				break;
			System.out.println("Invalid Option : Please Enter Valid Option");
		}
		return result;
	}

}
