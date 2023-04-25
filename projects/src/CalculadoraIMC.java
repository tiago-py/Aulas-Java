//Atividade 1
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu índice de massa corporal (IMC) é: " + imc);
    }
}