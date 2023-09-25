public class Main {
    public static void main(String[] args) {
        Gerente gerente01 = new Gerente("Pedro", 1333, 8.780, "Contabilidade");
        Diretor diretor01 = new Diretor("Tiago", 2333, 30.890, 1990090);

        gerente01.mostrarInformacoes();
        gerente01.CalcularSalario();
        gerente01.mostrarDepartamento();
        System.out.println("=================");
        diretor01.mostrarInformacoes();
        diretor01.CalcularSalario();
        diretor01.mostrarLucros();

    }
}