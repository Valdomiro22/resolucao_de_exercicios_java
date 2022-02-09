package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Microondas {
    private boolean ligado;
    private boolean portaFechada;

    public Microondas(boolean ligado, boolean portaFechada) {
        this.ligado = ligado;
        this.portaFechada = portaFechada;
    }

    public void ligar() {
        if (portaFechada) {
            this.ligado = true;
        } else {
            this.ligado = false;
        }
    }

    public void desligar() {
        this.ligado = false;
    }

    public void abrirPorta() {
        this.portaFechada = true;
    }

    public void fecharPorta() {
        this.portaFechada = false;
    }


    public void imprimir() {
        System.out.println("Ligado: " + this.ligado +
                "\nPorta fechada: " + this.portaFechada);
    }
}
