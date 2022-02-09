package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Triangulo {
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;

    public Triangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void calcularArea() {
        area = comprimento * largura;
    }

    public void calcularPerimetro() {
        perimetro = (comprimento * 2) + (largura * 2);
    }

    public void imprimir() {
        System.out.println("Comprimento: " + this.comprimento +
                "\nLargura: " + this.largura +
                "\nArea: " + this.area +
                "\nPerimetro: " + this.perimetro);
    }
}
