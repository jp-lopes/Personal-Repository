/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usp.br.operacoes_matematicas;

/**
 *
 * @author jplop
 */
public abstract class Math {
       protected double res;

    public Math() {
        this.res = 0;
    }
       
    public final void about(){ //Ninguém que extende Math pode sobrescrever (Override) esse método
        System.out.println("Class by Joao");
    }   
    
    public void desc(){
        System.out.println("Classe de operações matemáticas");
    }
    
    public abstract void calcular(double op1, double op2); //Todos que extendem Math devem definir esse método
    
    public void mostraRes(){
        System.out.println(res);
    }
}