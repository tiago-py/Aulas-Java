import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        double salario;
        System.out.println("Digite o nome do seu funcionario: ");
        f1.nome = scn1.next();
        System.out.println("Digite a idade do seu funcionario: ");
        f1.idade = scn1.nextInt();
        System.out.println("Digite o setor do seu funcionario: ");
        f1.setor = scn1.next();
        System.out.println("Digite o salario do seu funcionario: ");
        f1.salario = scn1.nextFloat();
        System.out.println("Digite o RG do seu funcionario: ");
        f1.rg = scn1.next();


        f1.getSalario();
        System.out.println("Nome do funcionario: "+ f1.nome);
        System.out.println("Salario antigo: "+ f1.salario);
        f1.getAumento(500);
    }
}