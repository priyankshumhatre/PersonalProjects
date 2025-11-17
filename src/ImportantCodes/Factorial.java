package ImportantCodes;

import java.util.Scanner;

public class Factorial {

	int getFactorial(int num) {
		int fact = 1;
		if (num == 0 || num == 1) {
			return fact;
		} else {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}

	int getFactorialMethodCalling(int num) {
		int fact = 1;
		if (num == 0 || num == 1) {
			return fact;
		} else {
			fact = num * getFactorialMethodCalling(num - 1);
			return fact;
		}
	}

	public static void main(String[] args) {
		Factorial fact = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " : " + fact.getFactorial(num));
		System.out.println("Factorial of " + num + " : " + fact.getFactorialMethodCalling(num));
		sc.close();
	}

}
