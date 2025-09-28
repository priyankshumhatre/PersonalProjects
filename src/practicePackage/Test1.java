package practicePackage;

public class Test1 {
	
	int num1=5;
	static int num2=10;
	
	void m1() {
		int sum=num1+Test1.num2;
		System.out.println(sum);
	}
	void display() {
		System.out.print("Test program.");
	}
	
	public static void main(String[] args) {
		Test1 test=new Test1();
		test.m1();
		test.display();
	}
}
