import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    private static HashMap<String,Integer> dictionary = new HashMap<>(); 

	  public static void main(String []args) 
	    { 
	          
	        // array of strings to be added in dictionary set. 
	        String temp_dictionary[] = {"mobile","samsung","sam","sung",  
	                            "man","mango","icecream","and",  
	                            "go","i","like","ice","cream"}; 
	                              
	        // loop to add all strings in dictionary set  
	        for (String temp :temp_dictionary) 
	        { 
	            dictionary.put(temp,0); 
	        } 
	
	        // sample input cases 
	        System.out.println(wordBreak("ilikesamsung")); 
	        System.out.println(maxWord()); 

//	        System.out.println(wordBreak("iiiiiiii")); 
//	        System.out.println(wordBreak("")); 
//	        System.out.println(wordBreak("ilikelikeimangoiii")); 
//	        System.out.println(wordBreak("samsungandmango")); 
//	        System.out.println(wordBreak("samsungandmangok")); 
	    }

	private static boolean wordBreak(String string) {
		
		int len=string.length();
		
		if(len==0) {
			return true;
		}
		
		for(int i=1;i<=len;i++) {
			
			if(dictionary.containsKey(string.substring(0,i))&&wordBreak(string.substring(i,len))){
			return true;	
			}
			
		}
		return false;
		
	}
	
	private static String maxWord() {
		String input="mobile sam sung samsung man mango mango mango ice cream";
		int maxValue=0;String key=null;
		String[] in=input.split(" ");
		
		for (String i : in) {
			
			if(dictionary.containsKey(i)) {
				Integer intvaule=dictionary.get(i);
				intvaule=intvaule+1;
				dictionary.put(i, intvaule);
				if(maxValue<intvaule) {
					key=i;
					maxValue=intvaule;
				}
				
			}
		}
		
		return key;
	}

}
