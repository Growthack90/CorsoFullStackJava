// APP MENU CRUD STUDENTI
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import classiMie.IO;
 
public class MyAPP8_menu_crud {

    public static void main(String[] args) {
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
                        modificaStudente(conn);
                        break;
                    case 4:
                        rimuoviStudente(conn);
                        break;
                    case 5:
                        IO.println("Uscita dal programma.");
                        break;
                    default:
                        IO.println("Scelta non valida.");
                }
            } while (scelta != 5);

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
        IO.println("3. Modifica Studente");
        IO.println("4. Rimuovi Studente");
        IO.println("5. Esci");
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

        String query = "INSERT INTO studenti (nome, cognome, data_nascita, classe, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, cognome);
            pstmt.setString(3, data_nascita);
            pstmt.setString(4, classe);
            pstmt.setString(5, email);
            pstmt.executeUpdate();
            IO.println("Studente inserito con successo.");
        }
    }

    public static void listaStudenti(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM studenti")) {

            IO.println("Lista degli studenti:");
            IO.println("--------------------");

            while (rs.next()) {
                IO.println(rs.getInt("id") + " - " + rs.getString("nome") + " " + rs.getString("cognome"));
            }
        }
    }

    public static void modificaStudente(Connection conn) throws SQLException {
        listaStudenti(conn);
        int idStudente = IO.getInt("Inserisci l'ID dello studente da modificare: ");

        try (PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM studenti WHERE id = ?")) {
            pstmt.setInt(1, idStudente);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String nome = IO.getString("Nuovo nome (" + rs.getString("nome") + "): ");
                    String cognome = IO.getString("Nuovo cognome (" + rs.getString("cognome") + "): ");
                    String data_nascita = IO.getString("Nuova data di nascita (gg/mm/aaaa) (" + rs.getString("data_nascita") + "): ");
                    String classe = IO.getString("Nuova classe (" + rs.getString("classe") + "): ");
                    String email = IO.getString("Nuova email (" + rs.getString("email") + "): ");

                    String[] parti = data_nascita.split("/");
                    String anno = parti[2];
                    String mese = parti[1];
                    String giorno = parti[0];
                    data_nascita = anno + "-" + mese + "-" + giorno;

                    String query = "UPDATE studenti SET nome = ?, cognome = ?, data_nascita = ?, classe = ?, email = ? WHERE id = ?";
                    try (PreparedStatement updateStmt = conn.prepareStatement(query)) {
                        updateStmt.setString(1, nome);
                        updateStmt.setString(2, cognome);
                        updateStmt.setString(3, data_nascita);
                        updateStmt.setString(4, classe);
                        updateStmt.setString(5, email);
                        updateStmt.setInt(6, idStudente);
                        updateStmt.executeUpdate();
                        IO.println("Studente modificato con successo.");
                    }
                } else {
                    IO.println("Studente con ID " + idStudente + " non trovato.");
                }
            }
        }
    }

    public static void rimuoviStudente(Connection conn) throws SQLException {
        listaStudenti(conn);
        int idStudente = IO.getInt("Inserisci l'ID dello studente da rimuovere: ");

        String query = "DELETE FROM studenti WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, idStudente);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                IO.println("Studente rimosso con successo.");
            } else {
                IO.println("Studente con ID " + idStudente + " non trovato.");
            }
        }
    }
}
