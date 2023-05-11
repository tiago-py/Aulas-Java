public class circulo {
    private double raio;
    private double comprimento;
    private double area;
    public void Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularComprimento() {
        this.comprimento = 2 * Math.PI * this.raio;
    }

    public void calcularArea() {
        this.area = Math.PI * Math.pow(this.raio, 2);
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public double getArea() {
        return this.area;
    }
}
