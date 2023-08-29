public class Pessoa {

        public String nome;
        public String CPF;

        public Pessoa(String n, String a){
            nome = n;
            CPF = a;
        }
        public void exibirPessoa(){
            System.out.println(this.nome);
            System.out.println(this.CPF);
        }




}
