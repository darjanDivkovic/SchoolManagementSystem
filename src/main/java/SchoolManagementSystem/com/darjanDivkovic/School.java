package SchoolManagementSystem.com.darjanDivkovic;

import java.util.ArrayList;

public class School {
	
	// Contains teachers and students
	ArrayList<Teacher> teachers = new ArrayList();
	ArrayList<Student> students = new ArrayList();
	
	double moneyEarned = 0;
	double schoolBalance = 10000;
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
		
	public void addNewTeacherToTeachers() {
		
		System.out.println("Adding a new staff member!");
		Teacher teacher = new Teacher();
	
		teachers.add(teacher);
		System.out.println("New member added ! :)");
	}

	// Print out School Register
	
	public void printOutSchoolRegister() {
		System.out.println("TEACHERS :");
		for(int i = 0 ; i < teachers.size() ; i++) {
			System.out.println(teachers.get(i).toString());
		}
		System.out.println("---------------------------------");
		System.out.println("STUDENTS");
		for(int i = 0 ; i < students.size() ; i++) {
			System.out.println(students.get(i).toString());
		}
		System.out.println("---------------------------------");
	}
	
	private Person getTypeOfPerson(Person person, String pick) {

		if(pick.equals("T"))
			return person = new Teacher();
		if(pick.equals("S"))
			return person = new Student();
		else return person;
	}
	
	// Find teacher  by id
	private Teacher findTeacherInRegister(int id) {
				
		for(int i = 0 ; i < teachers.size() ; i++) {
			if(teachers.get(i).getId() == id) {
				System.out.println("Teacher found!");
				return teachers.get(i);
				
			}
			
		}
		System.out.println("Person not found!");
		return null;
	}

	public void addNewStudentToStudents() {
		System.out.println("Adding a new Student member!");
		Student student = new Student();
	
		students.add(student);
		System.out.println("New Student added ! :)");
		
	}
	
	// Pay salary to teacher
	public double paySalaryToTeacher(int id, double payment) {


		if(!isSchoolBalanceBigEnough(payment)) {
			System.out.println("Balance not big enough");
			return 0;
		}
		
		// bring him here
		Teacher teacher = null;
		// Find teacher by id
		teacher = findTeacherInRegister(id);
		
		// Make him recieve his salary
		teacher.recieveSalary(payment);
		this.schoolBalance -= payment;
		return payment;
		
	}

	// Pay salary to all teachers
	public double paySalaryToAllTeachers() {
		// Find how much to pay
		double salariesToPay = getAllTeachersSalaries();
		// Find out is it possible to pay the amount
		// Pay if can
		if(isSchoolBalanceBigEnough(salariesToPay)) {
			for(int i = 0 ; i < teachers.size() ; i++) {
				// Find next teachers salary
				double toPayNext = teachers.get(i).getSalary();
				// Pay him his salary
				teachers.get(i).recieveSalary(toPayNext);
				System.out.println(teachers.get(i).getName()+" "+teachers.get(i).getSurname()+" got paid = "+toPayNext+"$");
			}
		}
		return salariesToPay;
	}
	
	
	public double getAllTeachersSalaries() {
		double salaries = 0;
		for(int i = 0 ; i < teachers.size(); i++) {
			salaries += teachers.get(i).getSalary();
		}
		return salaries;
	}
	
	
	// Check if School Balance is big enough ( for payments )
 	public boolean isSchoolBalanceBigEnough(double payment) {
		if(payment < this.schoolBalance) 
			return true;
		if(payment >= this.schoolBalance)
			return false;
		return false;
	}
}