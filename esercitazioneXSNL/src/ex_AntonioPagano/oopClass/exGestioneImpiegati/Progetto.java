package ex_AntonioPagano.oopClass.exGestioneImpiegati;

import java.util.ArrayList;
import java.util.List;

class Progetto {
    private String nome;
    private int budget;
    private String citta;
    private List<Impiegato> partecipanti;

    public Progetto(String nome) {
        this.nome = nome;
        this.partecipanti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public List<Impiegato> getPartecipanti() {
        return partecipanti;
    }

    public void setPartecipanti(List<Impiegato> partecipanti) {
        this.partecipanti = partecipanti;
    }
}
