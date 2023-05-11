import java.util.*;
public class Main {
    public static void main(String[] args) {
        int continuar_compra;
        Boolean compra;
        compra = true;
        Scanner scan = new Scanner(System.in);
        SuperMercado mercado = new SuperMercado();
        do{
            System.out.println("Digite o nome, a quantidade e o valor do produto que deseja comprar: ");
            mercado.comprar(scan.next(),scan.nextInt(), scan.nextDouble());
            System.out.println("Deseja continuar (S[1]/N[2])?");
            continuar_compra = scan.nextInt();
            if(continuar_compra == 1){
                compra = true;
            }else{
                compra = false;
            }
        }while (compra);
        System.out.println("Digite a forma de pagamento (1-Dinheiro, 2-Cartão, 3-Cheque):");
        int forma_pagamento = scan.nextInt();

        mercado.pagar(forma_pagamento);
    }
}