public class Carro extends Veiculo{

    private String modelo;
    private String motor;

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

    public Carro(String marca, int custoDiario, String Placa, String modelo, String motor) {
        super(marca, custoDiario, Placa);
        this.modelo = modelo;
        this.motor = motor;
    }
    @Override
    public void ExibeInfo(){
        System.out.println("Motor: "+ motor);
        System.out.println("Custo Diário: "+ custoDiario);
        System.out.println("Placa: "+ Placa);
        System.out.println("Marca: "+ marca);
    }

    @Override
    public void TipoVeiculo(){
        System.out.println("Carro modelo: "+ modelo);
    }

}
