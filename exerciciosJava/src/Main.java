import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1,n2,n3,media;

        System.out.println("Digite a primeira nota de um aluno");
        n1 = scan.nextDouble();
        System.out.println("Digite a segunda nota de um aluno");
        n2 = scan.nextDouble();
        System.out.println("Digite a terceira nota de um aluno");
        n3 = scan.nextDouble();
        media = (n1+n2+n3)/3;

        if(media<=5){
            System.out.printf("Aluno reprovado %.1f %n", media);
        } else if (media <= 5.1 && media <= 6.9) {
            System.out.printf("Aluno de recuperação %.1f %n", media);
        }else{
            System.out.printf("Aluno Aprovado %.1f %n", media);
        }
    }
}