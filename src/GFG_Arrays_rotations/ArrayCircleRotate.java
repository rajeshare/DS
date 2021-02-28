package GFG_Arrays_rotations;

import java.util.Arrays;

public class ArrayCircleRotate {

	public static void main(String[] args) {

		Integer[] test = { 1, 2, 3, 4, 5 ,6,7}; // d 2 O/p  6 7 1 2 3 4 5

				cirlerotation1(test, 2);

		System.out.println(Arrays.asList(test));
	}
	
	
	// Reverse A, we get ArB = [ 1, 2, 3, 4, 5 ,7,6]
	// Reverse B, we get ArBr = [5,4,3,2,1, 7,6]
	// Reverse all, we get (ArBr)r = [6,7,1,2,3,4,5]


	public static void cirlerotation1(Integer[] test, int d) {

		int m=test.length-1;
		 d=m-d;
		for (int i = d+1, j = m; i < j; i++, j--) {
			swap(test, i, j);
		}
		for (int i = 0, j = d ; i < j; i++, j--) {
			swap(test, i, j);
		}
		
		for (int i = 0, j = m ; i < j; i++, j--) {
			swap(test, i, j);
		}

		
	}
	
//	TC O(N)
	public static void rotation4(Integer[] test, Integer d) {}

	private static void swap(Integer[] test, int i, int j) {
		int tmp=test[i];
		test[i] = test[j];
		test[j] = tmp;
	}


}
