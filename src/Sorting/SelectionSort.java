package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] arg) {
		
	int[] ar= {3,2,1,5,4,6,9,8,7};	
	//int[] res=selectionSort(ar);	
	int[] res=selectionSort(ar);	
	System.out.println(Arrays.toString(res));
	}

	private static int[] selectionSort(int[] ar) {
		
		for(int i=0;i<ar.length-2;i++) {
			int min=i;
			for(int j=i+1;j<ar.length-1;j++) {
				if(ar[j]<ar[i]) {
					min=j;     // to find min 
				}	
			}
			int tmp=ar[i];		// replace with min value
			ar[i]=ar[min];	
			ar[min]=tmp;
			
		}
		return ar;
	}
	
	
	public static int[] mergeSort(int[] a,int low,int high) {
		
		
		
		if(low<high) {
			int mid = (low+high)/2;
			
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			
			merge(low,mid,high);
			
		}
		
		
		
		
		
		return null;
	
	
	}	
	

}
