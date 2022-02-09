package resolucaoDeExerciciosJava.lista_07_classes;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes = 0;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            System.out.println("Entrou mais um: " + pessoasPresentes);
        } else {
            System.out.println("Já está cheio");
        }
    }

    public void sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            System.out.println("Saiu uma pessoa: " + pessoasPresentes);
        } else {
            System.out.println("Não tem ninguêm no elevador");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu mais um andar: " + andarAtual);
        } else {
            System.out.println("Já está no ultimo andar");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu um andar: " + andarAtual);
        } else {
            System.out.println("Já está no terreo");
        }
    }
}
