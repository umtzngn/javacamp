package day3;

public class StudentManager extends UserManager {
	
	public void addStudent(Student student) {
		super.addUser(student);
	}
	
	public void updateStudent(Student student) {

		super.updateUser(student);
		System.out.println("Öğrenci güncellendi");
	}

}
