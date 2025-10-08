package practicePackage;

public class PrintEven {
	
	void even(int start,int end) {
		for(int count=start;count<=end;count++) {
			if(count%2==0) {
				System.out.println(count);		
			}
		}
	}
	
	public static void main(String[] args) {
		PrintEven printEven = new PrintEven();
		printEven.even(1,10);
	}
}
