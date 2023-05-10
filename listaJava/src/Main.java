import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num;
        double calc,calc2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = scan.nextInt();
        calc = Math.sqrt(num);
        calc2 = Math.cbrt(num);

        System.out.printf("Raiz quadrada do numero digitado %.2f %n",calc);
        System.out.printf("Raiz cubica do numero digitado %.2f %n",calc2);
    }
}