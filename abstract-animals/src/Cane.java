public class Cane extends Animale implements Nuotante {

    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Bau! Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando un osso.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}