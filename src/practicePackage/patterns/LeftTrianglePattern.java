package practicePackage.patterns;

/*
 
     *
    **
   ***
  ****
 *****

 */

public class LeftTrianglePattern {

	void getLeftTrianglePattern(int row) {
		for (int i = 1; i <= row; i++) {
			// Loop to print spaces
			for (int j = i; j < row; j++) {
				System.out.print("  ");
			}
			// Loop to print * character
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			// Jump to next line
			System.out.println();
		}
	}
}
