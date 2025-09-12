
public class SomaComplexa 
        implements OperacaoComplexa {
    
    @Override
    public NumeroComplexo executar(NumeroComplexo z1, NumeroComplexo z2) {
        return z1.adicionar(z2);
    }
}
