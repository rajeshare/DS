package GFG_Arrays;

public class SearchElementSortedArray {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 6;
		int i = search(arr, 0, n - 1, key);
		if (i != -1)
			System.out.println("Index: " + i);
		else
			System.out.println("Key not found");
	}

	private static int search(int[] arr, int l, int n, int key) {

		if (l > n) {
			return -1;
		}
		int mid = (l + n) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		
		if(arr[l]<arr[mid]) {
			
			
			
			
		}else if(arr[mid+1]<arr[n]){
			
		}
		
		return 0;
	}

}
