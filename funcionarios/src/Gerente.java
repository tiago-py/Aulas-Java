public class Gerente extends Funcionarios{
    private String departamento;

    public Gerente(String nome, int ID, double salario, String departamento) {
        super(nome, ID, salario);
        this.departamento = departamento;

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void CalcularSalario(){
        double novoSalario = salario * 0.10;
        salario+=novoSalario;
        System.out.println("Salario atual no cargo de gerente: "+salario);

    }
    public void mostrarDepartamento(){
        System.out.println("Departamento atual de gerencia: "+departamento);
    }
}
