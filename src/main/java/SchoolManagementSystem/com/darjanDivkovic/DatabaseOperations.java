package SchoolManagementSystem.com.darjanDivkovic;

import java.sql.*;
import java.util.ArrayList;


public class DatabaseOperations {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String CONN_STRING = "jdbc:mysql://localhost/school?useSSL=false&serverTimezone=UTC";

	// Get connection 
	public static Connection getConnection() {
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connection established!");
		}
		catch ( SQLException e ) {
			System.err.println(e+" !");
		}
		
		return connection;
	}
	
	public static Teacher fillTeachersDataFromDB(int id) throws SQLException {

		Teacher teacher = new Teacher("blank");
		
		// Creating a QUERY
		String query = "SELECT * FROM teachers WHERE FIND_IN_SET("+id+", id)";
	
		// Creating a statement
		Statement st = getConnection().createStatement();
		
		// Execure query into result set with statement
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			int newId = rs.getInt("id");
			String name = rs.getString("name");
			String surname = rs.getString("surname");
			double salary = rs.getDouble("salary");
			double moneyRecievedInSalaries = rs.getDouble("moneyRecievedInSalaries");
			
			teacher.setId(newId);
			teacher.setName(name);
			teacher.setSurname(surname);
			teacher.setSalary(salary);
			teacher.setMoneyRecievedInSalaries(moneyRecievedInSalaries);
		}
		return teacher;
	}

	public static ArrayList fillAllIds(ArrayList<Integer> ids) throws SQLException {
		
		// Creating a QUERY
		String query = "SELECT id FROM teachers";
			
		// Creating a statement
		Statement st = getConnection().createStatement();
				
		// Execure query into result set with statement
		ResultSet rs = st.executeQuery(query);
		
		while(!rs.next()) {
			ids.add(rs.getInt("id"));
		}
		
		return ids;
	}
}
