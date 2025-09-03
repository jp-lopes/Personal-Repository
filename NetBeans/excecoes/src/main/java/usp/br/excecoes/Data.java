
package usp.br.excecoes;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
    
    private void setDia(int idia) throws InvalidValueException {
        if (idia<=0 || idia>31) 
            throw new InvalidValueException("Dia Invalido.");
        else 
            this.dia = idia;
    }
    
    private void setMes(int imes) throws InvalidValueException {
        if (imes<=0 || imes>12) 
            throw new InvalidValueException("Mes Invalido.");
        else 
            this.mes = imes;
    }
        
    private void setAno(int iano) throws InvalidValueException {
        if (iano<=0) 
            throw new InvalidValueException("Ano Invalido.");
        else 
            this.ano = iano;
    }
    
    public void lerData() {
        Scanner sc = new Scanner(System.in);
        int n;
        
        while(true) {    
            System.out.print("Dia: ");
            n = sc.nextInt();
            try {
                this.setDia(n);
                break;
            } catch (InvalidValueException error){
                System.out.println(error.getMessage() + " Digite novamente.");
            }
        }           
        while(true) { 
            System.out.print("Mes: ");
            n = sc.nextInt();
            try {
                this.setMes(n);
                break;
            } catch (InvalidValueException error){
                System.out.println(error.getMessage() + " Digite novamente.");
            }
        }
        while(true) {    
            System.out.print("Ano: ");
            n = sc.nextInt();
            try {
                this.setAno(n);
                break;
            } catch (InvalidValueException error){
                System.out.println(error.getMessage()+ " Digite novamente.");
            }
        }
        sc.close();
        System.out.println("Data registrada com sucesso!");
  
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
    
}
