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
		this.salary = createNewSalary();
	}
	
	

	Teacher(String test){
		super(test);
		this.salary = 0;
		this.moneyRecievedInSalaries = 0;
	}
	
	Teacher(int id, String name, String surname, double salary)
	{
		super(id,name,surname);
		this.salary = salary;
	}

	private double createNewSalary() {
		System.out.println("Enter new salary");
		double salary = Util.unos.nextDouble();
		return salary;
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
	
	@Override
	public String getName() {
		return super.getName();
	}
	@Override
	public String getSurname() {
		return super.getSurname();
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
