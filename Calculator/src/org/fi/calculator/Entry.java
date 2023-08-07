package org.fi.calculator;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in))
		{
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			
			int result = num1 + num2;
			
			System.out.println("Result is " + result);
		}
	}

}
