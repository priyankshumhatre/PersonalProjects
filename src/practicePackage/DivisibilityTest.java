package practicePackage;

public class DivisibilityTest {
	
	//Method to check if a number received from the argument is divisible by 3 and 5.
	void divisibleCheck(int start, int end) {
		int counter=0;
		for(int num=start;num<=end;num++) {
			if (num%3==0 && num%5==0) {
				if(counter==0) {
					System.out.println("Numbers divisible by 3 and 5 are : ");
				}
				System.out.println(num);
				counter += 1;
			}
		}
		if(counter == 0) {
			System.out.println("No number between "+start+" and "+end+ " that is divisible by 3 and 5");
		}else if(counter==1) {
			System.out.println("Total divisible number in range is : "+counter);
		}else {
		System.out.println("Total divisible numbers in range are : "+counter);
		}
	}
	
	public static void main(String[] args) {
		DivisibilityTest dTest=new DivisibilityTest();
		dTest.divisibleCheck(1, 20);
	}
}
