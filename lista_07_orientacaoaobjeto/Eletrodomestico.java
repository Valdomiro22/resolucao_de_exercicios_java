package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Eletrodomestico {
    private boolean ligado;

    public Eletrodomestico(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void imprimir() {
        System.out.println("Ligado: " + this.ligado);
    }
}
