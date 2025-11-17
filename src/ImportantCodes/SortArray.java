package ImportantCodes;

import java.util.Arrays;

public class SortArray {

	void getSortedArray(int[] inputArray) {
		// {10,20,-30,0,40,2,100}
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length - 1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
				System.out.println((i + 1) + "th Pass : " + (j + 1) + " iteration " + Arrays.toString(inputArray));
			}
			System.out.println((i + 1) + "th Pass : " + Arrays.toString(inputArray));
		}
		System.out.println("Final Sorted Array : " + Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		SortArray sort = new SortArray();
		int[] inputArray = { 10, 8, 6, 4, 2, 0 };
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		sort.getSortedArray(inputArray);
	}
}
