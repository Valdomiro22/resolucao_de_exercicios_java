package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class MotoTeste {
    public static void main(String[] args) {

        Moto m1 = new Moto("Honda","CB 650r", "Azul", 4, 2,
                8, true);
//        m1.setMarca("Honda");
//        m1.setModelo("CBR 650");
//        m1.setCor("Preto fosco");
//        m1.setMarcha(3);

        m1.marchaAcima();
        m1.marchaAbaixo();
        m1.marchaAbaixo();
        m1.desligar();

        m1.imprimir();
    }
}
