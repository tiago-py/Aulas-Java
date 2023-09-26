public class Veiculo {
    protected String marca;
    protected String placa;
    protected int passageiros;
    protected double custoDiario;

    public Veiculo(String placa, int passageiros, double custoDiario, String marca){
        this.placa = placa;
        this.passageiros = passageiros;
        this.custoDiario = custoDiario;
        this.marca = marca;
    }

}
