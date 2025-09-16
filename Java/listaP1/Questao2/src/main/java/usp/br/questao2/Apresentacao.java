
package usp.br.questao2;

public class Apresentacao extends Documento {
    private int NumSlides;
    
    public Apresentacao(String Titulo, String Autor, int Tamanho, int NumSlides){
        super(Titulo,Autor,Tamanho);
        this.NumSlides = NumSlides;
    }
    
    @Override
    public void abrir(){
        System.out.println("Apresentação aberta.");
    }
    
    @Override
    public void formatar(){
        System.out.println("Apresentação formatada.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Slides: " + NumSlides;
    }
    
}
