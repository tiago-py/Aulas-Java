public class Main {
    public static void main(String[] args) {
        Banco b1 = new Banco();

        b1.CriarConta();
        System.out.println("=================");
        b1.Depositar(1000);
        System.out.println("=================");
        b1.Sacar(500);
        System.out.println("=================");
        b1.Emprestar(100);
        System.out.println("=================");
        b1.Extrato();

    }
}