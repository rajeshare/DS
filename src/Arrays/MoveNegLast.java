package Arrays;

import java.util.Arrays;

public class MoveNegLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 ,23};
		int count = 0;

		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
