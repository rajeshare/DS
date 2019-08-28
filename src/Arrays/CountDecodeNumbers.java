package Arrays;

import java.util.ArrayList;

public class CountDecodeNumbers {
	static char[] ch = new char[27];
	static {
		for (int i = 1; i < 26; i++) {
			ch[i] = (char) ('A' + i - 1);
		}
	}

	public static void main(String[] args) {

		int[] dig = { 1, 2, 3, 1, 2, 4 };

		// ABCABD LCABD AWABD ABCLD ABCAX
		int res = countDecodePossibleNumbers(dig);
		System.out.println(res);
	}

	private static int countDecodePossibleNumbers(int[] dig) {
		ArrayList<String> decs = new ArrayList<>();

		StringBuilder decode = new StringBuilder();
	
		for (int i = 0; i < dig.length; i++) {
			decode.append(ch[dig[i]]);
		}
		decs.add(decode.toString());
		//decode = new StringBuilder();
		
		int next=1;
		
		for (int i = 0; i < dig.length&&next<dig.length; i++) {
			
				int index=Integer.parseInt(""+dig[i]+dig[next]);
				if(index<=26) {
				String dec=decode.toString().substring(0,next-1)+ch[index]+decode.toString().substring(next+1, dig.length);
				decs.add(dec);
				}
				next=next+1;
		}
		System.out.println(decs);

		return decs.size();
	}

}
