import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua primeira nota");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite sua segunda nota");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite sua terceira nota");
        double valor3 = scanner.nextDouble();
        System.out.println("Digite sua quarta nota");
        double valor4 = scanner.nextDouble();

        double media = (valor1+valor2+valor3+valor4)/4;

        System.out.println("Sua média foi: "+ media);
    }
}
