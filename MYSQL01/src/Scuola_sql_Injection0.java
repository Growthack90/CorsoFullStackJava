//Il codice rappresenta una classe Scuola_sql_Injection che gestisce le operazioni di 
// base per interagire con una tabella "studenti" in un database MySQL. 
// Le principali funzionalità sono l'aggiunta di nuovi studenti e il recupero di una 
// lista di tutti gli studenti.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import classiMie.IO;

public class Scuola_sql_Injection0 {
    private Connection conn;

    public Scuola_sql_Injection0() {
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "scuola";
        String userName = "root";
        String password = "";
        try {
            this.conn = DriverManager.getConnection(url + dbName, userName, password);
        } catch (SQLException e) {
            IO.println("Non riesco a connettermi al database!");
            e.printStackTrace(); // Aggiungiamo la stampa dello stack trace per debug
        }
    }

    public boolean addStudente(String nome, String cognome, String data_nascita, String classe, String email) {
        PreparedStatement stmt = null;
        try {
            String query = "INSERT INTO studenti (nome, cognome, data_nascita, classe, email) VALUES (?, ?, ?, ?, ?)";
            stmt = this.conn.prepareStatement(query);

            String[] parti = data_nascita.split("/");
            String anno = parti[2];
            String mese = parti[1];
            String giorno = parti[0];
            data_nascita = anno + "-" + mese + "-" + giorno;

            stmt.setString(1, nome);
            stmt.setString(2, cognome);
            stmt.setString(3, data_nascita);
            stmt.setString(4, classe);
            stmt.setString(5, email);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            IO.print(e.getMessage() + "\n" + e.getSQLState() + "\n" + e.getErrorCode());
            e.printStackTrace(); // Aggiungiamo la stampa dello stack trace per debug
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Studente> getList() {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String query = "SELECT * FROM studenti";
            rs = stmt.executeQuery(query);
            ArrayList<Studente> lista = new ArrayList<>();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                String data_nascita = rs.getString("data_nascita");
                String classe = rs.getString("classe");
                String email = rs.getString("email");
                Studente s = new Studente(nome, cognome, data_nascita, classe, email);
                lista.add(s);
            }
            return lista;
        } catch (SQLException e) {
            e.printStackTrace(); // Aggiungiamo la stampa dello stack trace per debug
            return null;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Classe Studente
    public static class Studente {
        private String nome;
        private String cognome;
        private String data_nascita;
        private String classe;
        private String email;

        public Studente(String nome, String cognome, String data_nascita, String classe, String email) {
            this.nome = nome;
            this.cognome = cognome;
            this.data_nascita = data_nascita;
            this.classe = classe;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getCognome() {
            return cognome;
        }

        public String getData_nascita() {
            return data_nascita;
        }

        public String getClasse() {
            return classe;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Studente{" +
                    "nome='" + nome + '\'' +
                    ", cognome='" + cognome + '\'' +
                    ", data_nascita='" + data_nascita + '\'' +
                    ", classe='" + classe + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }
}
