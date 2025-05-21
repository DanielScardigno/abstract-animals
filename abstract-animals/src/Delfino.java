public class Delfino extends Animale implements Nuotante {

    public Delfino(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("ek! ek! ek!");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando una medusa.");
    }

    @Override
    public void faiNuotare() {
        System.out.println("Sto nuotando!!!");
    }
}