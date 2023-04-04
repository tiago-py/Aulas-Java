import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,b,c,valorP,desconto;
        System.out.println("Digite o valor de um produto: ");
        a = scan.nextDouble();
        System.out.println("Digite o valor do desconto: ");
        b = scan.nextDouble();

        valorP = b/100;
        desconto = a*valorP;
        c = a-desconto;

        System.out.println("Valor do produto com "+b+"% de desconto: "+c);

    }
}
