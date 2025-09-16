
package usp.br.questao2;

public abstract class Documento {
    protected String Titulo;
    protected String Autor;
    protected int Tamanho;
    
    public Documento(String Titulo, String Autor, int Tamanho){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Tamanho = Tamanho;
    }
    
    public abstract void abrir();
    public abstract void formatar();
    
    @Override
    public String toString() {
        return Titulo + " de " + Autor +": " + Tamanho + "KB";
    }
}
