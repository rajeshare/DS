package GFG_Arrays;

public class FindPairInSortedAndRotatedArrayGivenSum {

	public static void main(String[] args) {
		int test[] = { 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
		int sum = 16;
		findPairArrayGivenSUm(test, sum);
	}

	// 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3 Sum 16

	
	/*
	 * Idea is
	 * 1) we have to pivot element then
	 * 
	 * while(min!=max)
	 * Add value min and max indexes
	 * 2) Add value = sum return it
	 * 3)		Add value >sum then increament min  if range exceed give start
	 * 3)   	Add value <sum then increament max  if range exceed give ending
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	private static int[] findPairArrayGivenSUm(int[] A, int sum) {
		int pivot = SearchElementSortedArray.findPivot(A, 0, A.length - 1);
		int res[] = new int[2];

		int min = pivot + 1;
		int max = pivot;

		while (min != max) {
			int value=A[min]+A[max];
			if (value == sum) {
				res[0] = A[min];
				res[1] = A[max];
				return res;
			} else if (value < sum) {
				min++;
				if (min == A.length - 1) {
					min = 0;
				}
			} else if (value > sum) {
				if (max == 0) {
					max = A.length - 1;
				} else {
					max--;
				}
			}
		}
		return res;
	}

}
