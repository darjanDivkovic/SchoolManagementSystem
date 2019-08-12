package SchoolManagementSystem.com.darjanDivkovic;

import java.util.ArrayList;

public class School {
	
	// Contains teachers and students
	ArrayList<Teacher> teachers = new ArrayList();
	ArrayList<Student> students = new ArrayList();
	double moneyEarned = 0;
	double schoolBalance = 0;
	double salariesPaid = 0;
	
	// Constructors
	School(){}
	
	// Recieve a payment
	public void recievePayment(double payment) {
		this.moneyEarned += payment;
		this.schoolBalance += payment;
	}

	// Get & Set
	
	public double getMoneyEarned() {
		return moneyEarned;
	}

	public double getSchoolBalance() {
		return schoolBalance;
	}

	public double getSalariesPaid() {
		return salariesPaid;
	}
	
	
	
	
}
