package ImportantCodes;

import java.util.Scanner;

public class FibonacciSeries {

	// Method to print the fibonacci series for <range> numbers starting from <a> and <b>
	private void fibonacci(int a, int b, int range) {
		System.out.print(a + " " + b);
		for (int i = 0; i < range - 2; i++) {
			int temp = a + b;
			System.out.print(" " + temp);
			a = b;
			b = temp;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibo = new FibonacciSeries();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number of series : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number of series : ");
		int b = sc.nextInt();
		System.out.println("Enter the range of series : ");
		int range = sc.nextInt();
		fibo.fibonacci(a, b, range);
		sc.close();
	}
}