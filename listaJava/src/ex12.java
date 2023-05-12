import java.util.*;
public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String estacao;

        System.out.println("Digite uma estação do ano: ");
        estacao = scan.nextLine();

        switch (estacao){
            case "outono"-> System.out.println("De 21 de Março a 21 de Junho");
            case "inverno"-> System.out.println("De 21 de Junho a 23 de Setembro");
            case "primavera"-> System.out.println("De 23 de Setembro a 21 de Dezembro");
            case "verão"-> System.out.println("De 21 de Dezembro a 21 de Março");
            default-> System.out.println("Estação do ano inválida");
        }
    }
}
