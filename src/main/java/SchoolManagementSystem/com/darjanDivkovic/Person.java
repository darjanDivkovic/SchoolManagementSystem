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
	
	
	
	

}
