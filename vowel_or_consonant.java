package corePrograms;

import java.util.Scanner;

public class vowel_or_consonant {

	public static void main(String[] args) {
		char ch;
		Scanner alphabet = new Scanner(System.in);

		System.out.print("Enter an Alphabet : ");
		ch = alphabet.next().charAt(0);
		alphabet.close();

		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			System.out.print("This is a Vowel");
		} else {
			System.out.print("This is not a Vowel");
		}
	}

}
