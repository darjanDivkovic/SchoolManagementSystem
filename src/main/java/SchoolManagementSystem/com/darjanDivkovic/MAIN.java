package SchoolManagementSystem.com.darjanDivkovic;


import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.text.Utilities;


public class MAIN {
	
	/*
	 * ZA URADITI:
	 * - NAPRAVITI UI - OMOGUCITI : PRAVLJENJE LJUDI, PLACANJE STUDENATA, ISPLACIVANJE PLACA UCITELJIMA
	 * - POVEZATI SA BAZOM
	 * - NAPRAVITI LOG 
	 * - NAPRAVITI GUI
	 * - NAPRAVITI SERVLET OD OVOGA
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) throws SQLException {
		
	
		School school = new School("fill");
		
		System.out.println("----------------------------------");
		System.out.println("Welcome to ShcoolManagementSystem");
		System.out.println("----------------------------------");
		MyLogger.logMessage("SMS started!");
		int pick = 0;
		do {
			System.out.println("CHOOSE:");
			System.out.println("1] SCHOOL REGISTER OPTIONS");
			System.out.println("2] MANAGE PAYMENTS");
			System.out.println("3] CHECK BALANCE AND DEBT INFO");
			System.out.println("4] MISC");
			System.out.println("5] EXIT");
			
			pick = Util.unos.nextInt();

			if(pick == 1) {
				MyLogger.logMessage("PICKED : 1. SCHOOL REGISTER OPTIONS ");
			do {
			System.out.println("SCHOOL REGISTER OPTIONS:");
			System.out.println("	1. -> Add new Person to SchoolRegister ");
			System.out.println("	2. -> View SchoolRegister");	
			System.out.println("	3. <- BACK ");
			pick = Util.unos.nextInt();
			
			// Add new person to school register
			switch(pick) {
			case 1:
				do {
					MyLogger.logMessage("PICKED : 1. Add new Person to SchoolRegister ");
					pick = 0;
					System.out.println("		1. -> Add new Teacher!");
					System.out.println("		2. -> Add new Student!");
					System.out.println("		3. <- BACK");
					pick = Util.unos.nextInt();
					
					if(pick == 1) {
						MyLogger.logMessage("PICKED : 1. Add new Teacher!");
						school.addNewTeacherToTeachers();
					}
					if(pick == 2) {
						MyLogger.logMessage("PICKED : 2. Add new Student!");
						school.addNewStudentToStudents();
					}
				}
				while(pick != 3);
				MyLogger.logMessage("Picked : 3. Back");
				break;
			case 2:
				school.printOutSchoolRegister();
				break;
			}
			}
			while(pick != 3);
			pick = 0;
			}
			if(pick == 2) {
		    do {
		   	System.out.println("MANAGE PAYMENTS:");
			System.out.println("	1. -> Hand out salarie to specific Teacher");
			System.out.println("	2. -> Give salaries to all Teachers");
			System.out.println("	3. -> Recieve payment from Student");				
			System.out.println("	4. <- BACK");
			pick = Util.unos.nextInt();
			
			if(pick == 1) {
				System.out.println("HANDING OUT A SALARY!");
				System.out.println("Enter teachers id:");
				System.out.println("Enter the dedsired payment:");
				Util.unos.nextLine();
				int id = Util.unos.nextInt();
				double payment = Util.unos.nextDouble();
				school.paySalaryToTeacher(id, payment);
			}
			if(pick == 2) {
				System.out.println("HANDING OUT SALARIES TO ALL TEACHERS");
				school.paySalaryToAllTeachers();
			}
			if(pick == 3) {
				System.out.println("RECIEVE PAYMENT FROM STUDENT");
				System.out.println("Enter the id of the student:");
				int id = Util.unos.nextInt();
				school.recievePaymentFromStudent(id);
			}
		    }
		    while(pick != 4);
		    pick = 0;
		    }
			if(pick == 3) {
		    do {
			System.out.println("CHECH BALANCE AND DEBT INFO: ");
			System.out.println("	1. -> Check Schools balance");
			System.out.println("	2. -> Check Money Earned");
			System.out.println("	3. -> Check what the school owns");	
			System.out.println("	4. <- BACK ");
				
			pick = Util.unos.nextInt();
			if(pick == 1) {
				System.out.println("CURRENT SCHOOL BALANCE IS: ");
				System.out.println(" -> "+school.getSchoolBalance());
			}
			if(pick == 2) {
				System.out.println("SCHOOL HAS EARNED: ");
				System.out.println(" -> "+school.getMoneyEarned());
			}
			if(pick == 3) {
				System.out.println("SCHOOL HAS TO PAY $ IN SALARIES");
				double schoolHasToPay = school.getAllTeachersSalaries();
				schoolHasToPay -= school.getSalariesPaid();
				System.out.println(school.getSalariesPaid());
				System.out.print("	-> "+schoolHasToPay+" $ in salaries to :  ");
				System.out.println(school.getNumberOfTechers()+" teachers.");
				System.out.println();
				
			}
		    }
		    while(pick != 4);
		    pick = 0;
		    }
			if(pick == 4) {
			do {
			System.out.println("MISC: ");	
			System.out.println("	1. -> Get date & time");
			System.out.println("	2. -> Get A nice message!");	
			System.out.println("	3. <- BACK");
			pick = Util.unos.nextInt();
			
			if(pick == 1) Misc.printOutCurrentDateAndTime();
			if(pick == 2) Misc.printOutANiceMessage();
			}
			while(pick != 3);
			pick = 0;
			}
		
		}
		while(pick != 5);
		DatabaseOperations.updateDatabaseForSchoolFinancesData(school.getSchoolBalance(), school.getMoneyEarned(), school.getSalariesPaid());
		System.out.println("Bye !");
		
	}

}
