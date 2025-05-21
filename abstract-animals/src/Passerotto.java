public class Passerotto extends Animale implements Volante {

    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("Chip! Chip!");
    }

    @Override
    public void mangia() {
        System.out.println("Sto mangiando un vermetto.");
    }

    @Override
    public void faiVolare() {
        System.out.println("Sto volando!!!");
    }
}