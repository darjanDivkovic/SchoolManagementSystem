package SchoolManagementSystem.com.darjanDivkovic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

	// Update database when new Teacher added
	public static void updateDatabaseWhenNewTeacherAdded(Teacher teacher) throws SQLException {
		
		// insert into teachers values (?,?,?,?,?);
		PreparedStatement preparedStatement = getConnection().prepareStatement("insert into teachers values (?,?,?,?,?)");
		preparedStatement.setInt(1, teacher.getId());
		preparedStatement.setString(2, teacher.getName());
		preparedStatement.setString(3, teacher.getSurname());
		preparedStatement.setDouble(4, teacher.getSalary());
		preparedStatement.setDouble(5, teacher.getMoneyRecievedInSalaries());
		
		preparedStatement.executeUpdate();
	}

	// Update database when new Teacher added
	public static void updateDatabaseWhenNewStudentrAdded(Student student) throws SQLException { 

			
			// insert into teachers values (?,?,?,?,?);
			PreparedStatement preparedStatement = getConnection().prepareStatement("insert into students values (?,?,?,?,?)");
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getSurname());
			preparedStatement.setDouble(4, student.getFeesPaid());
			preparedStatement.setDouble(5, student.getFeesLeftToPay());
			
			preparedStatement.executeUpdate();
		}
	
	// Gets school finances details by parsed request
	// String with value of tableRow gets retured when request parsed
	public static double getSchoolsFinancesInfo(String request) throws SQLException {
		
		// Create statement
		Statement statement = getConnection().createStatement();
		
		// Set up query
		String query = "SELECT * FROM school";
		
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next()) {
			
		if(request.equals("schoolBalance")) {
			return rs.getDouble("schoolBalance");
		}
		
		if(request.equals("schoolMoneyEarned")) {
			return rs.getDouble("schoolMoneyEarned");
		}
		
		if(request.equals("schoolPaidInSalaries")) {
			return rs.getDouble("schoolPaidInSalaries");
		}
		
		};
		
		return 0;
				
		
		
	}

	// UPDATE DATABASE :
	// -> When handing out salarie to specific teacher
	public static void updateDatabaseWhenSalarieGivenToTeacher(int id, double recievedInSalariesNew) throws SQLException {
		
		PreparedStatement preparedStatement = getConnection().prepareStatement(
				"UPDATE teachers SET moneyRecievedInSalaries = ? WHERE id = ?");
		
		preparedStatement.setDouble(1, recievedInSalariesNew);
		preparedStatement.setInt(2, id);
		
		preparedStatement.executeUpdate();
		
	}
	
	// -> Update database for school finances data
	public static void updateDatabaseForSchoolFinancesData(double newBalance, double newMoneyEarned, double newPaidInSalaries) throws SQLException {
		
		String query = ("UPDATE teachers SET schoolBalance = ?, schoolMoneyEarned = ?, school");
		
		PreparedStatement preparedStatement = getConnection().prepareStatement(query);
		preparedStatement.setDouble(1, newBalance);
		preparedStatement.setDouble(2, newMoneyEarned);
		preparedStatement.setDouble(2, newPaidInSalaries);
		

		preparedStatement.executeUpdate();
		
	}
}
