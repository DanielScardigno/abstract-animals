public abstract class Animale {
    
    private String nome;

    public Animale(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void dormi() {
        System.out.println("Zzz");
    }

    public abstract void verso();

    public abstract void mangia();

    @Override
    public String toString() {
        return "Animale con nome: " + this.nome;
    }
}