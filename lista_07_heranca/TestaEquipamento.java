package resolucaoDeExerciciosJava.lista_07_heranca;

public class TestaEquipamento {
    public static void main(String[] args) {

        Equipamento e1 = new Equipamento("Ana", true);

        Computador c1 = new Computador("Lilia", false, 8, "Core I5");

        System.out.println("Equipamento - Nome do dono: " + e1.getNomeDono() +
                " - Esta emprestado: " + e1.isEmprestado());

        System.out.println("Computador - Nome do dono: " + c1.getNomeDono() +
                " - Eta emprestado: " + c1.isEmprestado() + " - Memoria RAM: " + c1.getMemoriaRam() + "GB" +
                " - Processador: " + c1.getProcessador());

        System.out.println("-----------------------------------------------------------------------------------" +
                "---------------------------");
        System.out.println(e1.imprimir());

        System.out.println("-----------------------------------------------------------------------------------" +
                "---------------------------");
        System.out.println(c1.imprimir());
    }
}
