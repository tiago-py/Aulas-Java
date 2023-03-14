import java.util.Scanner;

public class CalculadoraDesconto2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor a pagar: ");
        double valor = scanner.nextDouble();
        double calc1 = valor*1.05;
        double calc2 = valor*1.10;
        double calc3 = valor*1.15;
        System.out.println("05% de reajuste: "+ calc1+ " 10% de reajuste: "+calc2+ " 15% de reajuste "+calc3);
    }
}