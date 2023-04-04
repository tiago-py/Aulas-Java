import java.util.Scanner;
public class celcius{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,F;
        System.out.println("Digite uma temperatura em graus celsius: ");
        a = scan.nextDouble();

        F = (a*9/5)+32;

        System.out.printf("Temperatura em Fahrenheit %.2f %n", F);

    }
}