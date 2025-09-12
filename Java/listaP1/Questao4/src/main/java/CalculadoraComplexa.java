
public class CalculadoraComplexa {
    private OperacaoComplexa Operacao;
    
    public CalculadoraComplexa(){
        this.Operacao = null;
    }
    
    public void setOperacao(OperacaoComplexa Operacao){
        this.Operacao = Operacao;
    }
    
    public NumeroComplexo calcular(NumeroComplexo z1, NumeroComplexo z2){
        if (Operacao == null) return null;
        return Operacao.executar(z1,z2);
    }
    
}
