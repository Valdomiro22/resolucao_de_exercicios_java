package resolucaoDeExerciciosJava.lista_04_vetores;

public class exercicio29 {
    public static void main(String[] args) {

        int[] numeros = {5326, 75, 957, 148, 364, 259};
        int somaPares=0, qtImpares=0;

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.print("Números pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
                System.out.print(numero + " ");
            } else {
                qtImpares++;
            }
        }

        System.out.println();
        System.out.print("Números impares: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.println();
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Quantidade de números impares: " + qtImpares);
    }
}
