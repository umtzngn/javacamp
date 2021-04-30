package day3;

public class InstructorManager extends UserManager {
	
	public void addInstructor(Instructor instructor) {
		super.addUser(instructor);
	}
	
	public void updateInstructor(Instructor instructor) {
		super.updateUser(instructor);
		System.out.println("Eðitmen güncellendi");
	}

}
