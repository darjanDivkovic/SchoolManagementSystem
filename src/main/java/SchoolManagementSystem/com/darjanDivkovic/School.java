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
	public Person createNewPerson() {


		Person person = null;
		System.out.println("Adding a new member!");
		
		System.out.println("Enter name:");
		String name = Util.unos.nextLine();
		
		System.out.println("Enter surname:");
		String surname = Util.unos.nextLine();
		
		System.out.println("Give new ID :");
		int id = Util.unos.nextInt();
		
		System.out.println("Is this person a Teacher or a Student?");
		System.out.println("[T] - Teacher");
		System.out.println("[S] - Student");
		
		Util.unos.hasNextLine();
		String pick = Util.unos.next();
		System.out.println(pick);
		person = getTypeOfPerson(person, pick);
		
		person.setId(id);
		person.setName(name);
		person.setSurname(surname);
		
		return person;
	}
	
	// Takes the Person from createNewPerson method and uses polymorphism to declare the type
	// depending on the user input - S - student - T - techer
	
	private Person getTypeOfPerson(Person person, String pick) {

		if(pick.equals("T"))
			return person = new Teacher();
		if(pick.equals("S"))
			return person = new Student();
		else return person;
	}
	
	public void addNewPersonToSchoolRegister() {

		schoolRegister.add(createNewPerson());
	}

	public void printOutSchoolRegister() {
		for(int i = 0 ; i < schoolRegister.size() ; i++) {
			System.out.println(schoolRegister.get(i).toString());
		}
	}
}
