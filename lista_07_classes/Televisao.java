package resolucaoDeExerciciosJava.lista_07_classes;

public class Televisao {
    private int volume;
    private int canal;
    private int volumeMaximo;
    private int qtCanais;

    public Televisao(int volume, int canal, int volumeMaximo, int qtCanais) {
        this.volume = volume;
        this.canal = canal;
        this.volumeMaximo = volumeMaximo;
        this.qtCanais = qtCanais;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }

    public int getQtCanais() {
        return qtCanais;
    }

    public void setQtCanais(int qtCanais) {
        this.qtCanais = qtCanais;
    }


    public void imprimir() {
        System.out.println("Volume: " + volume +
                "\nVanal: " + canal +
                "\nVolume maximo: " + volumeMaximo +
                "\nQuantidade de anais: " + qtCanais);
    }
}
