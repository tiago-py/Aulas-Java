import java.util.Scanner;
public class somaMult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, calc, calc2, calc3, calc4, calc5, calc6, calc7, calc8, calc9, calc10, calc11, calc12;

        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();
        System.out.println("Digite o valor de C: ");
        c = scan.nextInt();
        System.out.println("Digite o valor de D: ");
        d = scan.nextInt();
        calc = a + b;
        calc2 = a + c;
        calc3 = a + d;
        calc4 = b + c;
        calc5 = b + d;
        calc6 = c + d;
        calc7 = a * b;
        calc8 = a * c;
        calc9 = a * d;
        calc10 = b * c;
        calc11 = b * d;
        calc12 = c * d;
        System.out.println(calc);
        System.out.println(calc2);
        System.out.println(calc3);
        System.out.println(calc4);
        System.out.println(calc5);
        System.out.println(calc6);
        System.out.println(calc7);
        System.out.println(calc8);
        System.out.println(calc9);
        System.out.println(calc10);
        System.out.println(calc11);
        System.out.println(calc12);
    }
}
