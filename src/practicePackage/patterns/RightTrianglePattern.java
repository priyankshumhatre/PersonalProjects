// User needs to print the following pattern
/*

*
**
***
****
*****
******

*/
package practicePackage.patterns;

public class RightTrianglePattern {

	void getRightTrianglePattern(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
