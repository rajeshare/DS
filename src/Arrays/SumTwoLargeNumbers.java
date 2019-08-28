package Arrays;

public class SumTwoLargeNumbers {

	public static void main(String[] args) {
		//int[] array= {100,200,200,500,100};
		
		
		sum("12345","123456");
		
		
	}

	private static void sum(String str1,String str2) {
		
		
		// Before proceeding further, make sure length  
	    // of str2 is larger.  
	    if (str1.length() > str2.length()){  
	        String t = str1; 
	        str1 = str2; 					//s1=22222222  s2=111111111
	        str2 = t; 
	    } 
	    // Take an empty String for storing result  

	    String str = "";  
	    int carry = 0;  

	    int n1 = str1.length(), n2 = str2.length();  
	    // Reverse both of Strings 
	    
	    str1=new StringBuilder(str1).reverse().toString();  //  54321
	    str2=new StringBuilder(str2).reverse().toString(); 	//  654321
	  
	    for(int i=0;i<n1;i++) {
	    	int sum =    (int)(str1.charAt(i)-'0')+(int)(str2.charAt(i)-'0')+carry;
	    	str+=(char)(sum%10)+'0';
	    	carry=sum/10;
	    }
	}

}
