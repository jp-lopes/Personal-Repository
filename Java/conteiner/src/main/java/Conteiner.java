/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 15588950
 */
public class Conteiner {

    private int iQItens;
    private int iCapacidade;
    private String sNome;
    private Endereco destino;
    
    //Construtor
    public Conteiner(int iUmaCapacidade, String sUmNome) {
        sNome = sUmNome;
        iCapacidade = iUmaCapacidade;
        iQItens = 0;
        destino = null;
    }
    
    public void setDestino(Endereco umEndereco){
        destino = umEndereco;
    }

    public void adicionaItem() {
        if (iQItens == iCapacidade) {
            System.out.println("Capacidade do conteiner " + sNome + " excedida.");
        } else {
            iQItens++;
        }
        printQItens();
    }

    public void retiraItem() {
        if (iQItens == 0) {
            System.out.println("O conteiner " + sNome + " não possui nenhum item.");
        } else {
            iQItens--;
        }
        printQItens();
    }

    public void printQItens() {
        System.out.println("QTD DE ITENS NO CONTEINER " + sNome + ": " + iQItens);
    }

    public void printDestino() {
        System.out.println(destino);
    }
}
