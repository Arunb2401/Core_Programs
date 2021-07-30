package corePrograms;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		int yr;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the year to check it's Leap year or Not : ");
		yr = scan.nextInt();
		scan.close();

		if ((yr % 4 == 0) && (yr % 100 != 0)) {
			System.out.print("This is a Leap Year");
		} else if ((yr % 100 == 0) && (yr % 400 == 0)) {
			System.out.print("This is a Leap Year");
		} else if (yr % 400 == 0) {
			System.out.print("This is a Leap Year");
		} else {
			System.out.print("This is not a Leap Year");
		}
	}
}
