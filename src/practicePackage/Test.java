package practicePackage;

public class Test {
	
	Test(String str){
		System.out.println(str);
	}
	
	void display() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Test t = new Test("Hii");
		t.display();
	}

}
