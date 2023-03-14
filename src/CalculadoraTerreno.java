import java.util.Scanner;

public class CalculadoraTerreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura do terreno em metros: ");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double perimetro = 2 * (comprimento + largura);

        System.out.println("A área do terreno é: " + area + " m²");
        System.out.println("O perímetro do terreno é: " + perimetro + " m");
    }
}
