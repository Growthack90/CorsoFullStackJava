public class Auto {
    public String nome;
    public int eta;

    public Auto(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Età: " + eta;
    }

}
