package ImportantCodes;

import java.util.Scanner;

public class RemoveWhiteSpace {

	// Method to replace space and blanks using replace and trim
	void removeSpaceUsingReplace(String input) {
		String output = "";
		output = input.replace(" ", "");
		output = output.trim();
		System.out.println(output);
	}

	// Method to replace space and blanks using loop
	void removeSpaceUsingLoop(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch != ' ') {
				output = output + ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		RemoveWhiteSpace obj = new RemoveWhiteSpace();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String input = sc.nextLine();
		obj.removeSpaceUsingReplace(input);
		obj.removeSpaceUsingLoop(input);
		sc.close();
	}
}
