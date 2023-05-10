import java.util.Scanner;
public class pesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sexo;
        double altura, calc;
        System.out.println("Digite seu sexo [M/F]");
        sexo = scan.next();
        System.out.println("Digite sua altura em metros: ");
        altura = scan.nextDouble();

        switch (sexo){
            case "M":
                calc = (72.7*altura) - 58;
                System.out.println("Peso ideal masculino: " + calc);
                break;
            case "F":
                calc = (62.1 *altura) - 44.7;
                System.out.println("Peso ideal feminino: "+ calc);
                break;
            default:
                System.out.println("Sexo invalido!!!");
        }
    }
}
