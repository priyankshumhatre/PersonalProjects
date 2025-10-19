package practicePackage;

public class Combination {

	// Method to find nCr value
	// nCr = n!/(r!*(n-r)!)
	int nCr(int n, int r) {
		int numerator = 1;
		int denominator1 = 1;
		int denominator2 = 1;
		for (int i = n; i > 1; i--) {
			numerator = numerator * i;
		}
		for (int j = r; j > 1; j--) {
			denominator1 = denominator1 * j;
		}
		for (int k = n - r; k > 1; k--) {
			denominator2 = denominator2 * k;
		}
		return numerator / (denominator1 * denominator2);
	}
	// Optimized method to find nCr value
	int nCrOpti(int n, int r) {
		int result = 1;
		for (int i = 0; i < r; i++) {
			result = result * (n - i);
			result = result / (i + 1);
		}
		return result;
	}
	
	// Using the Factorial method defined in Factorial class
	int nCrFactorialMethod(int n, int r) {
		int result = 1;
		Factorial fact = new Factorial();
		result = fact.factorial(n)/(fact.factorial(r)*fact.factorial(n-r));
		return result;
	}

	public static void main(String[] args) {
		Combination comb = new Combination();
		System.out.println("Using Non-optimized method : " + comb.nCr(7, 2));
		System.out.println("Using Optimized method : " + comb.nCrOpti(7, 2));
		System.out.println("Using User-Defined Facotorial method : " + comb.nCrOpti(7, 2));
	}
}
