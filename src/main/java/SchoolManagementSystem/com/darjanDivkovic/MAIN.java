package SchoolManagementSystem.com.darjanDivkovic;

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

	public static void main(String[] args) {
		
	
		School school = new School();
		System.out.println("Welcome to ShcoolManagementSystem");
		System.out.println("----------------------------------");
		
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
					pick = 0;
					System.out.println("		1. -> Add new Teacher!");
					System.out.println("		2. -> Add new Student!");
					System.out.println("		3. <- BACK");
					pick = Util.unos.nextInt();
					
					if(pick == 1) {
						school.addNewTeacherToTeachers();
					}
					if(pick == 2) {
						school.addNewStudentToStudents();
					}
				}
				while(pick != 3);
				
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
		System.out.println("Bye !");
	}

}
