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
			System.out.println("	1. -> Add new Person to SchoolRegister ");
			System.out.println("	2. -> View SchoolRegister");	
			System.out.println("	3. <- BACK ");
			pick = Util.unos.nextInt();
			}
			while(pick != 3);
			}
		
		}
		while(pick != 5);
		System.out.println("Bye !");
	}

}
