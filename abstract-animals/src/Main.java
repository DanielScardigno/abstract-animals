public class Main {
    public static void main(String[] args) {
        
        Cane cane = new Cane("Lucky");

        System.out.println(cane.getNome());
        cane.dormi();
        cane.verso();
        cane.mangia();

        System.out.println("-------------------------");

        Passerotto passerotto = new Passerotto("pip");

        System.out.println(passerotto.getNome());
        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        System.out.println("-------------------------");

        Aquila aquila = new Aquila("Scout");

        System.out.println(aquila.getNome());
        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        System.out.println("-------------------------");

        Delfino delfino = new Delfino("Flipper");

        System.out.println(delfino.getNome());
        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        System.out.println("-------------------------");

        Testing.faiNuotare(cane);
        Testing.faiVolare(passerotto);
        Testing.faiVolare(aquila);
        Testing.faiNuotare(delfino);
    }
}