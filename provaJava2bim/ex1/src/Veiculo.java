public class Veiculo {
    protected String marca;
    protected int custoDiario;
    protected String Placa;

    public Veiculo(String marca, int custoDiario, String Placa){
        this.marca = marca;
        this.custoDiario =  custoDiario;
        this.Placa = Placa;
    }
    public void ExibeInfo(){
        System.out.println("Custo Diário: "+ custoDiario);
        System.out.println("Placa: "+ Placa);
        System.out.println("Marca: "+ marca);
    }
    public void TipoVeiculo(){
        System.out.println("Veículo: "+ marca);
    }
}
