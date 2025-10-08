package practicePackage;

public class ReturnType {
	int primeCount=0;
	
	boolean isNumPrime(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count+=1;
				break;
			}
		}
		if(count==0) {
			return true;
		}else {
			return false;
		}
	}
	
	void getPrime(int num) {
		if(isNumPrime(num)==true) {
			System.out.println(num+" is prime.");
		}
		else {
			System.out.println(num+" is not prime.");
		}
	}
	
	void getPrimeInRange(int startR,int endR) {
		for(int num=startR;num<=endR;num++) {
			if(num==1) {
				continue;
			}else if(isNumPrime(num)==true) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		ReturnType r=new ReturnType();
		//r.getPrime(17);
		r.getPrimeInRange(1, 10);
	}
}
