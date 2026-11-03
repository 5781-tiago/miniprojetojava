public class Mota extends Veiculo {

    public Mota(int numeroIdentificacao, String marca, String modelo, String cor,
                double cilindrada, boolean mudancasAutomaticas, int ano) {
        super(numeroIdentificacao, marca, modelo, cor, cilindrada, mudancasAutomaticas, ano);
    }

    @Override
    public void modoAcelerar() {

        System.out.println("A mota acelera rapidamente com o punho.");

    }
}