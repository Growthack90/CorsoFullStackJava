import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import classiMie.IO;

public class MyAPP6 {
 
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
			IO.println("Connessione al database riuscita");
			IO.println("Ecco la lista degli studenti");
			IO.println("----------------------------");
 
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
 
			IO.println("Inserisco un nuovo studente");
			String nome = IO.getString("dammi il nome: ");
			String cognome = IO.getString("dammi il cognome: ");
			String data_nascita = IO.getString("dammi la data di nascita: ");
			String classe = IO.getString("dammi la classe: ");
			String email = IO.getString("dammi l'email: ");
 
 
			// la data di nascita sarà data in formato italiano
			// a noi serve in formato americano
			// supponiamo che la data in input sia gg/mm/aaaa
			// la trasformiamo in aaaa-mm-gg
 
			String[] parti = data_nascita.split("/");
			String anno = parti[2];
			String mese = parti[1];
			String giorno = parti[0];
			data_nascita = anno + "-" + mese + "-" + giorno;
			// "INSERT INTO studenti (nome, cognome, data_nascita, classe, email ) VALUES ('Colicchio', 'Giuseppe', '2005-10-26', '5C', 'colicchio@gmail.com')
			String query = "INSERT INTO studenti (nome, cognome, data_nascita, classe, email ) VALUES ('" + nome + "', '" + cognome + "', '" + data_nascita + "', '" + classe + "', '" + email + "')";
			stmt.executeUpdate(query);
 
			ResultSet rs = stmt.executeQuery("SELECT * FROM studenti");
 
			rs.last();			
			IO.println("Numero di righe: " + rs.getRow());
			rs.beforeFirst();
			while(rs.next())	{
				IO.println(rs.getString("nome") + " " + rs.getString("cognome"));			
			}
 
 
			conn.close();
		}
		catch (SQLException e)
		{
			IO.println("Non riesco a connettermi al database!");
			IO.println("Error: " + e.getMessage());
		}
	}
}