package SchoolManagementSystem.com.darjanDivkovic;

/*
 * Extends Person class, should also contain student's details.
 * - fees paid
 * - fees left to pay
 * 
 */
public class Student extends Person{

	private double feesPaid;
	private double feesLeftToPay;
	
	// Constructors
	Student(){
		super();
	}
	
	Student(int id, String name, String surname, double feesPaid, double feesLeftToPay){
		super(id,name,surname);
		this.feesPaid = feesPaid;
		this.feesLeftToPay = feesLeftToPay;
	}
	
	
}
