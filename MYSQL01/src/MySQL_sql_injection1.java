//Questo progetto si concentra su una singola operazione: 
// - la ricerca di studenti nel database scuola in base al nome.
//Utilizza un PreparedStatement per prevenire SQL injection.
//Stampa i risultati della ricerca direttamente nella console.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classiMie.IO;

public class MySQL_sql_injection1 {

	public static void main(String[] args) {
		
		String nome = IO.getString("Dammi il nome dello studenti che vuoi cercare");
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scuola", "root", "");
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM studenti WHERE nome = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.setString(1, nome);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.last())
			{
				IO.println("Trovati " + rs.getRow() + " studenti");
				rs.beforeFirst();
			} else {
				IO.println("Nessuno studente trovato");
				return;
			}
			
			while (rs.next()) {
				IO.println(rs.getString("nome") + " " + rs.getString("cognome") + " " + rs.getString("data_nascita")
						+ " " + rs.getString("classe") + " " + rs.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
