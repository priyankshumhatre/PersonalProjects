package practicePackage;

public class BasicMathCalculation {

	int a = 10;
	int b = 3;

	void addition() {
		int ans = a + b;
		System.out.println("Addition is : " + ans);
	}
	void subtraction() {
		int ans = a - b;
		System.out.println("Subtraction is : " + ans);
	}
	void division() {
		int ans = a / b;
		System.out.println("Division is : " + ans);
	}
	void multiplication() {
		int ans = a * b;
		System.out.println("Multiplication is : " + ans);
	}
	void modulus() {
		int ans = a % b;
		System.out.println("Remainder is : " + ans);
	}

	public static void main(String[] args) {
		BasicMathCalculation cal = new BasicMathCalculation();
		cal.addition();
		cal.subtraction();
		cal.division();
		cal.multiplication();
		cal.modulus();
	}

}
