import java.util.*;
//Não entendi o motivo do exercicio em PHP no meio da lista de Java, então fiz uma versão em Java e outra em PHP.
public class ex10 {
    public static void main(String[] args) {
        int senha;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Digite sua senha: ");
            senha = scan.nextInt();
            if(senha!=2149){
                System.out.println("error password");
            }
        }while(senha!=2149);

        System.out.println("open");

    }
}
