package SchoolManagementSystem.com.darjanDivkovic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTestCase {

	@Test
	public void testStudentPayFeeShouldIncreaseFeesPayedWhenGivenPayment() {

		// Arrange
		Student student = new Student();
		
		// Act
		student.payFee(10000);
		double feesPaid = student.getFeesPaid();
		
		// Assert
		assertEquals(10000, feesPaid, 10);
	}

	@Test
	public void testStudentPayFeeShouldDecreaseFeesLeftToPayWhenPaymentAdded() {
		
		Student student = new Student();
		
		student.payFee(10000);
		double feesLeftToPay = student.getFeesLeftToPay();
		
		assertEquals(20000, feesLeftToPay, 10);
	}
}
