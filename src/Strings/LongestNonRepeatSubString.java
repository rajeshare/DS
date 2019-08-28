package Strings;

import java.util.LinkedHashMap;

public class LongestNonRepeatSubString {
	
	public static void main(String[] arg) {
		
		String test="javaconceptoftheday";
		Integer longestNonRepeatedSubString=nonrepeat(test);
		System.out.println(longestNonRepeatedSubString);
		
	}

	private static Integer nonrepeat(String text) {
		// TODO Auto-generated method stub
	char[] ch=text.toCharArray();
	String longSubString="";
	Integer longestLenght=0;
	LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
	
	for(int i=0;i<ch.length;i++) {
		if(!map.containsKey(ch[i])) {
			map.put(ch[i], i);
		}else {
            i = map.get(ch[i]);
			map.clear();
		}
		
		if(map.size()>longestLenght) {
			longestLenght=map.size();
			longSubString=map.keySet().toString();
		}
	}
		System.out.println(longSubString);
	return longestLenght;
		
	}

}
