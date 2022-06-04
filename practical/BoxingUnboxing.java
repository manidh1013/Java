package corejava;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// Assigning primitive long value to Wrapper Long variable x. Compiler performs autoboxing
        Long x = 430L;
        // Assigning primitive char value to Wrapper Character variable y. Compiler performs autoboxing
        Character y = 'a';
               
        int a=50;  
        Integer a2=new Integer(a);//Boxing  
        
         Integer a3=5;//Boxing  
                 System.out.println(a2+" \n"+a3); 
                 System.out.println(x);
                 System.out.println(y);
               
                 
	}

}
