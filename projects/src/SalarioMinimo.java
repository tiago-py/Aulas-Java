import java.util.Scanner;

public class SalarioMinimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioUsuario, salarioMinimo, quantidadeSalarios;

        System.out.print("Digite o valor do salário do usuário: ");
        salarioUsuario = sc.nextDouble();

        salarioMinimo = 1302.0; // Valor do salário mínimo atual
        quantidadeSalarios = salarioUsuario / salarioMinimo;

        System.out.printf("O usuário ganha %.2f salários mínimos.%n", quantidadeSalarios);
    }
}
