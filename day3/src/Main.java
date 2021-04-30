package day3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "Turkey", 35, 1234, "JAVA", "25");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor);
		
		System.out.println(instructor.getFirsName());
		
		
		Student student = new Student(2, "Umut", "Zengin", "12345@gmail.com", "Turkey", 25, 123456, "1234567");
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student);
		
		System.out.println(student.getFirsName());

	}

}
