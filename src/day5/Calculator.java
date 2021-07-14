package day5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1 = input.nextInt();
		System.out.println("Enter number2: ");
		int num2 = input.nextInt();

		int sum = num1 + num2;
		System.out.println("sum of " + num1 + " and " + num2 + " is= " + sum);
		int sub = num1 - num2;
		System.out.println("substraction of " + num1 + " and " + num2 + " is= " + sub);
		int mul = num1 * num2;
		System.out.println("multiplication of " + num1 + " and " + num2 + " is= " + mul);
		int div = num1 / num2;
		System.out.println("division of " + num1 + " and " + num2 + " is= " + div);
		int modulus = num1 % num2;
		System.out.println("modulus of " + num1 + " and " + num2 + " is= " + modulus);
		int average = (num1 + num2) / 2;
		System.out.println("average of " + num1 + " and " + num2 + " is= " + average);

	}

}
