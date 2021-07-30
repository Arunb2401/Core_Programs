package corePrograms;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
	
	int Number = 0;
	
	{
		Scanner input_number = new Scanner(System.in);

		System.out.println("Please Enter any number to Find Factors: ");
		Number = input_number.nextInt();
		input_number.close();
		for (int i = 1; i <= Number; i++) {
			if (Number%i == 0) {
				System.out.format(" %d  ", i);
			}
		}
	}
}
}