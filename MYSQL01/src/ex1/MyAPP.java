package ex1;

import classiMie.DataFormatter;
import classiMie.IO;
import classiMie.MySQL;

public class MyAPP {

    public static void main(String[] args) {

        MySQL db = new MySQL("localhost", "3306", "scuola", "root", "");
        int scelta;
        do {
            IO.println("1. Aggiungi studente");
            IO.println("2. Visualizza studenti");
            IO.println("3. Esci");
            do {
                scelta = IO.getInt("Cosa vuoi fare?");
                if (scelta < 1 || scelta > 3) {
                    IO.println("Devi scegliere tra 1 e 3");
                }
            } while (scelta < 1 || scelta > 3);
            switch (scelta) {
                case 1:
                    IO.println("Inserisci i dati dello studente");
                    String nome = IO.getString("Nome");
                    String cognome = IO.getString("Cognome");
                    String data_nascita = IO.getString("Data di nascita (gg/mm/aaaa)");
                    do {
                        data_nascita = DataFormatter.convertDateToISO(data_nascita);
                        if (data_nascita.isEmpty()) {
                            IO.print("DATA NON VALIDA! Inserisci nuovamente la data: ");
                            data_nascita = IO.getString();
                        }
                    } while (data_nascita.isEmpty());
                    String classe = IO.getString("Classe");
                    String email = IO.getString("Email");
                    if (db.InsertProtectedQuery("INSERT INTO studenti (nome, cognome, data_nascita, classe, email) VALUES (?, ?, ?, ?, ?)", new String[]{nome, cognome, data_nascita, classe, email})) {
                        IO.println("Studente inserito correttamente");
                        IO.println("ID generato: " + db.getLastInsertId());
                    } else {
                        IO.println("Errore nell'inserimento dello studente!");
                        if(db.getErrorString() != null) {
                            IO.println("Errore SQL: " + db.getErrorString());
                        }
                    }
                    break;
                case 2:
                    if (db.SelectQuery("SELECT * FROM studenti")) {
                        while (db.next()) {
                            IO.println(db.getString("id") + "-" + db.getString("nome") + " " + db.getString("cognome") + " "
                                    + DataFormatter.convertISOToDate(db.getString("data_nascita")) + " " + db.getString("classe") + " "
                                    + db.getString("email"));
                        }
                    } else {
                        IO.println("Errore nella visualizzazione degli studenti!");
                        if(db.getErrorString() != null) {
                            IO.println("Errore SQL: " + db.getErrorString());
                        }
                    }
                    break;
            }
        } while (scelta != 3);
        IO.println("Arrivederci");
        db.Close();
    }
}