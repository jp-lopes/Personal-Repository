
package usp.br.questao2;

public class Planilha extends Documento {
    private int NumCelulas;
    
    public Planilha(String Titulo, String Autor, int Tamanho, int NumCelulas){
        super(Titulo,Autor,Tamanho);
        this.NumCelulas = NumCelulas;
    }
    
    @Override
    public void abrir(){
        System.out.println("Planilha aberta.");
    }
    
    @Override
    public void formatar(){
        System.out.println("Planilha formatada.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Celulas: " + NumCelulas;
    }
        
}
