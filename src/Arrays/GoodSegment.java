package Arrays;

import java.util.Arrays;

public class GoodSegment {

	public static void main(String[] args) {

		 int[] bad = { 37, 7, 22, 15, 49, 60 };
		//int[] bad = { 5, 4, 2, 14 };

		 int low = 3, up = 48;
		//int low = 1, up = 10;

		Arrays.sort(bad);

		// [7, 15, 22, 37, 49, 60]
		// [2,4,5,14]
		System.out.println(Arrays.toString(bad));
		int resultsdistance = 0;
		int i = 0;
		int prev = 0;
		while (i < bad.length) {
			if (low <= bad[i] && bad[i] <= up) {
				if (((bad[i] - 1) - low) > resultsdistance) {
					resultsdistance = (bad[i] - 1) - low;
				}
				prev = bad[i];
				low = bad[i] + 1;
			}
			i++;

		}
		if (up - prev > resultsdistance) {
			resultsdistance = up - prev;
		}

		System.out.println(resultsdistance);

	}

}
