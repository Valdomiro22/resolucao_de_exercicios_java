package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        area = Math.PI * raio * raio;
    }

    public void calcularPerimetro() {
        perimetro = 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circula{" +
                "raio=" + raio +
                "\narea=" + area +
                "\nperimetro=" + perimetro +
                '}';
    }
}
