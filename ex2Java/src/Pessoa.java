public class Pessoa {

        public String nome;
        public String CPF;
        public int idade;
        public Pessoa(String n, String a, int x){
            nome = n;
            CPF = a;
            idade = x;
        }
        public void exibirPessoa(){
            System.out.println(this.nome);
            System.out.println(this.CPF);
            System.out.println(this.idade);

        }




}
