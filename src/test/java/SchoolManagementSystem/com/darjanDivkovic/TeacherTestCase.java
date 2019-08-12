package SchoolManagementSystem.com.darjanDivkovic;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeacherTestCase {

	@Test
	public void testTeacherShouldUpdateMoneyRecievedWhenRecievedSalary() {
		
		Teacher teacher = new Teacher();
		
		teacher.recieveSalary(100);
		double newMoneyRecievedInSalaries = teacher.getMoneyRecievedInSalaries();
		
		assertEquals(100, newMoneyRecievedInSalaries, 0);
		
	}

}
