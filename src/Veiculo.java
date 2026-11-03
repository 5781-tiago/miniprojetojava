public class Veiculo extends EstadoVeiculo {

    private int numeroIdentificacao;
    private String marca;
    private String modelo;
    private String cor;
    private double cilindrada;
    private boolean mudancasAutomaticas;
    private int ano;

    public Veiculo(int numeroIdentificacao, String marca, String modelo, String cor,
                   double cilindrada, boolean mudancasAutomaticas, int ano) {

        this.numeroIdentificacao = numeroIdentificacao;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.cilindrada = cilindrada;
        this.mudancasAutomaticas = mudancasAutomaticas;
        this.ano = ano;

    }

    public void modoAcelerar() {

        System.out.println("O veículo está a acelerar.");

    }

    public int getNumeroIdentificacao() { return numeroIdentificacao; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getCor() { return cor; }
    public double getCilindrada() { return cilindrada; }
    public boolean isMudancasAutomaticas() { return mudancasAutomaticas; }
    public int getAno() { return ano; }
}