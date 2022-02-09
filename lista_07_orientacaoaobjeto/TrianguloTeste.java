package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

import java.util.Scanner;

public class TrianguloTeste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Triangulo t1 = new Triangulo(4.23, 53.234);

//        System.out.print("Digite a largura: ");
//        t1.setLargura(teclado.nextDouble());
//        System.out.print("Digite o comprimento: ");
//        t1.setComprimento(teclado.nextDouble());

        t1.calcularArea();
        t1.calcularPerimetro();

        t1.imprimir();

        teclado.close();
    }
}
