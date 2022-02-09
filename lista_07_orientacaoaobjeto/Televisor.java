package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Televisor {
    private boolean ligado;
    private int canal;
    private int volume;
    private int numeroCanais;
    private int volumeMaximo;

    public Televisor(boolean ligado, int canal, int volume, int numeroCanais, int volumeMaximo) {
        this.ligado = ligado;
        this.canal = canal;
        this.volume = volume;
        this.numeroCanais = numeroCanais;
        this.volumeMaximo = volumeMaximo;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void canalAcima() {
        if (canal < numeroCanais) {
            canal++;
        } else {
            canal = 1;
        }
    }

    public void canaAbaixo() {
        if (canal > 1) {
            canal--;
        } else {
            canal = numeroCanais;
        }
    }

    public void volumeAcima() {
        if (volume < volumeMaximo) {
            volume++;
        }
    }

    public void volumeAbaixo() {
        if (volume > 0) {
            volume--;
        }
    }

    public void imprimir() {
        System.out.println("Ligado: " + this.ligado +
            "\nCanal: " + this.canal +
            "\nQuantidade de canais: " + this.numeroCanais +
            "\nVolume maximo: " + volumeMaximo +
            "\nVolume: " + this.volume);
    }
}
