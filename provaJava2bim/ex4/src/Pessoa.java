public class Pessoa {
    protected String nome;
    protected int idade;
    protected String CPF;

    public Pessoa(String nome, int idade, String CPF){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
    }

    public void Andar(){
        System.out.println("Andando...");
    }
    public void Comer(){
        System.out.println("Comendo...");
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("CPF: "+ CPF);
    }

}
