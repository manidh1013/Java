package corejava;

 class ConstructorOverloading {
		String name  ;
		double gpa;
		
		ConstructorOverloading(String name,double gpa) {
			
			this.name = name;
			this.gpa = gpa;
		}

		ConstructorOverloading(String name) {
			
			this.name = name;
		}

	public static void main(String[] args) {
		
		ConstructorOverloading obj1 = new ConstructorOverloading("manish ",7.23);
		ConstructorOverloading obj2 = new ConstructorOverloading("manish");
		System.out.println(obj1.name + obj1.gpa );
		System.out.println(obj2.name);
	}

}
