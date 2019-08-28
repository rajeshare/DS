package Strings;

public class Factorial {
	
	public static void main(String[] arg) {
		
		int x=100;
		factorial(x);
		
	}

	private static void factorial(int x) {
		
		int[] res=new int[500];
		
		int res_size=1;
		res[0]=1;
		for(int i=2;i<=x;i++) {
		res_size=factorial(i,res,res_size);
		}
		
	}
	private static int factorial(int x, int[] res, int res_size) {
		int carry=0;
		
		for(int i=0;i<res_size;i++) {
			int prod=res[i]*x+carry;
			res[i]=prod%10;
			carry=prod/10;
		}
		
		if(carry!=0) {
			res[res_size]=carry%10;
			carry=carry%10;
			
		}
		
		
		return 0;
	}


}
