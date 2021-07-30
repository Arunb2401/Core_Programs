package corePrograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int Number;
		Scanner numb = new Scanner(System.in);
		System.out.println("\n Please Enter any number : ");
		Number = numb.nextInt();
		numb.close();

		if (Number % 2 == 0) {
			System.out.println("\n Entered number is Even");
		} else {
			System.out.println("Entered number is Odd ");
		}

	}
}
