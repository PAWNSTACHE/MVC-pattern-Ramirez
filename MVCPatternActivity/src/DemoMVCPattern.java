
public class DemoMVCPattern {
	public static void main(String[] args) {
		Student model = retrieveStudentFromDatabase();		
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Geo Miles");
		student.setRollNo("2020300829");
		return student;
	}
}

