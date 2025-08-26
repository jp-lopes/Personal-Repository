public class Pessoa {
    protected int CPF;
    protected String nome;

    public Pessoa(int CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "CPF=" + CPF + ", nome=" + nome;
    }
    
    
}
