//--{ Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class exercise_2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int num1, num2, sum;

		System.out.print("Inserisci il primo numero: ");
		num1 = input.nextInt();
		System.out.print("Inserisci il secondo numero: ");
		num2 = input.nextInt();

		sum = num1 + num2;
		System.out.printf("The sum of number 1 and number 2 is: %d\n", sum);
	}}
