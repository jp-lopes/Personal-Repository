public class Professor extends Pessoa {
    private Veiculo veiculo;
    
    public Professor(int CPF, String nome){
        super(CPF,nome);
        this.veiculo = null;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String toString() {
        return super.toString() + ", veiculo={" + veiculo + "}";
    }
}
