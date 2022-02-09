package resolucaoDeExerciciosJava.lista_07_classes;

import java.util.ArrayList;

public class AdicionarNaAgenda extends Agenda{

    public AdicionarNaAgenda(String nome, int idade, double altura) {
        super(nome, idade, altura);
    }


    ArrayList<Agenda> a1 = new ArrayList<>();

    void adicionarPessoa(String nome, int idade, double altura) {
        a1.set(1, new Agenda(nome, idade, altura));
    }

    public void imprimir() {
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }
}
