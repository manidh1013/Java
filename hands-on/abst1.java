package corejava;

public class abst1  extends abst {
	
	public int addition(int n1 , int n2) {
		return n1+n2 ;
	}
	public int subtraction(int n1 , int n2) {
			return n1-n2;
				
	}

	public static void main(String[] args) {
		 
		abst a=new abst1();
		
		System.out.println("addition :"+ a.addition(10,10));
		System.out.println("subtraction:"+a.subtraction(20,10));
	
	}

}

