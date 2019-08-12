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

	@Test
	public void testSchoolPayTeacherShouldDecreaseSchoolBalanceWhenPayingTeacher() {
		
		// Pre-set balance of 100 $
		School school = new School(100.0);
		
		school.payTeacher(100);
		double newSchoolBalance = school.getSchoolBalance();
		
		assertEquals(0, newSchoolBalance, 0);
		
		
	}

	@Test
	public void testSchoolPayTeacherShouldIncreasePaidInSalariesWhenPayingTeacher() {
		
		// Pre-set balance of 100 $
		School school = new School(100.0);
		
		school.payTeacher(100);
		double newPaidInSalaries = school.getSalariesPaid();
		
		assertEquals(100, newPaidInSalaries, 0);
		
		
	}

	@Test
	public void testSchoolPayTeacherShouldReturnExpectedPaymentAmountWhenBalanceIsBigEnough() {
		
			
			// Pre-set balance of 100 $
			School school = new School(100.0);
			
			
			double teacherGot = school.payTeacher(100); 
			
			assertEquals(100, teacherGot, 0);
			
			
		
	}

	@Test
	public void testSchoolPayTeacherShouldReturnZeroWhenTeacherWasntPaidSuccesfully() {
		
		School school = new School(50.0);
		
		
		double teacherGot = school.payTeacher(100); 
		
		assertEquals(0, teacherGot, 0);
		
	}
			
				










}
