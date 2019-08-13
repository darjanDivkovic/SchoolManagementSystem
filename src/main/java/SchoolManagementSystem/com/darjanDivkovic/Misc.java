package SchoolManagementSystem.com.darjanDivkovic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Misc {
	
	// Get Date Method
	private static String getCurentDateAndTime() {
		LocalDateTime dateUnformated = LocalDateTime.now();
		DateTimeFormatter dateFormated = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		
		String formattedDate = dateUnformated.format(dateFormated);
		return formattedDate;
	}
	
	public static void printOutCurrentDate() {
		String date = getCurentDateAndTime();
		System.out.println("TODAY'S DATE");
		System.out.println(date);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	// Get Time Method
	// Get A nice Message Method
	// This class is just for fun
	
	

}
