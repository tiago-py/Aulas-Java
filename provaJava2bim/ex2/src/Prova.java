public class Prova {
    public String nome;
    public String turma;
    public String disciplina;

    public Prova(String nome, String turma, String disciplina){
        this.nome = nome;
        this.turma = turma;
        this.disciplina =  disciplina;
    }
    public void mostrarInfo(){
        System.out.println("Nome Aluno: "+ nome);
        System.out.println("Turma: "+ turma);
        System.out.println("Disciplina: "+disciplina);
    }

    public void resolverA(){
        for(int i = 0; i<=50; i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }

    public void resolverB(int valor){
        for(int i = 0; i<=10; i++){
            int result = i*valor;
            System.out.println(valor+ " X "+ i + " = "+ result);
        }
    }
}
