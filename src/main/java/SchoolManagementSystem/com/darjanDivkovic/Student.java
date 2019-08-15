package SchoolManagementSystem.com.darjanDivkovic;

/*
 * Extends Person class, should also contain student's details.
 * - fees paid
 * - fees left to pay
 * 
 */
public class Student extends Person{

	// Every student starts with 30000 debt
	
	private double feesPaid = 0;
	private double feesLeftToPay = 30000;
	
	// Constructors
	Student(){
		super();
	}
	
	Student(String test){
		super(test);
		this.feesPaid = 0;
		this.feesLeftToPay = 0;
	}
	
	Student(int id, String name, String surname){
		super(id,name,surname);
	}
	
	Student(int id, String name, String surname, double feesPaid, double feesLeftToPay){

		super(id,name,surname);
		this.feesPaid = feesPaid;
		this.feesLeftToPay = feesLeftToPay;
	}
	
	
	// Get & Set
	
	public double getFeesPaid() {
		return feesPaid;
	}

	public double getFeesLeftToPay() {
		return feesLeftToPay;
	}

	// Update fees paid - student made a payment 
	public double payFee(double feePaid) {

		feesPaid += feePaid;
		feesLeftToPay -= feePaid;
		
		return feePaid;
	}

	@Override
	public String toString() {
		String object = "STUDENT|"+ super.toString() + "| FEES LEFT TO PAY = "+feesLeftToPay+"$| FEES PAID = "+feesPaid+"$|";
		return object;
	}

	public void setFeesPaid(double feesPaid2) {
		this.feesPaid = feesPaid2;
		
	}

	public void setFeesLeftToPay(double feesLeftToPay) {
		this.feesLeftToPay = feesLeftToPay;
	}
	
	
}
