package GFG_Arrays_Aarrangements;

import java.util.stream.Stream;

public class ElementThereOrNOt0_N_1 {

	public static void main(String[] args) {
		Integer[] arr = { 19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4 };

		for (int i = 0; i < arr.length; ) {
			if (arr[i] >= 0 && arr[i] != i) {
				int temp=arr[arr[i]];
				arr[arr[i]]=arr[i];
				arr[i]=temp;
			}else {
				i++;
			}
		}
		print(arr);

	}

	private static void print(Integer[] arr) {

		Stream.of(arr).forEach(x -> System.out.print(x + " "));

	}

}
