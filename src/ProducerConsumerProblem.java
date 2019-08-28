import java.util.concurrent.BlockingQueue;  
import java.util.concurrent.LinkedBlockingQueue;  
import java.util.logging.Level;  
import java.util.logging.Logger;  
public class ProducerConsumerProblem {  
	static boolean exit=false;
	static BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>(1);
    public static void main(String args[]) throws InterruptedException{  
     //Creating shared object  
     //Creating Producer and Consumer Thread  
    	
    	
    	ProducerConsumerProblem p=new ProducerConsumerProblem();
     Runnable prod = new Runnable() {
		
		@Override
		public void run() {
			for(int i=0; i<10; i++){  
	             try {  
	             	sharedQueue.put(i);  
	             	
	             if(i==9) {
	            	 exit=true;
	            	 
	             }
	                 System.out.println("Produced: " + i);  
	             } catch (InterruptedException ex) {  
	             }  
	         }  			
		}
	};
	Thread t1=new Thread(prod);
	

         	 
     Runnable cons = new Runnable(){

    	 @Override  
    	    public void run() {  
    	        while(true){  
    	            try {  
    	                System.out.println("Consumed: "+ sharedQueue.take());  
    	            } catch (InterruptedException ex) {  
    	            }  
    	        }  
    	    }  
    	 
     };  
     Thread t2=new Thread(cons);
  
     //Starting producer and Consumer thread  
     t1.start();  
     t2.start();  
     t1.join();
     if(exit) {
    	 System.exit(0);
     }
  
    }  
  
}  