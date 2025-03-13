// Il programma legge i dati dalla tabella studenti di un database MySQL e li presenta 
// in una tabella formattata sulla console.
// Utilizza il driver JDBC per connettersi al database e la classe ResultSet per iterare i record nel risultato della query.

// Importare classi del driver JDBC incluso nel classpath
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyAPP5 {
	public static String getFormattedString(String params[]) {
		return String.format("%-15s%-30s%-20s%-10s%-10s", params[0], params[1], params[2], params[3], params[4]);
	}

	public static void main(String[] args) {
		String username = "root";
		String password = "";
		String dbName = "scuoladb";
		String url = "jdbc:mysql://localhost:3306/" + dbName;

// Dichiaro e inizializzo a null connection fuori dal try per chiuderlo nel finally, altrimenti faccio tutto nel try 
// Connection connection = null;
// 
// try {
// connection = DriverManager.getConnection(url, username, password);
// System.out.println("Connessione al database avvenuta correttamente.");
// } catch (SQLException e) {
// System.out.println("Errore durante la connessione con il database: " + e.getMessage());
// } finally {
// if(connection != null) {
// try {
// connection.close();
// System.out.println("Chiusura della connessione avvenuta correttamente.");
// } catch (SQLException e) {
// System.out.println("Errore durante la chiusura della connessione: " + e.getMessage());
// }
// }
// }

// Intestazione formattata 
		String[] fields = { "id_studente", "nome", "cognome", "eta", "id_corso" };
		String intestazione = getFormattedString(fields);

// Chiusura automatica con try-with-resources 
		try (Connection dbConnection = DriverManager.getConnection(url, username, password)) {
			System.out.println("Connessione al database avvenuta correttamente.");

// Oggetto statement per effettuare operazioni/query sul database 
			Statement statement = dbConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);

// Oggetto resultSet per ottenere il risultato della query
			String query = "SELECT * FROM studenti";
			ResultSet result = statement.executeQuery(query);

// Mi posiziono all'ultima riga per ottenere il numero di record
			result.last();
			System.out.println(String.format("Risultati query: %s [%d risultati]", query, result.getRow()));
// Ritorno PRIMA del primo record
			result.beforeFirst();

// Stampo l'intestazione
			System.out.println(intestazione);
			for (int i = 0; i < 85; i++)
				System.out.print("-");
			System.out.println();

// Itero ogni singolo record 
			while (result.next()) {
				String id_studente = result.getString(fields[0]);
				String nome = result.getString(fields[1]);
				String cognome = result.getString(fields[2]);
				String eta = result.getString(fields[3]);
				String id_corso = result.getString(fields[4]);

				String[] values = { id_studente, nome, cognome, eta, id_corso };
				String record = getFormattedString(values);
				System.out.println(record);
			}

		} catch (SQLException e) {
			System.out.println("Errore durante la connessione con il database: " + e.getMessage());
		}
	}
}