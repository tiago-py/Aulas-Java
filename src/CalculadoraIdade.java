import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a quantidade de meses além dos anos: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a quantidade de dias além dos anos e meses: ");
        int dias = scanner.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("Sua idade em dias é: " + totalDias + " dias");
    }
}
