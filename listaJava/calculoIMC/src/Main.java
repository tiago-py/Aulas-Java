public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 1990, 75, 1.80);
        Pessoa pessoa2 = new Pessoa("Maria", 1930, 62, 1.65);

        pessoa1.exibirDados();
        pessoa2.exibirDados();
        pessoa1.calculaIdade();
        pessoa2.calculaIdade();
    }
}