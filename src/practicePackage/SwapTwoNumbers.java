package practicePackage;

public class SwapTwoNumbers {

	int a = 10;
	int b = 5;

	// Method to swap two numbers using a temporary variable
	void usingTemp() {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("-----After Swap----\na = " + a + "\nb = " + b);
	}

	// Method to swap two numbers without using a temporary variable
	void noTemp() {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("-----After Swap----\na = " + a + "\nb = " + b);
	}

	public static void main(String[] args) {
		SwapTwoNumbers swapTemp = new SwapTwoNumbers();
		System.out.println("----Before Swap----\na = " + swapTemp.a + "\nb = " + swapTemp.b);
		swapTemp.usingTemp();
		SwapTwoNumbers swapNoTemp = new SwapTwoNumbers();
		swapNoTemp.noTemp();
	}
}
