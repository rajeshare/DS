import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsTest {
	
	public static void main(String[] main) {
		
		ArrayList<String> a=new ArrayList<>();
		
		a.add("rajesh");
		a.add("rakesh");
		//a.stream().map(e->e.toLowerCase()).map(e->e.toUpperCase()).forEach(System.out::println);
		Stream<String> s=a.stream();					
		Stream<String> longStringsStream = s.filter((value) -> {
		    return value.length() >= 3;
		});
	}

}
