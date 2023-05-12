import java.util.*;
public class ex11 {
    public static void main(String[] args) {
        int num;
        Random random = new Random();
        num = random.nextInt(13);

        switch (num) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Este mês tem 31 dias");
            case 2 -> System.out.println("Este mês tem 28 ou 29 dias");
            default -> System.out.println("Este mês tem 30 dias");
        }

    }
}
