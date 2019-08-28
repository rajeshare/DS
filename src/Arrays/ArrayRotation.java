package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {

	void rotateRight(int[] input, int d) {
		reverse(input, 0, d - 1);
		reverse(input, d, input.length - 1);
		reverse(input, 0, input.length - 1);
	}

	void rotateCycle(int[] in, int d) {

		reverse(in, 0, in.length - 1);
		reverse(in, 0, d - 1);
		reverse(in, d, in.length - 1);

	}

	public List<Integer> findDuplicates(int[] nums) {
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {

			int num = Math.abs(nums[i]);

			if (nums[num - 1] > 0) {
				nums[num - 1] = -nums[num - 1];
			} else {
				dup.add(Math.abs(num));
			}
		}

		return dup;
	}

	public void reverse(int[] in, int start, int end) {
		while (start < end) {
			int temp = in[end];
			in[end] = in[start];
			in[start] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
	//	int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		int[] input ={10,2,5,10,9,1,1,4,3,7};
		ArrayRotation a = new ArrayRotation();
		System.out.println(Arrays.toString(input));

		// a.rotateRight(input, 2);
		//a.rotateCycle(input, 2);
		a.findDuplicates(input);
		System.out.println(Arrays.toString(input));
	}

}
