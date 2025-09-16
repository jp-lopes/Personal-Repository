
package usp.br.questao2;
import java.util.List;
import java.util.ArrayList;


public class Questao2 {

    public static void main(String[] args) {
        List<Documento> biblioteca = new ArrayList<>();
        biblioteca.add(new Texto("Relatório Anual", "Carlos Silva", 250, 1500));
        biblioteca.add(new Planilha("Finanças", "Maria Souza", 120, 500));
        biblioteca.add(new Apresentacao("Pitch Vendas", "João Pereira", 340, 15));
        
        for(Documento doc : biblioteca) {
            doc.abrir();
            doc.formatar();
            System.out.println(doc);
        }
        
    }

}
