/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usp.br.operacoes_matematicas;

/**
 *
 * @author jplop
 */
public class Sub extends Math {
    private int i;
    
    public Sub() {
        super();
        this.i=0;
    }
    @Override
    public void desc(){
        super.desc();
        System.out.println("Subtração");
    }
    @Override
    public void calcular(double op1, double op2){
        res = op1-op2;
    }
}
