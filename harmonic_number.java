package corePrograms;

import java.util.Scanner;

public class harmonic_number {

	public static void main(String[] args) {
		double i;
		double num;
		double sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to get harmonics value :");
		num = input.nextDouble();
		input.close();

		for (i = 1; i <= num; i++) {
			sum = sum + (1 / i);
		}
		System.out.println("Harmonic value = " + sum);
	}
}
