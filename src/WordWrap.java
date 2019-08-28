
public class WordWrap {

	public static void main(String[] atr) {
		
		
		String test="rajesh rajesh rajkesj rajehs rajesh rakesh rakejh  adfadsas asdsd asdaasdad";
		System.out.println(wordWrap(test).toString());
	}
	
	
	
	public static StringBuilder wordWrap(String content) {
		
		int length = content.length();
		StringBuilder sb=new StringBuilder();
		int count=0;
		for(int i=0;i<length-1;i++) {
			if(count==15 || content.charAt(i)==' ') {
			sb.append("\r\n");
			count=0;
			}
			sb.append(content.charAt(i));
			count++;
		}
		return sb;
	}
	
	
}
