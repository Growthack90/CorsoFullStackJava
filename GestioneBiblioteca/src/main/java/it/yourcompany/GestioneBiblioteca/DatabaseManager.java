package it.yourcompany.GestioneBiblioteca;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connettiDB() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void salvaLibro(Libro libro) {
        try (Connection conn = connettiDB()) {
            String query = "INSERT INTO libri (titolo, autore, anno_pubblicazione, disponibile) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, libro.titolo);
            stmt.setString(2, libro.autore);
            stmt.setInt(3, libro.annoPubblicazione);
            stmt.setBoolean(4, libro.disponibile);
            stmt.executeUpdate();
            System.out.println("Libro salvato nel database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}