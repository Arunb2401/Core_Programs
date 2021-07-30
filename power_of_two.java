package corePrograms;

import java.util.Scanner;

public class power_of_two {

	public static void main(String[] args) {
		System.out.println("Enter the power of 2 : ");
		Scanner input = new Scanner(System.in);
		int num = 2;
		int power;
		power = input.nextInt();
		input.close();

		System.out.println(Math.pow(num, power)); // Power Method
	}

}
