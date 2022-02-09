package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class CirculoTeste {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(9.5862);
//        c1.setRaio(32.352);

        c1.calcularArea();
        c1.calcularPerimetro();

        System.out.println(c1.toString());
    }
}
