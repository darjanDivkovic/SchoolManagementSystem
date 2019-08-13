package SchoolManagementSystem.com.darjanDivkovic;

/*
 * 
 * Purpose of this class is to extend Person class,
 * taking : - id, name, surname
 * 
 * Will have it's own atributes like :
 * 	- salary
 * 
 * 
 * 
 * 
 */
public class Teacher extends Person {
	
	// DF
	private double salary;
	private double moneyRecievedInSalaries = 0;
	
	
	// Constructors
	Teacher()
	{
		super();
	}
	
	Teacher(int id, String name, String surname, double salary)
	{
		super(id,name,surname);
		this.salary = salary;
	}

	
	// Get & Set
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getMoneyRecievedInSalaries() {
		return moneyRecievedInSalaries;
	}

	// RecieveSalary
	public void recieveSalary(double salary) {

		this.moneyRecievedInSalaries += salary;
		
	}

	@Override
	public String toString() {
		
		String object = "TEACHER| "+super.toString() + "| SALARY = "+salary+"$|  MONEY RECIEVED IN SALARIES = "+moneyRecievedInSalaries+"$|";
		return object;
		
	}

	
	
	
}
