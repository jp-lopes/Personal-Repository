public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro("Renault","ABC123",4);
        c1.setKm(200);
        c1.setQtdComb(20);
        
        System.out.println("Carro { " + c1 + " }");
        
        Professor p1 = new Professor(12345678, "Carlos");
        p1.setVeiculo(c1);
        
        System.out.println(p1);
    }
}                       