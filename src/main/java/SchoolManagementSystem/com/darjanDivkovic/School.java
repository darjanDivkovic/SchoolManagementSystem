package SchoolManagementSystem.com.darjanDivkovic;

import java.util.ArrayList;

public class School {
	
	// Contains teachers and students
	ArrayList<Person> schoolRegister = new ArrayList();
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
		
	// Takes the Person from createNewPerson method and uses polymorphism to declare the type
	// depending on the user input - S - student - T - techer
	

	
//	public void addNewPersonToSchoolRegister() {
//
//		schoolRegister.add(createNewPerson());
//	}

	public void printOutSchoolRegister() {
		for(int i = 0 ; i < schoolRegister.size() ; i++) {
			System.out.println(schoolRegister.get(i).toString());
		}
	}
	
	private Person getTypeOfPerson(Person person, String pick) {


		if(pick.equals("T"))
			return person = new Teacher();
		if(pick.equals("S"))
			return person = new Student();
		else return person;
	}
}
