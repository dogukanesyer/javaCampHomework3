package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.setId(1);
		student1.firstName="Doğukan";
		student1.lastName="Eşyer";
		student1.setEmail("dogukanesyer@gmail.com");
		student1.setPassword("12345");
		
		Student student2=new Student();
		student2.setId(2);
		student2.firstName="Deniz";
		student2.lastName="Tekin";
		student2.setEmail("deniztekin@gmail.com");
		student2.setPassword("678910");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("111213");
		
		StudentManager studentManager=new StudentManager();
		studentManager.courseRegister();
		studentManager.login();
		studentManager.addComment();
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(student1);
		instructorManager.addCourse();
		instructorManager.addComment();
		instructorManager.deleteCourse();

	}

}
