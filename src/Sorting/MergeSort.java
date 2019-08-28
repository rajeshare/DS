package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] a= {10,2,3,8,19,15,1,7,9};
		
		mergeSort(a,0,a.length-1);

	}

	private static void mergeSort(int[] a, int l, int r) {
		if(l<r) {
			int q=(l+r)/2;
			mergeSort(a, l, q);
			mergeSort(a, q+1, r);
			merge(a, l, q, r);
		}
	}
	
	
	private static void merge(int[] a,int l,int q,int r) {
		
		 
		
		
		
	}

}
