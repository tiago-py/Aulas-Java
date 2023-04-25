import java.util.Scanner;

public class antSus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num1 = scanner.nextInt();

        int calc = num1+1;
        int calc1 = num1-1;

        System.out.println("Sucessor do numero digitado: "+calc);
        System.out.println("Antecessor do numero digitado: "+calc1);

    }
}
