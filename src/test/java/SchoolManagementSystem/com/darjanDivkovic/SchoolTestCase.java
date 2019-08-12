package SchoolManagementSystem.com.darjanDivkovic;

import static org.junit.Assert.*;

import org.junit.Test;

public class SchoolTestCase {

	@Test
	public void testSchoolRecievePaymentShouldUpdateMoneyEarnedWhenRecievedAPayment() {
		School school = new School();
		
		school.recievePayment(100);
		double moneyEarned = school.getMoneyEarned();
		
		assertEquals(100, moneyEarned, 10);
	}
	
	@Test
	public void testSchoolRecievePaymentShouldIncreaseSchoolBalanceWhenRecievePayment() {
		
		School school = new School();
		
		school.recievePayment(100);
		double newSchoolBalance = school.getSchoolBalance();
		
		assertEquals(100, newSchoolBalance, 10);
	}
}
