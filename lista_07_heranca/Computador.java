package resolucaoDeExerciciosJava.lista_07_heranca;

public class Computador extends Equipamento {
    private int memoriaRam;
    private String processador;

    public Computador(String nomeDono, boolean emprestado, int memoriaRam, String processador) {
        super(nomeDono, emprestado);
        this.memoriaRam = memoriaRam;
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    @Override
    public String imprimir() {
        return super.imprimir() +
        "\nMemoria RAM: " + this.memoriaRam +
        "\nProcessador: " + this.processador;
    }
}
