package resolucaoDeExerciciosJava.lista_07_classes;

import java.util.Scanner;

public class ElevadorTeste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Elevador el1 = new Elevador(6, 12);
        el1.entrar();
        el1.entrar();
        el1.entrar();

        el1.sobe();
        el1.sobe();

        el1.sair();
        el1.sair();
        el1.sair();

        el1.descer();




        teclado.close();
    }
}
