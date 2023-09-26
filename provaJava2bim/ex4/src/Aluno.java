public class Aluno extends Pessoa{
    private String RA;
    private double media;

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }



    public Aluno(String nome, int idade, String CPF, String RA, double media) {
        super(nome, idade, CPF);
        this.media = media;
        this.RA = RA;
    }


    @Override
    public void mostrarInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("CPF: "+ CPF);
        System.out.println("R.A do aluno: "+ RA);
        System.out.println("Média do aluno: "+ media);
    }
}
