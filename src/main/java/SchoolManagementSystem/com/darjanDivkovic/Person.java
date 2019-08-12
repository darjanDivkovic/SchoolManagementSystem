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
	Person(){}
	
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
	
	
	
	

}
