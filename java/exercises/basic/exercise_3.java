//--{ Write a Java program to divide two numbers and print on the screen.

import java.util.Scanner;

public class template {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		float division;

		System.out.print("Insert first number: ");
		num1 =input.nextInt();
		System.out.print("Insert second number: ");
		num2 =input.nextInt();

		division = (float)num1 /num2;
		System.out.printf("The division of the first and second number is: %.2f\n", division);
	}}
