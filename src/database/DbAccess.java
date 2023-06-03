package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DatabaseConnectionException extends Exception {

}

public class DbAccess {

	private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
	private final String DBMS = "jdbc:mysql";
	private final String SERVER = "localhost";
	private final String DATABASE = "mapdb";
	private final int PORT = 3306;
	private final String USER_ID = "root";
	private final String PASSWORD = "password";

	private Connection conn;

	public DbAccess() throws DatabaseConnectionException {
		try {
			Class.forName(DRIVER_CLASS_NAME).newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("[!] Driver not found: " + e.getMessage());
			throw new DatabaseConnectionException();
		} catch (InstantiationException e) {
			System.out.println("[!] Error during the instantiation : " + e.getMessage());
			throw new DatabaseConnectionException();
		} catch (IllegalAccessException e) {
			System.out.println("[!] Cannot access the driver : " + e.getMessage());
			throw new DatabaseConnectionException();
		}
		String connectionString = DBMS + "://" + SERVER + ":" + PORT + "/" + DATABASE + "?user=" + USER_ID
				+ "&password=" + PASSWORD + "&serverTimezone=UTC";

		System.out.println("Connection's String: " + connectionString);

		try {
			conn = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			System.out.println("[!] SQLException: " + e.getMessage());
			System.out.println("[!] SQLState: " + e.getSQLState());
			System.out.println("[!] VendorError: " + e.getErrorCode());
			throw new DatabaseConnectionException();
		}
	}

	public void closeConnection() throws SQLException {
		conn.close();
	}

	public void exampleQuery() {
		try {
			Statement s = conn.createStatement();

			// codice SQL: può generare l’eccezione SQLException

			ResultSet r = s.executeQuery("SELECT * " + "FROM playtennis ");

			while (r.next()) {
				// Capitalization doesn't matter:
				System.out.println(r.getString("outlook") + ", " + r.getString("play") );
				// In alternativa: accesso posizionale
				/*
				 * System.out.println( r.getString(2) + ", " + r.getString(1) + ": " +
				 * r.getString(3) ); NB: nell’accesso posizionale, gli indici delle colonne del
				 * ResultSet partono da 1
				 */
			}
			r.close();
			s.close(); // Also closes ResultSet

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

	public static void main(String args[]) {
		try {
			DbAccess db = new DbAccess();
			db.exampleQuery();
			db.closeConnection();

		} catch (DatabaseConnectionException | SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return this.conn;
	}

}
