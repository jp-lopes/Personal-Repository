
package usp.br.questao2;

public class Texto extends Documento {
    private int NumPalavras;
    
    public Texto(String Titulo, String Autor, int Tamanho, int NumPalavras){
        super(Titulo,Autor,Tamanho);
        this.NumPalavras = NumPalavras;
    }
    
    @Override
    public void abrir(){
        System.out.println("Texto aberto.");
    }
    
    @Override
    public void formatar(){
        System.out.println("Texto formatado.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Palavras: " + NumPalavras;
    }
    
}
