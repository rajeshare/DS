package Arrays;

import java.util.ArrayList;

public class SteppingNumber {

	public static void main(String[] args) {

		int s = 0, end = 222;
		System.out.println(steppingNumbers(s, end));

	}

	public static ArrayList<Integer> steppingNumbers(int s, int e) {
		ArrayList<Integer> res = new ArrayList<>();

		int i = 0;
		while (s <= e) {

			if (s <= 10) {
				res.add(s);
			} else {
				if (diffofdigits(s)) {
					res.add(s);
				}
			}
			s = s + 1;
		}

		return res;

	}

	// 123
	public static boolean diffofdigits(int x) {
		boolean result = false;
		int diff = x % 10;
		x = x / 10;
		while (x > 0) {
			int div = x / 10;
			int rem = x % 10;
			diff = Math.abs(diff - rem);
			if (diff == 1) {
				result = true;
			} else {
				return false;
			}
			diff = rem;
			x = div;
		}
		return result;
	}
	
	//
	
	// recursion
	public static boolean diffofdigits1(int x) {
		boolean result = false;
		int diff = x % 10;
		x = x / 10;
		while (x > 0) {
			int div = x / 10;
			int rem = x % 10;
			diff = Math.abs(diff - rem);
			if (diff == 1) {
				result = true;
			} else {
				return false;
			}
			diff = rem;
			x = div;
		}
		return result;
	}
	
	public boolean diffofdigitsrec(int x,int prev){
		if(x<=0) {
			return false;
		}
		if(Math.abs(prev-x)==1) {
			return true;
		}
		return false;
	}

}
