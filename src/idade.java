import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int valor1 = scanner.nextInt();
        System.out.println("Digite a idade da sua mãe");
        int valor2 = scanner.nextInt();

        int conta = valor2-valor1;

        System.out.println("A diferença de idade entre você e sua mãe é: "+conta);


    }
}
