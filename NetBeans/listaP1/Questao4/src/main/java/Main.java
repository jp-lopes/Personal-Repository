
public class Main {
    public static void main(String[] args) {
        NumeroComplexo z1 = new NumeroComplexo(1,2);
        NumeroComplexo z2 = new NumeroComplexo(3,4);
        
        System.out.println("z1: " + z1);
        System.out.println("|z1|: " + z1.modulo());

        System.out.println("z2: " + z2);
        System.out.println("|z2|: " + z2.modulo());
        System.out.println("\n");
        
        CalculadoraComplexa calc = new CalculadoraComplexa();
        calc.setOperacao(new SomaComplexa());
        NumeroComplexo res = calc.calcular(z1, z2);
        System.out.println("Soma: " + res);        
        calc.setOperacao(new MultiplicacaoComplexa());
        res = calc.calcular(z1, z2);
        System.out.println("Multiplicação: " + res);
               
    }
}