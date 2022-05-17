package corejava;

class singleinheritance {
    public void print() {
	 System.out.println("manish");
 }
}
 class singleinheritance1 extends singleinheritance{
	 public void show() {
		 
		 System.out.println("patil");
	 }
}
 class RunMethod{
			
	public static void main(String[] args) {
		
		singleinheritance1 s = new singleinheritance1();
		 s.show();
		 s.print();
		 s.show();
		
	}

}
