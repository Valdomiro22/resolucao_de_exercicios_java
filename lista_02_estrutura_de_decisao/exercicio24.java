package resolucaoDeExerciciosJava.lista_02_estrutura_de_decisao;

import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        float valor, taxa;
        String estado;

        System.out.print("Estado de destino: ");
        estado = teclado.nextLine().toUpperCase();
        System.out.print("Valor do produto: ");
        valor = teclado.nextFloat();

        if (estado.equals("MG") ) {
            taxa = valor + (valor * 0.07f);
            System.out.println(taxa);
        } else  if (estado.equals("SP")) {
            taxa = valor + (valor * 0.12f);
            System.out.println(taxa);
        } else  if (estado.equals("RJ")) {
            taxa = valor + (valor * 0.15f);
            System.out.println(taxa);
        } else  if (estado.equals("MS")) {
            taxa = valor + (valor * 0.08f);
            System.out.println(taxa);
        }else {
            System.out.println("Não é igual");
        }

        teclado.close();
    }
}
