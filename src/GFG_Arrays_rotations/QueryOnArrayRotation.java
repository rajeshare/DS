package GFG_Arrays_rotations;

import java.awt.List;
import java.util.stream.Stream;

import javax.xml.transform.stream.StreamSource;

/*
 * 
 * Input : n = 5, arr[] = { 1, 2, 3, 4, 5 }
        query 1 = { 1, 3 }
        query 2 = { 3, 0, 2 }
        query 3 = { 2, 1 }
        query 4 = { 3, 1, 4 }
Output : 12
         11
Initial array arr[] = { 1, 2, 3, 4, 5 }
After query 1, arr[] = { 3, 4, 5, 1, 2 }.
After query 2, sum from index 0 to index 
               2 is 12, so output 12.
After query 3, arr[] = { 4, 5, 1, 2, 3 }.
After query 4, sum from index 1 to index 
               4 is 11, so output 11.
 * 
 */

public class QueryOnArrayRotation {

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5 };
		Integer input[][] = { { 1, 3 }, { 3, 0, 2 }, { 2, 1 }, { 3, 1, 4 } };

		for (int i = 0; i < input.length; i++) {
			int sel = input[i][0];
			switch (sel) {
			case 1:
				ArrayCircleRotate.cirlerotation1(arr, input[i][1]);
				print(arr);
				break;
			case 2:
				ArrayLeftRotation.rotation4(arr, input[i][1]);
				print(arr);
				break;
			case 3:
				int sum = 0;
				for (int j = input[i][1]; j <= input[i][2]; j++) {
					sum += arr[j];
				}
				System.out.println("sum is"+sum);
				break;
			default:
				break;
			}
		}
	}

	public static void print(Integer[] arr) {
		Stream.of(arr).forEach(System.out::print);
		System.out.println();
	}

}
