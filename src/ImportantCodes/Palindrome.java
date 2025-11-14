package ImportantCodes;

import java.util.Scanner;

public class Palindrome {

	// Method to check if the given string is a Palindrome
	void checkPalindrome(String input) {
		String temp = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			temp = temp + ch;
			temp = temp.toLowerCase();
		}
		if (temp.equals(input.toLowerCase())) {
			System.out.println(input + " is a Palindrome.");
		} else {
			System.out.println(input + " is not a Palindrome.");
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		palindrome.checkPalindrome(str);
		sc.close();
	}
}
