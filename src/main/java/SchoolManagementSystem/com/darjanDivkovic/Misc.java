package SchoolManagementSystem.com.darjanDivkovic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Misc {
	
	// Get Date Method
	private static String getCurentDateAndTime() {
		LocalDateTime dateUnformated = LocalDateTime.now();
		DateTimeFormatter dateFormated = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		
		String formattedDate = dateUnformated.format(dateFormated);
		return formattedDate;
	}
	// Print out currentDateAndTime
	public static void printOutCurrentDateAndTime() {

		String date = getCurentDateAndTime();
		System.out.println("TODAY'S DATE");
		System.out.println(date);
		System.out.println();
	}
		

	// Get A nice Message Method
	private static String generateANiceMessage() {
		int randomNumber = (int)(Math.random()*5);
		
		ArrayList<String> quotes = new ArrayList();
		
		// Hardcoded, could be put into some log or database to fill in at start but oh well
		quotes.add("Your limitation—it’s only your imagination.");
		quotes.add("Push yourself, because no one else is going to do it for you.");
		quotes.add("Sometimes later becomes never. Do it now.");
		quotes.add("Great things never come from comfort zones.");
		quotes.add("Dream it. Wish it. Do it.");
		
		return quotes.get(randomNumber);
	}
	
	public static void printOutANiceMessage() {
		String message = generateANiceMessage();
		System.out.println("||* "+message+" *||");
	}
	// This class is just for fun
	
	
	
	

}
