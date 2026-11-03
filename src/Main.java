public class Main {
    public static void main(String[] args) {

        Carro[] carros = {
                new Carro(1, "Audi", "A3", "Vermelho", 1.6, true, 2020, 5, false),
                new Carro(2, "Mercedes", "A1", "Cinza", 2.0, true, 2010, 5, false),
                new Carro(3, "Opel", "Corsa", "Vermelho", 1.6, false, 2019, 5, false),
                new Carro(4, "Ford", "Focus", "Cinza", 2.0, true, 2011, 5, false)
        };

        Mota mota = new Mota(5, "Yamaha", "MT-07", "Preto", 0.7, false, 2019);

        for (Carro carro : carros) {

            System.out.println("--- Carro ---");
            carro.mover();
            carro.modoAcelerar();
            carro.parado();
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Descapotável: " + carro.isDescapotavel());
            System.out.println();

        }

        System.out.println("--- Mota ---");

        mota.mover();
        mota.modoAcelerar();
        mota.parado();

        System.out.println("Cilindrada: " + mota.getCilindrada());
    }
}