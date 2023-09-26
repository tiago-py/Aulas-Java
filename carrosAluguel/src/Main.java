public class Main {
    public static void main(String[] args) {
        Veiculo[] frota = new Veiculo[3];

        frota[0] = new Carro("ABC445", 4, 130.0, "Honda", 4, "Civic 98", "V8 3.0");
        frota[1] = new Caminhao("BBC778", 2, 150, "Scania", 2.6);
        frota[2] = new Onibus("CCB223",  25 , 200, "Mercedez", 2);

        for (Veiculo veiculo : frota) {
            System.out.println("Placa: " + veiculo.placa);
            System.out.println("Passageiros: " + veiculo.passageiros);
            System.out.println("Custo Diário: " + veiculo.custoDiario);

            if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                System.out.println("Tipo: Carro");
                System.out.println("Marca: "+ carro.marca);
                System.out.println("Modelo: "+ carro.getModelo());
                System.out.println("Motor: "+ carro.getMotor());
                System.out.println("Portas: " + carro.getPortas());
            } else if (veiculo instanceof Onibus) {
                Onibus onibus = (Onibus) veiculo;
                System.out.println("Tipo: Ônibus");
                System.out.println("Marca: "+ onibus.marca);
                System.out.println("Andares: " + onibus.getAndares());
            } else if (veiculo instanceof Caminhao) {
                Caminhao caminhao = (Caminhao) veiculo;
                System.out.println("Tipo: Caminhão");
                System.out.println("Marca: "+ caminhao.marca);
                System.out.println("Carga Máxima: " + caminhao.getCargaMaxima() + " toneladas");
            }

            System.out.println(); // Adicionar uma linha em branco entre os veículos
        }
    }
}