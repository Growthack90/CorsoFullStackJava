// MyAPP6 CON AGGIUNTA MENU (crea studente, lista studenti, exit)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import classiMie.IO;

public class MyAPP7_menu {

    public static void main(String[] args) {
        // Connessione al database MySQL
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "scuola";
        String userName = "root";
        String password = "";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url + dbName, userName, password);
            IO.println("Connessione al database riuscita");

            int scelta;
            do {
                mostraMenu();
                scelta = IO.getInt("Inserisci la tua scelta: ");

                switch (scelta) {
                    case 1:
                        creaStudente(conn);
                        break;
                    case 2:
                        listaStudenti(conn);
                        break;
                    case 3:
                        IO.println("Uscita dal programma.");
                        break;
                    default:
                        IO.println("Scelta non valida.");
                }
            } while (scelta != 3);

        } catch (SQLException e) {
            IO.println("Non riesco a connettermi al database!");
            IO.println("Errore: " + e.getMessage());
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                IO.println("Errore durante la chiusura della connessione: " + e.getMessage());
            }
        }
    }

    public static void mostraMenu() {
        IO.println("Menu:");
        IO.println("1. Crea Studente");
        IO.println("2. Lista Studenti");
        IO.println("3. Esci");
    }

    public static void creaStudente(Connection conn) throws SQLException {
        IO.println("Inserisci un nuovo studente");
        String nome = IO.getString("Dammi il nome: ");
        String cognome = IO.getString("Dammi il cognome: ");
        String data_nascita = IO.getString("Dammi la data di nascita (gg/mm/aaaa): ");
        String classe = IO.getString("Dammi la classe: ");
        String email = IO.getString("Dammi l'email: ");

        String[] parti = data_nascita.split("/");
        String anno = parti[2];
        String mese = parti[1];
        String giorno = parti[0];
        data_nascita = anno + "-" + mese + "-" + giorno;

        String query = "INSERT INTO studenti (nome, cognome, data_nascita, classe, email) VALUES ('" + nome + "', '" + cognome + "', '" + data_nascita + "', '" + classe + "', '" + email + "')";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
            IO.println("Studente inserito con successo.");
        }
    }

    public static void listaStudenti(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM studenti")) {

            IO.println("Lista degli studenti:");
            IO.println("--------------------");

            while (rs.next()) {
                IO.println(rs.getString("nome") + " " + rs.getString("cognome"));
            }
        }
    }
}