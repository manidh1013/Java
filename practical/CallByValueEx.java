package corejava;

//java pgm showcasing uses of call by value in this example



//class
public class CallByValueEx {
	//swap method
	static void swap(int a,int b) {
		
		// Creating a temporary variable in stack memory
        // and updating values in it.
		int temp = a;
	a=b;
	b=temp;
    // This variables vanishes as scope is over
	//// Display message after swapping numbers
	System.out.println("Values after swapping x="+a+" y="+b);
	}
	
	
	public static void main(String[]args) {
	int x=3;
	int y=8;
	System.out.println("Values before swapping x="+x+" y="+y);
	//calling swap mehod
	swap(x,y);

	 

	}
	}