package resolucaoDeExerciciosJava.lista_07_classes;

public class ControleRemoto extends Televisao{
    public ControleRemoto(int volume, int canal, int volumeMaximo, int qtCanais) {
        super(volume, canal, volumeMaximo, qtCanais);
    }


    public void aumentarVolume() {
        int volume = getVolume();

        if (getVolume() < getQtCanais()) {
            volume++;
            setVolume(volume);
        } else {
            System.out.println("Já está no maximo");
        }
    }

    public void diminuirVolume() {
        int volume = getVolume();

        if (getVolume() > 0) {
            volume++;
            setVolume(volume);
        }
    }

    public void aumentarCanal() {
        int canal = getCanal();

        if (getCanal() < getQtCanais()) {
            canal++;
            setCanal(canal);
        } else {
            setCanal(1);
        }
    }

    public void diminuirCanal() {
        int canal = getCanal();

        if (getCanal() > 0) {
            canal--;
            setCanal(canal);
        } else {
            setCanal(getQtCanais());
        }
    }

    public void inserirCanal(int canal) {
        if (canal > 0 && canal < getCanal()) {
            setCanal(canal);
        } else {
            setCanal(getCanal());
        }
    }

}
