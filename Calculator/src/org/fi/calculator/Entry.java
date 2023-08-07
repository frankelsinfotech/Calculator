package org.fi.calculator;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in))
		{
			System.out.println("Enter the first Number");
			int num1 = scanner.nextInt();
			System.out.println("Enter the second Number");
			int num2 = scanner.nextInt();
			
			Calculator objCalculator = new Calculator();
			
			int result = objCalculator.add(num1, num2);
			
			System.out.println("Result is " + result);
		}
	}

}
