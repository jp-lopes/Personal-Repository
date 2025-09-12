/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package usp.br.operacoes_matematicas;

/**
 *
 * @author jplop
 */
public class Operacoes_matematicas {

    public static void main(String[] args) {
        Math[] m = new Math[3];
        m[0] = null;
        m[1] = new Sum();
        m[2] = new Sub();
        
        for(int i=1;i<m.length;i++){
            m[i].about();
            m[i].desc();
            m[i].calcular(2,3);
            m[i].mostraRes();
        }
    }
}
