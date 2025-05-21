public class Testing {
    public static void main(String[] args) {
        
        Cane cane = new Cane("Lucky");
        System.out.println(cane.getNome());
        cane.faiNuotare();

        System.out.println("-------------------------");

        Passerotto passerotto = new Passerotto("pip");
        System.out.println(passerotto.getNome());
        passerotto.faiVolare();

        System.out.println("-------------------------");

        Aquila aquila = new Aquila("Scout");
        System.out.println(aquila.getNome());
        aquila.faiVolare();

        System.out.println("-------------------------");

        Delfino delfino = new Delfino("Flipper");
        System.out.println(delfino.getNome());
        delfino.faiNuotare();

        System.out.println("-------------------------");
    }

}