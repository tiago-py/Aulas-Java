public class Diretor extends Funcionarios{
    private double ParticipacaoNosLucros;

    public Diretor(String nome, int ID, double salario, double participacaoNosLucros) {
        super(nome, ID, salario);
        this.ParticipacaoNosLucros = participacaoNosLucros;


    }

    public double getParticipacaoNosLucros() {
        return ParticipacaoNosLucros;
    }

    public void setParticipacaoNosLucros(double participacaoNosLucros) {
        ParticipacaoNosLucros = participacaoNosLucros;
    }


    @Override
    public void CalcularSalario(){

        double NovoSalario = salario *0.15;
        salario+=NovoSalario;
        System.out.println("Salario atual de Diretor: "+ salario);

    }
    public void mostrarLucros(){
        System.out.println("Participação atual nos lucros da empresa: "+ getParticipacaoNosLucros());
    }
}
