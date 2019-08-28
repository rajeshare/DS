package Arrays;

import java.util.Arrays;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1 ,9 ,5 ,3 ,2 ,6, 7, 11};
		int count = 0;

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 != 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
