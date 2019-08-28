package Arrays;

import java.util.Arrays;

public class FactorialLargeNumber {
	public static void main(String[] args) {
		int number = 10;
		fact(number);
	}

	private static void fact(int x) {
		int[] res=new int[500];
		res[0]=1;
		int res_size=1;
		
		for(int i=2;i<=x;i++) {
			res_size=multiply(i, res, res_size);
		}
		System.out.println(Arrays.toString(res));
	
		
		
	}
//  2    [1]    1 = 2 [2] 1 //3 [2] 1 == 3 [6] 1// 4 [6] 1 == 4 [4,2] 2
//	5    [4,2]   2
 	
	private static int multiply(int x, int[] res, int res_size) {
		int carry=0;
		
		for(int i=0;i<res_size;i++) {
			int prod=res[i]*x+carry;
			res[i]=prod%10;
			carry=prod/10;
		}
		
		while(carry!=0) {
			res[res_size]=carry;
			carry=carry/10;
			res_size++;
			
		}
		
		return res_size;}
}
