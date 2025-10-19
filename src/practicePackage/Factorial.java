package practicePackage;

public class Factorial {
	int fact = 1;
	int factorial(int num) {
		for(int i=1;i<=num;i++) {
			if(num==0) {
				fact=1;
				return fact;
			}else {
				fact = fact*i;
			}
		}return fact;
	}
	
	int selfFactorial(int num) {
		if(num==0) {
			return 1;
		}return num*selfFactorial(num-1);
	}
	
	public static void main(String[] args) {
		Factorial fact = new Factorial();
		int num = 5;
		System.out.println("Factorial of "+num+" is "+ fact.factorial(num));
		System.out.println("Factorial of "+num+" by calling the method again is "+ fact.selfFactorial(num));
	}
}
