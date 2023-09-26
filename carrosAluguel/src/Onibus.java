public class Onibus extends Veiculo{
    private int andares;

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    public Onibus(String placa, int passageiros, double custoDiario, String marca, int andares) {
        super(placa, passageiros, custoDiario, marca);
        this.andares = andares;

    }

}
