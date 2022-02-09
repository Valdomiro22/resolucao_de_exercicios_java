package resolucaoDeExerciciosJava.lista_07_heranca;

public class Equipamento {
    private String nomeDono;
    private boolean emprestado;

    public Equipamento(String nomeDono, boolean emprestado) {
        this.nomeDono = nomeDono;
        this.emprestado = emprestado;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String imprimir() {
        return "Equipamento \nNome do dono: " + this.nomeDono +
                "\nEsta emprestado: " + this.emprestado;
    }
}
