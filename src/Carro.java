public class Carro extends Veiculo {

    private int numeroPortas;
    private boolean descapotavel;

    public Carro(int numeroIdentificacao, String marca, String modelo, String cor,
                 double cilindrada, boolean mudancasAutomaticas, int ano,
                 int numeroPortas, boolean descapotavel) {
        super(numeroIdentificacao, marca, modelo, cor, cilindrada, mudancasAutomaticas, ano);
        this.numeroPortas = numeroPortas;
        this.descapotavel = descapotavel;
    }

    @Override
    public void modoAcelerar() {

        System.out.println("O carro acelera suavemente com o pedal.");

    }

    public int getNumeroPortas() { return numeroPortas; }
    public boolean isDescapotavel() { return descapotavel; }
}