public class Cane {
    private String nome;
    private int eta;

    public Cane(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void abbaia() {
        System.out.println("Woof! Woof!");
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }
}