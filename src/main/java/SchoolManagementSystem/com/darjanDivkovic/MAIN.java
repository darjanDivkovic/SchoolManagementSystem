package SchoolManagementSystem.com.darjanDivkovic;

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
		
		school.addNewPersonToSchoolRegister();
		
		school.printOutSchoolRegister();
		
	}

}
