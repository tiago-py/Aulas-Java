import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a pagar: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite o valor percentual de desconto (em %): ");
        double percentual = scanner.nextDouble();

        double desconto = valor * (percentual / 100);

        System.out.println("O valor do desconto é: " + desconto);
    }
}
