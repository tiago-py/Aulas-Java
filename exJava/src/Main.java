import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.println("Digite um número");
        a = scan.nextInt();
        for(int x = 0; x<=10; x++){
            int calc = a*x;
            System.out.println(a + " X " + x + " = " + calc );
        }
    }
}
