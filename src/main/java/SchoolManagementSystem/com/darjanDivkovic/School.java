package SchoolManagementSystem.com.darjanDivkovic;

import java.util.ArrayList;

public class School {
	
	// Contains teachers and students
	ArrayList<Teacher> teachers = new ArrayList();
	ArrayList<Student> students = new ArrayList();
	double moneyEarned = 0;
	double schoolBalance = 0;
	double paidInSalaries = 0;
	
	// Constructors
	School(){}
	
	School(double schoolBalance){
		this.schoolBalance = schoolBalance;
	}
	
	// Recieve a payment
	public void recievePayment(double payment) {
		this.moneyEarned += payment;
		this.schoolBalance += payment;
	}
	
	public double payTeacher(double payment) {
		if(schoolBalance >= payment) {
		schoolBalance -= payment;
		paidInSalaries += payment;
		
		return payment;
		}
		else
		return 0;
	}

	// Get & Set
	
	public double getMoneyEarned() {
		return moneyEarned;
	}

	public double getSchoolBalance() {
		return schoolBalance;
	}

	public double getSalariesPaid() {

		return paidInSalaries;
	}
	
	// Create new school Member and add to respectable arrayL
	public Person createNewPerson() {
		Person person;
		System.out.println("Adding a school member!");
		
		System.out.println("Enter name:");
		String name = Util.unos.nextLine();
		
		System.out.println("Enter surname:");
		String surname = Util.unos.nextLine();
		
		System.out.println("Give new ID :");
		int id = Util.unos.nextInt();
		
		System.out.println("Who is this person ? [T-teacher / S-student]");
		String type = Util.unos.nextLine();
		
		if(type == "T") {
			System.out.println("Enter teachers salary: ");
			double newSalary = Util.unos.nextDouble();
			person = new Teacher(id,name,surname, newSalary);
			return person;
		}
		if(type == "S") {
			person = new Student(id,name,surname);
			return person;
		}
		
		System.out.println("Wrong input son!");
		return null;
		
	}
	
	
}
