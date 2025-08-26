/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package usp.br.testes;

/**
 *
 * @author jplop
 */
public class Testes {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] array = new int[10];
        
        for(int i=0;i<10;i++){
            array[i] = i+1;
            System.out.println(i + ": " + array[i]);
        }
        
        System.out.println(array.length);
    }
}
