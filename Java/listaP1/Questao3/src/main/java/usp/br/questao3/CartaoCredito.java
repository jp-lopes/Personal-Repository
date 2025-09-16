
package usp.br.questao3;

public class CartaoCredito 
        implements MetodoPagamento {
    private String NumeroCartao;
    private double LimiteDisponivel;
    
    public CartaoCredito(String NumeroCartao, double LimiteDisponivel){
        this.NumeroCartao = NumeroCartao;
        this.LimiteDisponivel = LimiteDisponivel;
    }
    
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento no valor de " + valor + " realizado no cartão de numero " + NumeroCartao);
    }
    
    @Override
    public double getTaxaPagamento(){
        return 5;
    }
}
