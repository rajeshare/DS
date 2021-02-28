package GFG_Arrays_rotations;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayLeftRotation {

	public static void main(String[] args) {

		Integer[] test = { 1, 2, 3, 4, 5 ,6,7}; // O/p 4,5,1,2,3

		// rotation1(test, 3);

		rotation4(test, 2);

		System.out.println(Arrays.asList(test));
	}

	// TM O(MN) SP(1)
	public static void rotation1(Integer[] test, int n) {

		for (int i = 0; i < n; i++) {
			int tmp = test[0];
			for (int j = 0; j < test.length - 1; j++) {
				test[j] = test[j + 1];
			}
			test[test.length - 1] = tmp;
		}
	}

	// TC O(N) SP(D)
	public static void rotation2(Integer[] test, int n) {

		Integer[] temp = new Integer[n];

		int m = test.length;

		for (int i = 0; i < n; i++) {
			temp[i] = test[i];
		}

		for (int i = n, j = 0; j < m - n; i++, j++) {
			test[j] = test[i];
		}

		for (int i = m - n, j = 0; i < m; i++, j++) {
			test[i] = temp[j];
		}

		System.out.println(Arrays.asList(temp));
	}

	// Method 4 (The Reversal Algorithm) :

	// Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
	// A = [1, 2] and B = [3, 4, 5, 6, 7]
	//
	//
	// Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
	// Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
	// Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]

	
//	TC O(N)
	public static void rotation4(Integer[] test, Integer d) {
		int m=test.length;
		d=d-1;
		for (int i = 0, j = d; i < j; i++, j--) {
			swap(test, i, j);
		}
		for (int i = d+1, j = m-1 ; i < j; i++, j--) {
			swap(test, i, j);
		}
		
		for (int i = 0, j = m-1 ; i < j; i++, j--) {
			swap(test, i, j);
		}

	}

	private static void swap(Integer[] test, int i, int j) {
		int tmp=test[i];
		test[i] = test[j];
		test[j] = tmp;
	}

}
