package ImportantCodes;

import java.util.Scanner;

public class ReverseString {

	// Method to return a reversed String
	String getReverseString(String str) {
		String reversedStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + str.charAt(i);
		}
		return reversedStr;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		String str = sc.nextLine();
		System.out.println("Reversed String is : " + reverseString.getReverseString(str));
		sc.close();
	}
}
