package SchoolManagementSystem.com.darjanDivkovic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTestCase {

	@Test
	public void testPayFeeShouldIncreaseFeesPaidWhenGivenValue() {
		Student student = new Student("test");
		
		student.payFee(100);
		double newFeesPaid = student.getFeesPaid();
		
		assertEquals(100, newFeesPaid, 0);
	}
	
 
	
}
