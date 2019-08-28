package Strings;

public class PermutationsofString {

	public static void main(String[] args) {
		String A="ABC";
		permutation(A);
	}

	private static void permutation(String a) {
		
		
		permutation("",a);
		
	}
	
	public static void permutation(String per,String rem) {
		
		if(rem.isEmpty()) {
			System.out.println(per+rem);
		}else {
			
			for(int i=0;i<rem.length();i++){
				permutation(per+rem.charAt(i), rem.substring(0,i)+rem.substring(i+1,rem.length()));
			}
			
		}
		
		
	}

}
