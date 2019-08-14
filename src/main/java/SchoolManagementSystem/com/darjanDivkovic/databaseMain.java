package SchoolManagementSystem.com.darjanDivkovic;

import java.sql.SQLException;

public class databaseMain {

	public static void main(String[] args) throws SQLException {
		
		Teacher teacher = null;
		teacher = DatabaseOperations.fillTeachersDataFromDB(1);
		
		System.out.println(teacher.toString());
	}

}
