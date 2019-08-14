package SchoolManagementSystem.com.darjanDivkovic;

/*
 * Purpose of this class is to be extended by :

 * 	- Student
 *  - &
 *  - Teacher Class
 *  
 * Should contain info like:
 * 	- id
 * 	- name
 *  - ...
 */
public class Person {
	
	// Data fields
	private int id;
	private String name;
	private String surname;

	// Constructor
	Person(){
		this.name = createNewName();
		this.surname = createNewSurname();
		this.id = createNewID();
	
	}
	Person(String test){
		this.id = 0;
		this.name = "";
		this.surname = "";
	}
	
	
	private int createNewID() {
		System.out.println("Give new ID :");
		int id = Util.unos.nextInt();
		return id;
	}

	private String createNewSurname() {
		System.out.println("Enter surname:");
		String surname = Util.unos.nextLine();
		return surname;
	}

	private String createNewName() {
		System.out.println("Creating a new person");
		System.out.println("Enter name:");
		Util.unos.nextLine();
		String name = Util.unos.nextLine();
		return name;
	}

	Person(int id, String name, String surname)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {

		String object = "ID = "+id+"| NAME = "+name+"| SURNAME = "+surname;
		return object;  
	}
	
	


	
}
