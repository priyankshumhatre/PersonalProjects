package ImportantCodes;

import java.util.Scanner;

public class PrimeCount {

	// Method to check if a number is prime or not and return true if prime or false
	// if not prime
	boolean isPrime(int num) {
		boolean check = true;
		if (num <= 2) {
			check = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					check = false;
					break;
				}
			}
		}
		return check;
	}

	// Method to iterate over the range from start to end and return the count of
	// prime numbers in that range
	int getPrimeCount(int start, int end) {
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (this.isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		PrimeCount prime = new PrimeCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number in range : ");
		int start = sc.nextInt();
		System.out.println("Enter the ending number in range : ");
		int end = sc.nextInt();
		int primeCount = prime.getPrimeCount(start, end);
		System.out.println("Count of prime numbers in range " + start + " to " + end + " is : " + primeCount);
		sc.close();
	}
}
