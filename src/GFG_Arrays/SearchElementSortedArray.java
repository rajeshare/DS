package GFG_Arrays;

public class SearchElementSortedArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
		int n = arr.length;
		int key = 2;
		//int i = search1(arr, 0, n, key);
		int i = search2(arr, 0, n-1, key);

		if (i != -1)
			System.out.println("Index: " + i);
		else
			System.out.println("Key not found");
	}

	// 1) Find out pivot point and divide the array in two
	// sub-arrays. (pivot = 2) /*Index of 5*/
	// 2) Now call binary search for one of the two sub-arrays.
	// (a) If element is greater than 0th element then
	// search in left array
	// (b) Else Search in right array
	// (1 will go in else as 1 < 0th element(3))
	// 3) If element is found in selected sub-array then return index
	// Else return -1.
	// 5 6 7 8 9 10 11 12 1 2 3 key is 2
	// 0 1 2 3 4 5 6 7 8 9 10

	private static int search1(int[] arr, int l, int h, int key) {
		int pivot = findPivot(arr, l, h - 1);

		System.out.println(pivot);

		if (arr[pivot] == key) {
			return pivot;
		}
		if (arr[l] <= key) {
			return binarySearch(arr, l, pivot - 1, key);
		}
		if (arr[pivot + 1] < key) {
			return binarySearch(arr, pivot + 1, h, key);
		}

		return 0;
	}

	static int binarySearch(int arr[], int low, int high, int key) {
		if (high < low)
			return -1;

		/* low + (high - low)/2; */
		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}

	private static int findPivot(int[] arr, int l, int h) {
		if (h < l)
			return -1;
		if (l == h)
			return l;

		int mid = (l + h) / 2;

		if (mid < h && arr[mid] > arr[mid + 1]) {
			return mid;
		}
		if (l < mid && arr[mid] < arr[mid - 1]) {
			return mid - 1;
		}
		if (arr[mid] > arr[h]) {
			return findPivot(arr, mid + 1, h);
		}

		return findPivot(arr, l, mid - 1);
	}

	// 5 6 7 8 9 10 11 12 1 2 3 key is 2 index 9

	/*
	 * 1) mid 2) check forst half sorted check key lied in first else search it
	 * second half 3) if Secod half sorted check key lies beween secodn else
	 */

	private static int search2(int[] arr, int l, int h, int key) {

        if (l > h) 
            return -1; 
        
		int mid = (l + h) / 2;
		if (arr[mid] == key) {
			return mid;
		}
		if(arr[l]<arr[mid]) {
			if(arr[l]<key&&key<arr[mid]) {
				return search2(arr,l,mid,key);
			}
			return search2(arr,mid+1,h,key);
		}else {
		 if (key >= arr[mid] && key <= arr[h]) 
	            return search2(arr, mid + 1, h, key); 
		
		return search2(arr, l, mid - 1, key);
		}

	}

}
