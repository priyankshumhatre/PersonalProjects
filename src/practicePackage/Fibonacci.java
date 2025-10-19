package practicePackage;

public class Fibonacci {
	int fibo = 0;
	// Method to print numbers in a Fibonacci Series up to given range and with given first and second number
	void fibonacciSeries(int fNum,int sNum,int range) {
		System.out.println(fNum);
		System.out.println(sNum);
		for(int i=fNum;i<range-2;i++) {
			fibo = fNum+sNum;
			System.out.println(fibo);
			fNum=sNum;
			sNum=fibo;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fiboSeries = new Fibonacci();
		fiboSeries.fibonacciSeries(0, 1, 10);
	}
}
