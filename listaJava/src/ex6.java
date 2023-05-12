import java.util.*;
public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome1, nome2;
        int i1, i2;

        System.out.println("Digite um nome: ");
        nome1 = scan.next();
        System.out.println("Digite outro nome: ");
        nome2 = scan.next();
        System.out.println("Digite a idade da primeira pessoa");
        i1 = scan.nextInt();
        System.out.println("Digite a idade da segunda pessoa");
        i2 = scan.nextInt();

        if (i1>i2){
            System.out.println("O "+nome1+ "é mais velho");
        }else {
            System.out.println("O "+nome2+ "é mais velho");
        }

    }
}
