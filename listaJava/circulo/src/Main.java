import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        circulo circulo = new circulo();
        System.out.println("Digite o raio do seu circulo: ");
        circulo.Circulo(scan.nextDouble());

        circulo.calcularComprimento();
        System.out.printf("Comprimento: %.2f\n", circulo.getComprimento());

        circulo.calcularArea();
        System.out.printf("Area: %.2f\n", circulo.getArea());

    }
}