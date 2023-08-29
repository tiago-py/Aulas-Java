public class Livro {
    public String nome;
    public String autor;

    public Livro(String n, String a){
        nome = n;
        autor = a;
    }
    public void exibirLivro(){
        System.out.println(this.nome);
        System.out.println(this.autor);
    }


}
