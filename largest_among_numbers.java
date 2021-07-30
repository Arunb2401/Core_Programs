package corePrograms;

import java.util.Scanner;

public class largest_among_numbers {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int large;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Three Numbers : ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		scan.close();
		
		large = (int) ((num1 > num2) ? (num1 > num3) : (num1 - num3));
		System.out.println("print something : " +large);
		/*if (num1 > num2 && num1 > num3) {
			System.out.println("First number is largest :" + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Second number is largest :" + num2);
		} else {
			System.out.println("third number is largest :" + num3);
		}*/

	}
}
