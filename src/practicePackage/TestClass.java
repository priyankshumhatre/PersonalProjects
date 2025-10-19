package practicePackage;

public class TestClass {
	
	void changeData() {
		String str = "H1e2ll3o";
		String output = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch)) {
				output = output+ch;
			}
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.changeData();
	}
}
