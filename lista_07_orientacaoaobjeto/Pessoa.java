package resolucaoDeExerciciosJava.lista_07_orientacaoaobjeto;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome +
                "\nEndereço: " + this.endereco +
                "\nTelefone: " + this.telefone);
    }
}
