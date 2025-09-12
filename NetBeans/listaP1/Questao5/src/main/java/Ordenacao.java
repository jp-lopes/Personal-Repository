
public class Ordenacao {
    
    public void BubbleSort(Comparavel[] vetor){
        int n = vetor.length;
        boolean trocou = true;
        while(trocou) {
            trocou = false;
            for(int i=0;i<(n-1);i++) {
                if(vetor[i].ComparaCom(vetor[i+1])>0) {
                    Comparavel temp = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                    trocou = true;
                }
            }
            n--;
        }
    }
}
