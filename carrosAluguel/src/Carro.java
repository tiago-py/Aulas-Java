public class Carro extends Veiculo{
    private int portas;
    private String modelo;
    private String motor;

    public Carro(String placa, int passageiros, double custoDiario, String marca, int portas, String modelo, String motor) {
        super(placa, passageiros, custoDiario, marca);
        this.modelo = modelo;
        this.motor = motor;
        this.portas = portas;

    }



    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
