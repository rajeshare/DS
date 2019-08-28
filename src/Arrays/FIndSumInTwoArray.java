package Arrays;

import java.util.HashMap;

public class FIndSumInTwoArray {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 4, 5, 7, 8 };
		int[] arr2 = new int[] { 1, 4, 7, 10 };
		HashMap<Integer, Integer> sum = findSumInArrays1(arr1, arr2, 12);
		System.out.println(sum);

	}

	// O(T) =O(n*n)
	private static HashMap<Integer, Integer> findSumInArrays(int[] arr1, int[] arr2, int x) {
		HashMap<Integer, Integer> res = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] + arr2[j] == x) {
					res.put(arr1[i], arr2[j]);
				}
			}
		}
		return res;
	}

	// 1
	//
	//
	//
	private static HashMap<Integer, Integer> findSumInArrays1(int[] arr1, int[] arr2, int x) {
		HashMap<Integer, Integer> res = new HashMap<>();
		int i = arr1.length - 1;
		// for (int i = arr1.length - 1; i >= 0;) {
		for (int j = 0; j < arr2.length && i >= 0;) {
			if (arr1[i] + arr2[j] < x) {
				j++;
			} else if (arr1[i] + arr2[j] > x) {
				i--;
			} else if (arr1[i] + arr2[j] == x) {
				res.put(arr1[i], arr2[j]);
				i--;
			}
		}

		// }

		return res;
	}

}
