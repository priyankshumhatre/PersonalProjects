package ImportantCodes;

import java.util.Scanner;

public class SwapNumbers {

	// Method to Swap two integers using a third temporary variable
	private void swapWithTemp(int a, int b) {
		// a = 1 and b = 2
		int temp = a; 	// temp = a = 1
		a = b; 			// a = b = 2
		b = temp; 		// b = temp = 1
		System.out.println("Swapping using Temperory variable : a = " + a + " : b = " + b);
	}
	
	// Method to Swap two integers without a third temporary variable
	private void swapWithoutTemp(int a, int b) {
		// a = 1 and b = 2
		a = a + b; // a = a + b = 1 + 2 = 3
		b = a - b; // b = a - b = 3 - 2 = 1
		a = a - b; // a = a - b = 3 - 1 = 2
		System.out.println("Swapping without Temperory variable : a = " + a + " : b = " + b);
	}

	public static void main(String[] args) {
		SwapNumbers swap = new SwapNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number a : ");
		int a = sc.nextInt();
		System.out.println("Enter second number b : ");
		int b = sc.nextInt();
		swap.swapWithTemp(a, b);
		swap.swapWithoutTemp(a, b);
		sc.close();
	}
}
