/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 15588950
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conteiner c1 = new Conteiner(3,"c1");
        Conteiner c2 = new Conteiner(4,"c2");
        c1.adicionaItem();
        c1.adicionaItem();
        c2.adicionaItem();
        c2.adicionaItem();
        c2.adicionaItem();
        c2.adicionaItem();
        c2.adicionaItem();
        c1.retiraItem();
        c1.retiraItem();
        c1.retiraItem();
        
        Endereco endereco1 = new Endereco(13000, 57, "Joao");
        Endereco endereco2 = new Endereco(14000, 63, "Maria");
        
        c1.setDestino(endereco1);
        c2.setDestino(endereco2);
        
        c1.printDestino();
        c2.printDestino();
    }
    
}
