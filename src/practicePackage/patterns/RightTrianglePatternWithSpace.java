package practicePackage.patterns;

public class RightTrianglePatternWithSpace {
	
	 void rightTrianglePatternWithSpace(int row) {
		 for(int i=1;i<=row;i++) {
			 System.out.println("");
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
				 System.out.print(" ");
			 }
		 }
	 }

}
