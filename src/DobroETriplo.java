
//Atividade 2
import java.util.Scanner;

public class DobroETriplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        int dobro = valor * 2;
        int triplo = valor * 3;

        System.out.println("O dobro de " + valor + " é " + dobro);
        System.out.println("O triplo de " + valor + " é " + triplo);
    }
}
