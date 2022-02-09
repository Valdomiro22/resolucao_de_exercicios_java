package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class TelevisorTeste {
    public static void main(String[] args) {

        Televisor t1 = new Televisor(true, 32, 8, 238, 100);

//        t1.setCanal(9);
//        t1.setLigado(true);
//        t1.setVolume(25);

        t1.imprimir();

        System.out.println("------------------------");
        t1.canalAcima();
        t1.volumeAcima();
        t1.volumeAcima();
        t1.volumeAcima();
        t1.imprimir();

        System.out.println("------------------------");
        t1.canaAbaixo();
        t1.canaAbaixo();
        t1.canaAbaixo();
        t1.canaAbaixo();
        t1.volumeAbaixo();
        t1.volumeAbaixo();
        t1.imprimir();

    }
}
