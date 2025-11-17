package practicePackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	
	void m1() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number of input : ");
			int len = sc.nextInt();
			int[] numArr = new int[len];
			for(int i = 0; i<numArr.length;i++) {
				numArr[i] = sc.nextInt();
			}
			sc.close();
		}catch(InputMismatchException io) {
			io.getStackTrace();
		}catch(ArithmeticException ae) {
			ae.getStackTrace();
		}catch(NumberFormatException nfe) {
			nfe.getStackTrace();
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.getStackTrace();
		}catch(NullPointerException npe) {
			npe.getStackTrace();
		}finally {
			System.out.println("In Finally block!");
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
