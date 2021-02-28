package GFG_Arrays_Aarrangements;

public class AlternatepositveNegative {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -4, -1, -3, 4, 6, -7 };
		//alternate(arr);
		alternate1(arr);

		System.out.println(java.util.Arrays.toString(arr));
	}

	// with using sorting O(NLONg) O(1)
	private static void alternate(int[] arr) {

		java.util.Arrays.sort(arr);

	}

	//
	private static void alternate1(int[] arr) {
		int end = arr.length - 1;
		int len = arr.length - 1;

		for (int i = 0; i < end;) {
			if (arr[i] > 0 && arr[end] < 0) {
				i++;
				end--;
			}
			if(arr[i] > 0 && arr[end]>0) {
				i++;
			}
			if(arr[i] < 0 && arr[end]>0) {
			//	s
			}
		}
		
	}
}
