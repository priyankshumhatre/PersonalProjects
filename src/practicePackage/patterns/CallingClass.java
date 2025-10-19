package practicePackage.patterns;

import java.util.Scanner;

public class CallingClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows in pattern : ");
		int row = sc.nextInt();
//		RightTrianglePattern rightTrianglePattern = new RightTrianglePattern();
//		rightTrianglePattern.getRightTrianglePattern(row);
//		System.out.println("");
//		RightTrianglePatternWithSpace rightTriangleWithSpace = new RightTrianglePatternWithSpace();
//		rightTriangleWithSpace.rightTrianglePatternWithSpace(row);
		System.out.println("");
		LeftTrianglePattern leftTriangleWithSpace = new LeftTrianglePattern();
		leftTriangleWithSpace.getLeftTrianglePattern(row);
	}
}
