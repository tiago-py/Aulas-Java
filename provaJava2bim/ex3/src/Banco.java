import java.util.Scanner;



public class Banco {
    private String nome;
    private int saldo;
    private int cod_conta;

    Scanner scan = new Scanner(System.in);
    public Banco(){
        saldo = 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(int cod_conta) {
        this.cod_conta = cod_conta;
    }

    public void CriarConta(){
        System.out.println("Digite seu nome: ");

        nome = scan.next();

        System.out.println("Digite o código da sua conta (1)Conta Poupança, (2)Conta Corrente: ");

        cod_conta = scan.nextInt();
        if(cod_conta == 1){
         saldo+=20;
        }

    }

    public void Sacar(int valorSaque){
        if(saldo>=valorSaque){
            saldo-=valorSaque;
            System.out.println("Você sacou "+ valorSaque + " Reais.");
            System.out.println("Saldo Atual: "+ saldo);
        }else{
            System.out.println("Saldo insuficiente para saque");
            System.out.println("Saldo Atual: "+ saldo);
        }
    }

    public void Depositar(int valorDeposito){
        saldo+=valorDeposito;
        System.out.println("Você depositou "+ valorDeposito + " Reais");
        System.out.println("Saldo atual: "+ saldo);
    }

    public void Emprestar(int valorEmprestado){
        int juros = (int) (valorEmprestado*0.10+valorEmprestado);
        saldo+=valorEmprestado;
        System.out.println("Você fez um empréstimo.");
        System.out.println("Valor do empréstimo: "+ valorEmprestado);
        System.out.println("Valor a pagar com juros: "+ juros);
        System.out.println("Saldo atual com o empréstimo: "+ saldo);
    }

    public void Extrato(){
        System.out.println("Nome: "+ nome);
        System.out.println("Código da conta: "+ cod_conta);
        System.out.println("Saldo atual: "+ saldo);
    }

}
