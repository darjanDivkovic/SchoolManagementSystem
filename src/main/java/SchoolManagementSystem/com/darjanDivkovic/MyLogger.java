package SchoolManagementSystem.com.darjanDivkovic;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	
	private static Logger logger = Logger.getLogger("MyLogger");
	private static FileHandler handler;
	
	private static void prepareLogger() {

		
		try 
		{	
		handler = new FileHandler("log.txt", true);
		}
		catch ( IOException e ) {
			System.err.print(e+" !");
		}
		
		logger.addHandler(handler);
		handler.setFormatter(new SimpleFormatter());
		logger.setUseParentHandlers(false);
		
		
	}
	
	public static void logMessage(String message) {
		prepareLogger();
		logger.info(message);
		handler.close();
	}
}
