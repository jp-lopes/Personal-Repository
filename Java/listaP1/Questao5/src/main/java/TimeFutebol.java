
public class TimeFutebol 
        implements Comparavel {
    
    private String nome;
    private int vitorias;
    private int empates;
    
    public TimeFutebol(String nome, int vitorias, int empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.empates = empates;
    }
    
    public int getNumPontos() {
        return vitorias*3+empates;
    }
    
    @Override
    public int ComparaCom(Comparavel OutroObjeto){
        /* Retorno:
            1 se this > outro, 
            -1 se this < outro,
            0 se this == outro
        */
        
        TimeFutebol T = (TimeFutebol)OutroObjeto;
        
        if(this.getNumPontos() > T.getNumPontos()) return 1;
        else if(this.getNumPontos() < T.getNumPontos()) return -1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return this.nome + ": " + this.getNumPontos();
    }
}
