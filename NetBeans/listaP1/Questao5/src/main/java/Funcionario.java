
public class Funcionario 
        implements Comparavel {
    
    private String nome;
    private float salariobase;
    private int horas;
    
    public Funcionario(String nome, float salariobase, int horas){
        this.nome = nome;
        this.salariobase = salariobase;
        this.horas = horas;
    }
    
    public float getSalarioTotal(){
        return this.salariobase * this.horas;
    }
    
    @Override
    public int ComparaCom(Comparavel OutroObjeto){
        /* Retorno:
            1 se this > outro, 
            -1 se this < outro,
            0 se this == outro
        */
        Funcionario F = (Funcionario)(OutroObjeto);
        if(this.getSalarioTotal() > F.getSalarioTotal()) return 1;
        else if(this.getSalarioTotal() < F.getSalarioTotal()) return -1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return this.nome + ": " + this.getSalarioTotal();
    }
}
