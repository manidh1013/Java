package corejava;

public class StudentJavaBean2 {
	private int id;
	private String name;
	public String[] subjects;
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String[] getSubjects() {
	return subjects;
	}
	public void setSubjects(String[] subjects) {
	this.subjects = subjects;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentJavaBean2 student = new StudentJavaBean2();
		String[] subjects = { "English", "Science", "Computer" };
		// setting bean values
		student.setId(101);
		student.setName("Karthik");
		student.setSubjects(subjects);
		// getting bean value
		System.out.println("Student Id : " + student.getId());
		System.out.println("Student name : " + student.getName());
		String[] subjectArray = student.getSubjects();
		for (int i = 0; i < subjectArray.length; i++) {
		System.out.println("Student subject " + (i + 1) + " : " + subjectArray[i]);
		}
		}
		}
					
	