package ImportantCodes;

import java.util.Scanner;

public class PrimeNumber {

	// Method to check if the entered number is prime or not
	void isPrime(int num) {
		boolean check = true;
		if (num <= 2) {
			check = false;
			System.out.println(num + " is not prime.");
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					check = false;
					System.out.println(num + " is not prime.");
					break;
				}
			}
		}
		if (check == true) {
			System.out.println(num + " is prime.");
		}
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime : ");
		int num = sc.nextInt();
		prime.isPrime(num);
		sc.close();
	}
}
