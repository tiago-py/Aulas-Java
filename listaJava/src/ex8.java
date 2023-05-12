import java.util.*;
public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, num2;
        System.out.println("Digite um numero");
        num = scan.nextInt();
        System.out.println("Digite outro numero");
        num2 = scan.nextInt();
        if (num%num2 ==0 ){
            System.out.println("números multiplos");
        }else{
            System.out.println("número não multiplos");
        }
    }
}
