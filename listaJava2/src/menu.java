import java.util.Scanner;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Verificar se um dos números lidos é ou não múltiplo do outro");
            System.out.println("2 - Verificar se os dois números lidos são pares");
            System.out.println("3 - Verificar se a média dos dois números é maior ou igual a 7");
            System.out.println("4 - Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (num1 % num2 == 0 || num2 % num1 == 0) {
                        System.out.println("Um dos números é múltiplo do outro.");
                    } else {
                        System.out.println("Os números não são múltiplos entre si.");
                    }
                    break;
                case 2:
                    if (num1 % 2 == 0 && num2 % 2 == 0) {
                        System.out.println("Ambos os números são pares.");
                    } else {
                        System.out.println("Pelo menos um dos números não é par.");
                    }
                    break;
                case 3:
                    double media = (num1 + num2) / 2.0;
                    if (media >= 7.0) {
                        System.out.println("A média dos números é maior ou igual a 7.");
                    } else {
                        System.out.println("A média dos números é menor que 7.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);
    }
}

