package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPossibleDecodeStrings {

	public static void main(String[] args) {
		String[] str = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		String input = "234";

		List<String> res = permutation(str, input);
		System.out.println(res);
	}

	private static List<String> permutation(String[] str, String input) {

		List<String> res = new ArrayList<>();
		if (input == null || input.length() == 0) {
			return res;
		}
		String[] mappings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		letterCombRec(res, input, "", 0, mappings);

		return res;
	}

	private static void letterCombRec(List<String> res, String dig, String cur, int index, String[] mappings) {
		
		if(index==dig.length()) {
			res.add(cur);
			return;
		}
		dig.charAt(index);
		String leters=mappings[dig.charAt(index)-'0'];
		
		
		for(int i=0;i<leters.length();i++) {
			
			letterCombRec(res,dig,cur+leters.charAt(i),index+1,mappings);
			
		}
		
		
		
	}

}
