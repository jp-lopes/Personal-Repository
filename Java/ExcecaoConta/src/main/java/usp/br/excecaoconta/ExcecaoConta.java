
package usp.br.excecaoconta;
import java.util.Scanner;

public class ExcecaoConta {
    public static void main(String[] args) {
        ContaCorrente CC = new ContaCorrente(0.5f,100);
        Scanner sc = new Scanner(System.in);
        while(true) {    
            System.out.println("Saldo atual: " + CC.getsaldo());
            System.out.print("Insira um valor para sacar: ");
            float valor = sc.nextFloat();
            try {
                CC.sacar(valor);
            }
            catch (InvalidValueException error) {
                System.out.println(error.getMessage());
                continue;
            }
            System.out.println("Valor sacado com sucesso");
            System.out.println("Novo saldo: " + CC.getsaldo());            break;
        }
    }   
}