import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface Drawable{  
    public void draw(int a);  
}  
 class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }

//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		
//		if(this.id<o.id) {
//			return -1;
//		}else if(this.id>o.id) {
//			return 1;
//		}else return 0;
//		
//	}  
}  
public class LambdaExpressionExample {  
    public static <T> void main(String[] args) {  
     //   int width=10;  
  
        //without lambda, Drawable implementation using anonymous class  
     //   Drawable d=()->System.out.println("Drawing "+width);
        Drawable d=(width)->System.out.println("Drawing "+width);

        d.draw(10);
        
        
        
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        
        List<Product> list1=new ArrayList<Product>();  
        
        //Adding Products  
        list1.add(new Product(1,"HP Laptop",25000f));  
        list1.add(new Product(3,"Keyboard",300f));  
        list1.add(new Product(2,"Dell Mouse",150f));  
        
      //  Collections.sort((List<Product>) list1);
        
        
        Comparator<Product> c=new Comparator<Product>() {
			
			@Override
			public int compare(Product o1, Product o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		}; 
        
        Collections.sort(list1,(Product o1, Product o2)->{
			return o1.name.compareTo(o2.name);}
		);
        
        
      Stream<Product> s=  list1.stream().filter(p->p.price>150);
     // s.forEach(System.out::println);
      s.forEach((Product p)->System.out.println(p.id+" "+p.price));

       // list1.forEach((Product o)->System.out.println(o.name));
    }
   
}  