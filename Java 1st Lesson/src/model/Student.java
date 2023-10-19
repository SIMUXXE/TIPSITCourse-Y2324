package model;

public class Student extends Person{
	private String classroom;
	public Student(String firstName, String lastName, int age, String classroom) {
		super(firstName, lastName, age);
		this.classroom = classroom;
		
	}
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	public String toString() {
		return """
				%s I'm from %s
				""".formatted(super.toString(),classroom);
	}
}