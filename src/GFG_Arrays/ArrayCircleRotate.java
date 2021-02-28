package GFG_Arrays;

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


	private static void cirlerotation1(Integer[] test, int d) {

	
		
		
	}

}
