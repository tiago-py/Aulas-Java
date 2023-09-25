public class Caminhao extends Veiculo{

    private double cargaMaxima;

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Caminhao(String placa, int passageiros, double custoDiario, String marca, double cargaMaxima) {
        super(placa, passageiros, custoDiario, marca);
        this.cargaMaxima = cargaMaxima;

    }
}
