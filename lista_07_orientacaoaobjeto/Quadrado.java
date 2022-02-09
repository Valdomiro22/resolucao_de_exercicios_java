package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Quadrado {
    private float lado;
    private float area;
    private float perimetro;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        area = lado * lado;
    }

    public void calcularPerimetro() {
        perimetro = lado * 4;
    }

    public void imprimir() {
        System.out.println("Lado: " + lado +
                "\nÁrea: " + area +
                "\nPerimetro: " + perimetro);
    }
}
