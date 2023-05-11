import java.util.*;
public class SuperMercado {
    private double pagamento;
    private double total_compra;
    public void comprar(String nome_produto, int quantidade, double preco){
        System.out.println("Produto: "+ nome_produto);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Valor Por unin: "+ preco);
        double valor_tmp = preco*quantidade;

        System.out.printf("Total a pagar: %.2f %n", valor_tmp);

        total_compra+=valor_tmp;

    }
    public void pagar(int forma_pagamento){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Valor total da compra R$ %.2f %n \n",total_compra);


        switch (forma_pagamento){
            case 1:
                total_compra-=5;
                System.out.println("Forma de pagamento: Dinheiro");
                System.out.printf("Total da compra com o desconto R$: %.2f %n \n",total_compra);
                break;

            case 2:
                total_compra-=2;
                System.out.println("Forma de pagamento: Cartão");
                System.out.printf("Total da compra com desconto R$ %.2f %n \n",total_compra);
                break;

            case 3:
                System.out.println("Forma de pagamento: Cheque");
                System.out.println("Total da compra: "+ total_compra);
                break;
            default:
                System.out.println("Forma de pagamento invalida.");
                break;
        }
    }
}
