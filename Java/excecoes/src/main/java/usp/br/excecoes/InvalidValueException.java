
package usp.br.excecoes;

public class InvalidValueException extends Exception {
    public InvalidValueException(){
        System.out.println("Valor inválido");
    }
    public InvalidValueException(String error_msg){
        super(error_msg);
    }
}
