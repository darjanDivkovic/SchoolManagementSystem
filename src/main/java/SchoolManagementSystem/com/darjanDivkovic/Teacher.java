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

}
