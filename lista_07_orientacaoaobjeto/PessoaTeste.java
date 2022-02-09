package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Pessoa p1 = new Pessoa("Maria Luiza", "Rua nicolau bartolomeu, 532", "16-968566142");
//        p1.setNome("Ama Bela");
//        p1.setEndereco("Rua das garças, 32");
//        p1.setTelefone("95-98749658");

        p1.imprimir();

        teclado.close();
    }
}
