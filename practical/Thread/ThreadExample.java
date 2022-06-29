//create threads by extending thread class
package corejava;
 class ThreadExample extends Thread{
	 
	 //initiated run method for thread
	 public void run() 
	 {
		 System.out.println("thread started running.");
	 }

	 public static void main(String[] args) {
		 
		 ThreadExample th = new ThreadExample();
		 //invoking thread
		 th.start();
		
		
		

	}

}
