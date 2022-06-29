//create thread by using runnable interface
package corejava;

public class ThreadExample1 implements Runnable {
	 //initiated run method for thread
	 public void run() 
	 {
		 System.out.println("thread is running successfully.");
	 }

	 public static void main(String[] args) {
		 
		 ThreadExample1 th = new ThreadExample1();
		 //intializing thread object
		 Thread tt = new Thread(th);
		 
		 //invoking thread
		 tt.start();
		
		
		

	}

}
