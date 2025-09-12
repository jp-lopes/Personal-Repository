
public class MultiplicacaoComplexa 
        implements OperacaoComplexa {
    
    @Override
    public NumeroComplexo executar(NumeroComplexo z1, NumeroComplexo z2) {
        return z1.multiplicar(z2);
    }
}
