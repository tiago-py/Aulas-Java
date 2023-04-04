import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = 8.5,b =9.5,c = 7.0;
        double d = 4.5, e = 5.0, f = 6.5;
        double calc1, calc2, calc3;

        calc1 = (a+b+c)/3;
        calc2 = (d+e+f)/3;
        calc3 = (calc1+calc2)/2;

        System.out.println("Média dos números 8,5; 9,5; 7,0: "+ calc1);
        System.out.println("Média dos números 4.5;5,0;6,5: "+ calc2);
        System.out.println("Média da média desses números:  "+ calc3);


    }
}