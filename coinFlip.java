package corePrograms;

import java.util.Scanner;

public class coinFlip {

	public static void main(String[] args) {
		Scanner toss = new Scanner(System.in);
		System.out.println("\n Please enter no. of time coin should be flipped : ");
		toss.close();
		if (Math.random() < 0.5) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}
}