public class Funcionarios {
    protected String nome;
    protected int ID;
    protected double salario;

    public Funcionarios(String nome, int ID, double salario){
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;

    }
    public void CalcularSalario(){
        System.out.println("Salario atual: "+ salario);
    }
    public void mostrarInformacoes(){
        System.out.println(nome);
        System.out.println(ID);
    }

}
