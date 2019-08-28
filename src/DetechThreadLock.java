import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DetechThreadLock {

	
	public static void main(String[] arg) {
		test2();
	}
	

		private static void test2() {
		    final ReentrantLock lock1 = new ReentrantLock();
		    final ReentrantLock lock2 = new ReentrantLock();
			
		    Thread thread1 = new Thread(new Runnable() {
		        @Override public void run() {
		            try {
		            	lock1.lock();
		                System.out.println("Thread1 acquired lock1");
		                try {
		                    Thread.sleep(5000);
		                } catch (InterruptedException ignore) {}
		                lock2.lock();
		                System.out.println("Thread1 acquired lock2");
		            }
		            finally {
		                lock2.unlock();
		                lock1.unlock();
		            }
		        }
		    });
		    thread1.start();
		 
		    Thread thread2 = new Thread(new Runnable() {
		        @Override public void run() {
		            try {
		                lock2.lock();
		                System.out.println("Thread2 acquired lock2");
		                try {
		                   Thread.sleep(5000);
		                } catch (InterruptedException ignore) {}
		                lock1.lock();
		                System.out.println("Thread2 acquired lock1");
		            }
		            finally {
		                lock1.unlock();
		                lock2.unlock();
		            }
		        }
		    });
		    thread2.start();
		 
		    // Wait a little for threads to deadlock.
		    try {
		        Thread.sleep(100);
		    } catch (InterruptedException ignore) {}
		 
		    detectDeadlock();
		}


			// TODO Auto-generated method stub
			private static void detectDeadlock() {    
		        ThreadMXBean threadMxBean = ManagementFactory.getThreadMXBean();
		        for (ThreadInfo ti : threadMxBean.dumpAllThreads(true, true)) {
		            System.out.print(ti.toString());
		        }
				
			 
			}
		
	}
	
