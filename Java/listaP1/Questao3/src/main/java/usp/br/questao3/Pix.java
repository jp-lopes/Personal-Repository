
package usp.br.questao3;

public class Pix 
        implements MetodoPagamento {
    private String chavePix;
    
    public Pix(String chavePix){
        this.chavePix = chavePix;
    }
    
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento no valor de " + valor + " realizado para a chave pix " + chavePix);
    }
    
    @Override
    public double getTaxaPagamento(){
        return 0;
    }
}
