package SchoolManagementSystem.com.darjanDivkovic;

public class MAIN {

	public static void main(String[] args) {
		
		School school = new School();
		
		Student student = new Student();
		
		school.recievePayment(student.payFee(0));
		
		System.out.println("Student just paid 100$ !");

		System.out.println("School new balance = "+school.getSchoolBalance());
		System.out.println("School stats - money earned:  "+school.getMoneyEarned());
	
		Teacher teacher = new Teacher();
		teacher.recieveSalary(school.payTeacher(100));
		
		System.out.println("Teacher got paid");
		System.out.println("Teacher recieved in payments: "+teacher.getMoneyRecievedInSalaries());
	}

}
