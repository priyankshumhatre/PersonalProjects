package practicePackage;

public class Test1 {
	int temp=0;
	//Print the first 3 prime number in given range
	//Print the last prime number in given range
	
	void primeCheck(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				//System.out.println(num+ " is not prime.");
				count += 1;
				break;
			}
		}
		if(count==0) {
			System.out.println(num+" is prime.");
		}
	}
	
	void rangePrime(int start,int end) {
		for(int i=start;i<=end;i++) {
			primeCheck(i);
		}
	}
	
	public static void main(String[] args) {
		Test1 test=new Test1();
		//test.divisibility(14);
		//test.primeCheck(7);
		test.rangePrime(1, 20);
	}
}
