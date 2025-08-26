#include <stdio.h>
#include <stdlib.h>

/*
fun��o Ordena��oPedregulho (vetor):
	N = tamanho(vetor)
	Para i de 1 at� (N-1) (passo 1) fa�a:
		Para j de (N-1) at� i (passo -1) fa�a:
			se vetor[j-1] > vetor[j]:
				troca(vetor[j],vetor[j-1])
			fim se
		fim para
	fim para
fim fun��o

*/

void OrdenacaoPedregulho(int* vetor, int N){
    for(int i=1;i<N;i++){
        printf("i=%d\n",i);
        for(int j=N-1;j>=i;j--){
            if(vetor[j-1]>vetor[j]){
                int temp = vetor[j];
                vetor[j] = vetor[j-1];
                vetor[j-1] = temp;
            }
        }
        for(int k=0;k<N;k++) printf("%d ", vetor[k]);
        printf("\n");
    }
}

int main()
{
    int N=5, vetor[] = {5,4,3,2,1};
    OrdenacaoPedregulho(vetor,N);
    printf("\nVetor final:\n");
    for(int i=0;i<N;i++) printf("%d ", vetor[i]);
    return 0;
}
