import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        double num1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número decimal: ");
        num1 = scan.nextDouble();
        System.out.println("Esse número arredondado para cima: "+ Math.ceil(num1));
        System.out.println("Esse número arredondado para baixo: "+ Math.floor(num1));
        System.out.println("Arredondamento aritimetico desse número: "+ Math.round(num1));
        
    }
}
