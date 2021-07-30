package corePrograms;

import java.util.Scanner;

public class swap_numbers {

	public static void main(String[] args) {
		int Number1, Number2;
		int swap;
		Scanner input_num = new Scanner(System.in);

		System.out.print("Enter any Two Numbers for swapping ---------> ");

		System.out.print("\nFirst Number : ");
		Number1 = input_num.nextInt();
		System.out.print("Second Number : ");
		Number2 = input_num.nextInt();
		input_num.close();

		swap = Number1;
		Number1 = Number2;
		Number2 = swap;

		System.out.print("The Value of the First and Second Number after Swapping is \n");

		System.out.print("First Number = " + Number1);
		System.out.print("\nSecond Number = " + Number2);
	}
}