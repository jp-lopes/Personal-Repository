
package usp.br.excecaoconta;

public class ContaCorrente {
    private float saldo;
    private float creditoLimite;
    
    public ContaCorrente(float saldo, float creditoLimite){
        this.saldo = saldo;
        this.creditoLimite = creditoLimite;
    }
    
    public void sacar(float valor) throws InvalidValueException {
        if (valor > (saldo + creditoLimite)) {
            throw new InvalidValueException("Saldo insuficiente.");
        }
        else {
            saldo = saldo - valor;
        } 
    }
    
    public void depositar(float valor) throws InvalidValueException {
        if (valor <= 0) {
            throw new InvalidValueException("Deposita um valor valido tio.");
        }
        else {
            saldo = saldo + valor;
        }
    }
    
    public float getsaldo(){
        return saldo;
    }
}
