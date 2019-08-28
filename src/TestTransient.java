import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestTransient {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		A a=new A();
		System.out.println(a);
		ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("D://tmp//test.ser"));
		ob.writeObject(a);
		
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://tmp//test.ser")); 

        A object1 = (A)in.readObject(); 

		System.out.println(object1.a);
		
	}

}

class A implements Serializable {

	transient int a=10;

	@Override
	public String toString() {
		return "" + a;
	}

}