package SchoolManagementSystem.com.darjanDivkovic;

import java.sql.SQLException;
import java.util.ArrayList;

public class databaseMain {

	public static void main(String[] args) throws SQLException {
		
		Teacher teacher = null;
		teacher = DatabaseOperations.fillTeachersDataFromDB(1);
		
		System.out.println(teacher.toString());
		
		// Print out IDS of teachers
		ArrayList<Integer> ids = DatabaseOperations.teacherslistOfIDsToRequest();
		
		for(int x : ids) {
			System.out.println("id = "+x);
		}
		
	}

}
