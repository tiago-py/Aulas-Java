import java.util.Scanner;

public class ValorPorLitro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorPago, quantidadeLitros, valorPorLitro;

        System.out.print("Digite o valor pago pelo abastecimento: ");
        valorPago = sc.nextDouble();

        System.out.print("Digite a quantidade de litros abastecidos: ");
        quantidadeLitros = sc.nextDouble();

        valorPorLitro = valorPago / quantidadeLitros;

        System.out.printf("Valor por litro: %.3f%n", valorPorLitro);

        sc.close();
    }
}
