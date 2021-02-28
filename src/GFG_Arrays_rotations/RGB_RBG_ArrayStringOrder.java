package GFG_Arrays_rotations;

import java.util.Arrays;

public class RGB_RBG_ArrayStringOrder {
	public static void main(String[] args) {
		String[] input = { "B", "G", "R", "R", "G", "B", "B", "B", "G", "R", "B", "G", "G" }; 
		// O/p [R, R, R, G, G, G, G, G, B, B, B, B, B]
																								
		order1(input);
		System.out.println(Arrays.asList(input));
	}
	// O/p [R, R, R, G, G, G, G, G, B, B, B, B, B]

	private static String[] order(String[] input) {
		int j = input.length - 1;
		int r = 0;
		for (int i = 0; i < input.length;) {
			String tmp = input[i];
			if (tmp.equalsIgnoreCase("g")) {
				input[i] = input[j];
				input[j] = tmp;
				j--;
			} else if (tmp.equalsIgnoreCase("b")) {
				i++;
			} else if (tmp.equalsIgnoreCase("r")) {
				input[i] = input[r];
				input[r] = tmp;
				r++;
			}
		}
		return input;
	}
	// O/p [R, R, R, B, B, B, B, B, G, G, G, G, G,]

	private static String[] order1(String[] input) {
		int j = input.length - 1;
		int r = 0;
		for (int i = 0; i < input.length;) {
			String tmp = input[i];
			if (tmp.equalsIgnoreCase("b")) {
				input[i] = input[j];
				input[j] = tmp;
				j--;
			} else if (tmp.equalsIgnoreCase("g")) {
				i++;
			} else if (tmp.equalsIgnoreCase("r")) {
				input[i] = input[r];
				input[r] = tmp;
				r++;
			}
		}
		return input;
	}
}
