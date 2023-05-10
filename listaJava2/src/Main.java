import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double m1,m2,media;

        System.out.println("Digite o estoque maximo de um produto: ");
        m1 = scn.nextDouble();
        System.out.println("Digite o estoque minimo de um produto: ");
        m2 = scn.nextDouble();
        media = (m1+m2)/2;

        System.out.printf("Media: %.2f\n",media);
    }
}