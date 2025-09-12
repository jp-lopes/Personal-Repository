
public class Main {
    public static void main(String[] args) {
        TimeFutebol[] Times = new TimeFutebol[3];
        Times[0] = new TimeFutebol("Corinthians", 10, 4);
        Times[1] = new TimeFutebol("Flamengo", 0, 0);
        Times[2] = new TimeFutebol("Amazonas FC", 1000, 0);
        
        System.out.println("Antes da Ordenação:");
        System.out.println(Times[0] + "\n" + Times[1] + "\n" + Times[2] + "\n");
        
        Ordenacao ord = new Ordenacao();
        ord.BubbleSort(Times);
        
        System.out.println("Após a Ordenação:");
        System.out.println(Times[0] + "\n" + Times[1] + "\n" + Times[2]+ "\n");
        
        Funcionario[] Funcionarios = new Funcionario[3];
        Funcionarios[0] = new Funcionario("Caio", 12000, 4);
        Funcionarios[1] = new Funcionario("Pedro", 1.5f, 4);
        Funcionarios[2] = new Funcionario("Isa", 10.75f, 15);
        
        System.out.println("Antes da Ordenação:");
        System.out.println(Funcionarios[0] + "\n" + Funcionarios[1] + "\n" + Funcionarios[2]+ "\n");
        
        ord.BubbleSort(Funcionarios);
        
        System.out.println("Após a Ordenação:");
        System.out.println(Funcionarios[0] + "\n" + Funcionarios[1] + "\n" + Funcionarios[2]+ "\n");
        
    }
    
}
