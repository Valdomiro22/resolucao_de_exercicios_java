package resolucaoDeExerciciosJava.lista_07_classes;

import java.util.ArrayList;

public class Agenda {
    private String nome;
    private int idade;
    private double altura;


    ArrayList<Agenda> a1 = new ArrayList<>();

    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

//    public void armazenaPessoa(String nome, int idade, double altura) {
//    }

    public void imprimePessoas() {
        System.out.println("Nome: " + this.nome +
                            "\nIdade: " + this.idade +
                            "\nAltura: " + this.altura);
    }
}
