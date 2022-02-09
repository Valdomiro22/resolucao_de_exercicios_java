package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

import java.util.Scanner;

public class QuadradoTeste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Quadrado q1 = new Quadrado(98.632f);
//        q1.setLado(32.3f);
//        q1.calcularArea();
//        q1.calcularPerimetro();
        q1.calcularArea();
        q1.calcularPerimetro();

        q1.imprimir();

        teclado.close();
    }
}
