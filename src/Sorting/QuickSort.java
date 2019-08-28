package Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] arg) {
		int[] a = { 10, 8, 7, 0, 1, 2, 4, 5, 6, 9, 11, 3 };
	//	System.out.println(partision(a, 0, a.length-1));
		
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void quickSort(int[] a,int l,int r) {
		if(l<r) {
			int p=partision(a, l, r);
			quickSort(a, l, p-1);
			quickSort(a, p+1, r);
		}
	}

	public static int partision(int[] a, int l, int r) {

		int x = a[r];
		int i = l - 1;
		for (int j = l; j < r; j++) {
			if (a[j] <= x) {
				i = i + 1;
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		int tmp=a[i+1];
		a[i+1]=a[r];
		a[r]=tmp;

		return i+1;

	}

}
