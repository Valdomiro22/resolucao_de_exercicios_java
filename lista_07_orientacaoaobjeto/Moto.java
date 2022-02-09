package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Moto {
    private String marca;
    private String modelo;
    private String cor;

    private int marcha;
    private int menorMarcha;
    private int maiorMarcha;

    private boolean ligada = false;

    public Moto(String marca, String modelo, String cor, int marcha, int menorMarcha,
                 int maiorMarcha, boolean ligada) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.menorMarcha = menorMarcha;
        this.maiorMarcha = maiorMarcha;
        this.ligada = ligada;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void marchaAcima() {
        if (marcha < maiorMarcha) {
            marcha++;
        }
    }

    public void marchaAbaixo() {
        if (marcha > menorMarcha) {
            marcha--;
        }
    }

    public void ligar() {
        if (!ligada) {
            ligada = true;
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
        }
    }


    public void imprimir() {
        System.out.println("Marca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor +
                "\nMenor marcha: " + menorMarcha +
                "\nMaior marcha: " + maiorMarcha +
                "\nLigada: " + ligada +
                "\nMarcha: " + marcha);
    }
}
