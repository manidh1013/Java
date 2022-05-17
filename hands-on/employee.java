package corejava;

class employee {
	 public void employee() {
		 
		 System.out.println("manish");
	 }
}
class department extends employee {
	
	public void department() {
		System.out.println("IT");
	}
}
class state extends  department{
	
	public void show() {
		System.out.println("maharsahtra");
		
	}
}

class xyz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		state s = new state();
		s.employee();
		s.department();
		s.show();
		
	}

}
