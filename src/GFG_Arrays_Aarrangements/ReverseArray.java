package GFG_Arrays_Aarrangements;

import java.sql.SQLPermission;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//reverse(arr);
		reverseRec(arr,0,arr.length-1);
		System.out.println(java.util.Arrays.toString(arr));
	}

	private static void reverse(int[] arr) {
		int s = 0;
		int e = arr.length - 1;

		while (s < e) {
			swap(arr, s, e);
			s++;
			e--;
		}
	}

	private static void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}

	private static void reverseRec(int[] arr,int l,int h) {
		
		if(l>h) {
			return;
		}
		swap(arr,l,h);
		reverseRec(arr,l+1,h-1);
	}

}
