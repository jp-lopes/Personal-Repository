/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15588950
 */
public class Endereco {
    protected int CEP;
    private int numero;
    private String destinatario;

    public Endereco(int CEP, int numero, String destinatario) {
        this.CEP = CEP;
        this.numero = numero;
        this.destinatario = destinatario;
    }
    
    public String toString() {
        return "Endereco no CEP " + CEP + ", numero " + numero + " para destinatario " + destinatario;
    }
        
}
