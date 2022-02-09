package resolucaoDeExerciciosJava.lista_07_classes;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Osvaldo");
        pessoa1.setIdade(31);
        pessoa1.setAltura(1.78);
//        pessoa1.imprimirDados();

        System.out.println();
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Vanessa");
        pessoa2.setIdade(42);
        pessoa2.setAltura(1.56);
//        pessoa2.imprimirDados();
        System.out.println(pessoa2.getNome() + " é minha amiga.");

        teclado.close();
    }
}
