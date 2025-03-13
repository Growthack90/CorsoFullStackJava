import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyAPP3 {
 
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
 
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
 
 
			ResultSet rs = stmt.executeQuery("SELECT * FROM studenti");
 
 
 
			rs.last();			
			System.out.println("Numero di righe: " + rs.getRow());
			rs.first(); // mi posiziono sulla prima riga
			do {				
				System.out.println(rs.getString("nome") + " " + rs.getString("cognome"));
				rs.next();
			}while(!rs.isLast());
 
 
			conn.close();
		}
		catch (SQLException e)
		{
			System.out.println("Non riesco a connettermi al database!");
			System.out.println("Error: " + e.getMessage());
		}
	}
 
}