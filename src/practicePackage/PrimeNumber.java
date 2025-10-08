package practicePackage;

public class PrimeNumber {
	int primeCount=0;
	int primeSum=0;
	
	void primeCheck(int num) {
		int count=0;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				//System.out.println(num+ " not prime.");
				count += 1;
				break;
			}
		}
		if(count==0) {
			System.out.println(num+ " is prime.");
			primeCount +=1;
			primeSum = primeSum+num;
		}
	}
	
	void rangeCheck(int start, int end) {
		for(int num=start;num<=end;num++) {
			primeCheck(num);		
		}
		
		System.out.println("Number of prime numbers in the range is : "+primeCount);
		System.out.println("Sum of prime numbers in the range is : "+primeSum);
	}
	
	void avgPrime(int start, int end) {
		double avgPrime=primeSum/primeCount;
		System.out.println("Average of prime numbers in the range is : "+avgPrime);	
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNum = new PrimeNumber();
		primeNum.primeCheck(17);
		primeNum.rangeCheck(1,15);
		//primeNum.avgPrime(1,15);
	}
}
