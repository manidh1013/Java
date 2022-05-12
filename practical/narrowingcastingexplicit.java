package corejava;

public class narrowingcastingexplicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d =200.08;
			 
		//explicit type casting 
		long l = (long)d;
		
		//explicit type casting 
		int i =(int)l;
		
		System.out.println("double value :"+d);
		System.out.println("long value :"+l);
		System.out.println("int value :"+i);
	}

}
