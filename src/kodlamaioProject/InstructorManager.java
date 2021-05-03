package kodlamaioProject;

public class InstructorManager extends UserManager{
	public void addCourse() {
		System.out.println("Kurs eklendi");
	}
	
	public void deleteCourse() {
		System.out.println("Kurs silindi");
	}
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : "+user.getId());
	}
}
