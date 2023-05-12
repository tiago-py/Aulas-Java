import java.util.*;
public class ex9 {
    public static void main(String[] args) {
        int a,b;
        Random random = new Random();
        a = random.nextInt(21);
        b = random.nextInt(21);
        System.out.println("Número 1: "+ a);
        System.out.println("Número 2: "+ b);

        if(a%b==0){
            System.out.println(a/b);
        }else{
            System.out.println(a+b);
        }
        
    }
}
