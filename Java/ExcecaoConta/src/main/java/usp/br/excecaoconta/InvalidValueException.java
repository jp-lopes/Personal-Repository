
package usp.br.excecaoconta;

public class InvalidValueException extends Exception {
    public String error_msg;
   
    public InvalidValueException(String error_msg){
        this.error_msg = error_msg;
    }
    @Override
    public String getMessage(){
        return error_msg;
    }
}
