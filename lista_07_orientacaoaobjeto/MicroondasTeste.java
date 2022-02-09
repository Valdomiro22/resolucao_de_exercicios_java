package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class MicroondasTeste {
    public static void main(String[] args) {

        Microondas m1 = new Microondas(true, true);

        m1.imprimir();

        System.out.println("----------------------------------");
        m1.desligar();
        m1.fecharPorta();
        m1.imprimir();

        System.out.println("----------------------------------");
        m1.ligar();
        m1.abrirPorta();
        m1.imprimir();
    }
}
