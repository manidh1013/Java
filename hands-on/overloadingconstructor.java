package corejava;

import java.util.Scanner;

class overloadingconstructor {
	String empname;
	int empid;
	
	
		overloadingconstructor(String empname, int empid) {
			this.empname = empname;
			this.empid = empid;
	}
		
	public overloadingconstructor(int empid) {
			this.empid = empid;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 overloadingconstructor obj1 = new  overloadingconstructor("manish",125);
		 overloadingconstructor obj2 = new  overloadingconstructor(15);
		  
		System.out.println("employee name :"+obj1.empname+"   "+"emplyee id : "+" "+obj1.empid);
		System.out.println("emplyee id :"+"  "+obj2.empid);
		
	}

}
