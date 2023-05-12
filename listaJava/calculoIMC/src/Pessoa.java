public class Pessoa {
    private String nome;
    private int ano_nascimento;
    private double peso;
    private double altura;

    public Pessoa(String nome, int ano_nascimento, double peso, double altura){

        this.nome = nome;
        this.altura = altura;
        this.ano_nascimento = ano_nascimento;
        this.peso = peso;

    }

    public double calculaIMC(){
        return peso*(altura*altura);
    }

    public void calculaIdade(){
        System.out.println("Nome: "+ nome);
        int idade = 2023-ano_nascimento;
        System.out.println("Idade: "+ idade);
        if (idade>18 && idade<70){
            System.out.println("Deve votar e pode tirar CNH");
        } else if (idade<18) {
            System.out.println("Não pode votar e nem tirar CNH");
        } else if (idade>16 && idade<18) {
            System.out.println("Não pode tirar CNH, voto não obrigatorio");
        }else{
            System.out.println("Pode tirar CNH, voto não obrigatorio");
        }

    }
    public void exibirDados(){
        double imc = calculaIMC();
        System.out.println("Nome: "+ nome);
        System.out.println("IMC: "+ imc);
        if(imc < 18.5){
            System.out.println("Condição: Abaixo do peso");
            
        } else if (imc < 25) {
            System.out.println("Condição: Peso normal");
        } else if (imc < 30) {
            System.out.println("Condição: Sobrepeso");
        }else{
            System.out.println("Condição: Obesidade");
        }
    }

}