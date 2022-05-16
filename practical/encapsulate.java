package corejava;

public class encapsulate {

	public static void main(String[] args) {
		
		//creating object of encapsulation class
		encapsulation  e = new encapsulation();
		
	
    		//setting value of variable
			e.setName("manish");
			e.setAge(20);
			e.setRollno(125);
		
			
			//displaying value of variable
			System.out.println("name:"+ e.getName());
			System.out.println("rollno:"+ e.getAge());
			System.out.println("age"+ e.getRollno());

		
		
		
	}

}
