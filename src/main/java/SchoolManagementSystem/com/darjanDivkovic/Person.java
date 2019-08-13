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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
//	public Person createNewPerson() {
//
//
//
//		Person person = null;
//		System.out.println("Adding a new member!");
//		
//		
//		
//		
//		
//		
//		System.out.println("Is this person a Teacher or a Student?");
//		System.out.println("[T] - Teacher");
//		System.out.println("[S] - Student");
//		
//		Util.unos.hasNextLine();
//		String pick = Util.unos.next();
//		System.out.println(pick);
//		person = getTypeOfPerson(person, pick);
//		
//		person.setId(id);
//		person.setName(name);
//		person.setSurname(surname);
//		
//		return person;
//	}

	
}
