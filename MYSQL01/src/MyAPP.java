import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyAPP {
	public static void main(String[] args) {
// connessione al database mysql
		String url = "jdbc:mysql://localhost:3306/";
// per ora nessun db
		String dbName = "";
		String userName = "root";
		String password = "";
		try {
			Connection conn = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Connessione al database riuscita");
		} catch (SQLException e) {
			System.out.println("Non riesco a connettermi al database!\nSei sicuro di aver avviato il server?");
			System.out.println("Error: " + e.getMessage());
		}
	}
}