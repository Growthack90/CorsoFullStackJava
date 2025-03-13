import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyAPP2 {
 
	public static void main(String[] args) {
		// connessione al database mysql
		String url = "jdbc:mysql://localhost:3306/";
		// per ora nessun db
		String dbName = "scuola";
		String userName = "root";
		String password = "";
		try
		{
			Connection conn = DriverManager.getConnection(url + dbName, userName, password);
			System.out.println("Connessione al database riuscita");
			System.out.println("Ecco la lista degli studenti");
			System.out.println("----------------------------");
 
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM studenti");
			while (rs.next()) {
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				System.out.println(nome + " " + cognome);
			}
 
			conn.close();
		}
		catch (SQLException e)
		{
			System.out.println("Non riesco a connettermi al database!");
			System.out.println("Error: " + e.getMessage());
		}
	}
}
