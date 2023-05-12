import java.util.*;
public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero");
        num = scan.nextInt();
        if (num%2 ==0 ){
            System.out.println("número par");
        }else{
            System.out.println("número impar");
        }
    }
}
