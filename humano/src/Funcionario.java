public class Funcionario {
    public String nome;
    public String setor;
    public int idade;
    public double salario;
    public String rg;


    public void getSalario() {
        this.salario -= 200;// desconto INSS
        System.out.println("Salario: "+ this.salario);
    }

    public void getAumento(float aumento){
        this.salario+=aumento;//aumento do salario
        System.out.println("Novo salario "+ this.salario);

    }

}
