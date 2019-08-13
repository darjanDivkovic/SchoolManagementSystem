package SchoolManagementSystem.com.darjanDivkovic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeacherTestCase {
	
	
	@Test

	public void testTeacherShouldUpdateMoneyRecievedWhenRecievedSalary() {
		
		Teacher teacher = new Teacher("test");
		
		teacher.recieveSalary(100);
		double newMoneyRecievedInSalaries = teacher.getMoneyRecievedInSalaries();
		
		assertEquals(100, newMoneyRecievedInSalaries, 0);
		
	}

	@Test
	public void testRecieveSalaryShouldIncreaseMoneyRInSalariesWhenGivenSalary() {
		Teacher teacher = new Teacher("test");
		teacher.recieveSalary(100);
		
		double recieved = teacher.getMoneyRecievedInSalaries();
		
		assertEquals(100, recieved, 0);
	}
	
	@Test
	public void testSetSalaryShouldSetSalaryWhenGivenValue() {
		Teacher teacher = new Teacher("test");
		
		teacher.setSalary(100);
		double newSalary = teacher.getSalary();
		
		assertEquals(100, newSalary, 0);
	}

}
