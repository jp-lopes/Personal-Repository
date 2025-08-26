#include <stdio.h>
#include <stdlib.h>

/*
Função MaiorElemento(vetor, esq, dir, maior) //Deve-se iniciar a função com esq=0, dir=N-1 e maior = -inf
	Se esq==dir:
		Se vetor[esq] > maior:
			maior = vetor[esq]
		fim se
		retorna
	fim se
	meio = floor((dir+esq)/2)
	MaiorElemento(vetor,esq,meio,maior)
	MaiorElemento(vetor,meio+1,dir,maior)
fim função
*/
void MaiorElemento(int* vetor, int esq, int dir, int* maior){
    if (esq==dir){
        if(vetor[esq]>*maior) *maior = vetor[esq];
        return;
    }
    int meio = (dir+esq)/2;
    MaiorElemento(vetor,esq,meio,maior);
    MaiorElemento(vetor,meio+1,dir,maior);
}

int main()
{
    int vetor[] = {10,100,723,45,643,101,12,8765};
    int N = 8;
    int maior = -10000;
    MaiorElemento(vetor,0,N-1,&maior);
    printf("MAIOR: %d", maior);
    return 0;
}
