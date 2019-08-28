package Arrays;

import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;

public class LargestRightSideElementInArrays {

	public static void main(String[] arg) {

		int[] input = { 5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4 };

		TreeMap<Integer, Integer> outputMap = new TreeMap<>();

		Stack<Integer> s = new Stack<>();

		int start = input[0];
		s.push(input[0]);
		for (int i = 1; i < input.length; i++) {
			if (input[i] < start) {
				s.push(input[i]);
				start = input[i];
			} else {
				outputMap.put(s.pop(), input[i]);
				if (!s.empty()) {
					start = s.peek();
					i = i - 1;
				} else {
					start = input[i];
					s.push(input[i]);
				}
			}
		}
		
		
		System.out.println(outputMap);

	}

}
