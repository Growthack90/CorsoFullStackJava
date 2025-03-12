# SOLUZIONE

## PARTE 1
```
CREATE DATABASE IF NOT EXISTS ScuolaDB;
USE ScuolaDB;

CREATE TABLE Corsi (
    id_corso INT AUTO_INCREMENT PRIMARY KEY,
    nome_corso VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Studenti (
    id_studente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cognome VARCHAR(50) NOT NULL,
    eta INT CHECK (eta > 5),
    id_corso INT,
    FOREIGN KEY (id_corso) REFERENCES Corsi(id_corso) ON DELETE CASCADE
);
```

Verificare tabella studenti:
```
USE scuoladb;
SELECT * FROM studenti;
```

## PARTE 2

```
USE scuoladb;
INSERT INTO Corsi (nome_corso) VALUES
('Matematica Avanzata'),
('Storia dell\'Arte'),
('Programmazione Java');
```

```
USE scuoladb;
INSERT INTO Studenti (nome, cognome, eta, id_corso) VALUES
('Mario', 'Rossi', 16, 1),
('Laura', 'Verdi', 17, 2),
('Giovanni', 'Bianchi', 15, 3),
('Anna', 'Neri', 16, 1),
('Paolo', 'Gialli', 17, 2),
('Francesca', 'Blu', 15, 3);
```

```
USE scuoladb;
UPDATE Studenti SET eta = 17 WHERE nome = 'Mario' AND cognome = 'Rossi';
```

```
USE scuoladb;
DELETE FROM Studenti WHERE nome = 'Francesca' AND cognome = 'Blu';
```

## PARTE 3

```
USE scuoladb;
SELECT * FROM Studenti
ORDER BY eta DESC;
```

```
USE scuoladb;
SELECT S.nome, S.cognome
FROM Studenti S
JOIN Corsi C ON S.id_corso = C.id_corso
WHERE C.nome_corso = 'Informatica';
```
(mi restituirà nullo perchè non è presente corso di informatica perciò inserire corso inserito nel db)

```
USE scuoladb;
SELECT *
FROM Studenti
WHERE eta BETWEEN 18 AND 22;
```

```
USE scuoladb;
SELECT *
FROM Studenti
WHERE cognome LIKE 'B%';
```


## PARTE 4

```
USE scuoladb;
SELECT Studenti.nome, Studenti.cognome, Corsi.nome_corso
FROM Studenti
JOIN Corsi ON Studenti.id_corso = Corsi.id_corso;
```

```
USE scuoladb;
SELECT Studenti.nome, Studenti.cognome, Corsi.nome_corso
FROM Studenti
JOIN Corsi ON Studenti.id_corso = Corsi.id_corso
ORDER BY Corsi.nome_corso ASC;
```

```
USE scuoladb;
SELECT Studenti.nome, Studenti.cognome
FROM Studenti
WHERE Studenti.id_corso IS NULL;
```

## PARTE 5

1.  **DELETE vs. TRUNCATE:**
    * `DELETE` rimuove righe specifiche con `WHERE`, è più lento e può essere annullato.
    * `TRUNCATE` svuota interamente la tabella, è più veloce e non può essere annullato.
2.  **INNER JOIN, LEFT JOIN, RIGHT JOIN:**
    * `INNER JOIN` restituisce solo le righe con corrispondenza in entrambe le tabelle.
    * `LEFT JOIN` restituisce tutte le righe dalla tabella sinistra e le corrispondenze dalla destra.
    * `RIGHT JOIN` restituisce tutte le righe dalla tabella destra e le corrispondenze dalla sinistra.
3.  **AUTO\_INCREMENT in chiavi primarie:**
    * Genera automaticamente valori unici per le chiavi primarie, semplificando l'inserimento di nuovi record.
4.  **Backtick (\`) nei nomi di tabelle/colonne:**
    * Necessari quando i nomi contengono spazi o parole riservate SQL.
5.  **NULL in colonna NOT NULL:**
    * Si verifica un errore e l'inserimento del record fallisce.
