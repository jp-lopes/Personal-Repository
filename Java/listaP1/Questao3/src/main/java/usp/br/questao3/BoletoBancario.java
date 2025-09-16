
package usp.br.questao3;

public class BoletoBancario 
        implements MetodoPagamento {
    private String CodigoDeBarras;
    private String DataDeVencimento;
    
    public BoletoBancario(String CodigoDeBarras, String DataDeVencimento){
        this.CodigoDeBarras = CodigoDeBarras;
        this.DataDeVencimento = DataDeVencimento;
    }
    
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento no valor de " + valor + " realizado para o boleto de codigo " + CodigoDeBarras);
    }
    
    @Override
    public double getTaxaPagamento(){
        return 15;
    }
}
