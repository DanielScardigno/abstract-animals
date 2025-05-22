public class Aquila extends Animale implements Volante {

    public Aquila(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("SCREEEE!");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando un pesce.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}