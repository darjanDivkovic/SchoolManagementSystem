package SchoolManagementSystem.com.darjanDivkovic;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

		} catch (SQLException e) {
			System.err.println(e + " !");
		}

		return connection;
	}

	// Should return all ids from teachers
	public static ArrayList<Integer> teacherslistOfIDsToRequest() throws SQLException {
		ArrayList<Integer> teachersIds = new ArrayList();

		// Set a query
		String query = "SELECT * FROM teachers";

		// Create statement
		Statement statement = getConnection().createStatement();

		// Make result set
		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next()) {
			teachersIds.add(resultSet.getInt("id"));
		}

		return teachersIds;
	}

	// Should return all ids from students
	public static ArrayList<Integer> studentslistOfIDsToRequest() throws SQLException {
		ArrayList<Integer> studentIds = new ArrayList();

		// Set a query
		String query = "SELECT * FROM teachers";

		// Create statement
		Statement statement = getConnection().createStatement();

		// Make result set
		ResultSet resultSet = statement.executeQuery(query);

		while (resultSet.next()) {
			studentIds.add(resultSet.getInt("id"));
		}

		return studentIds;
	}

	// Returns a teacher object filled from Database!
	public static Teacher fillTeachersDataFromDB(int id) throws SQLException {

		Teacher teacher = new Teacher("blank");

		// Creating a QUERY
		String query = "SELECT * FROM teachers WHERE FIND_IN_SET(" + id + ", id)";

		// Creating a statement
		Statement st = getConnection().createStatement();

		// Execure query into result set with statement
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
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

	// Returns a student object filled from Database!
	public static Student fillStudentsDataFromDB(int id) throws SQLException {


		Student student = new Student("blanko");

		// Creating a QUERY
		String query = "SELECT * FROM students WHERE FIND_IN_SET(" + id + ", id)";

		// Creating a statement
		Statement st = getConnection().createStatement();

		// Execure query into result set with statement
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			int newId = rs.getInt("id");
			String name = rs.getString("name");
			String surname = rs.getString("surname");
			double feesPaid = rs.getDouble("feesPaid");
			double feesLeftToPay = rs.getDouble("feesLeftToPay");
			
			
			student.setId(newId);
			student.setName(name);
			student.setSurname(surname);
			student.setFeesPaid(feesPaid);
			student.setFeesLeftToPay(feesLeftToPay);
		}
		return student;
	}



}
