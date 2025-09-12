#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

int prox_primo(int n){ //RETORNA O PROXIMO PRIMO MAIOR QUE O NÚMERO DADO
    int primo, i,j=n;
    while(1){
        primo = TRUE;
        for(i=1;i<=j;i++){
            if(j%i==0 && j!=i && i!=1) primo = FALSE;
        }
        if(primo == TRUE) break;
        else j++;
    }
    return j;
}

int main()
{
    int a=0;
    while(a>=0){
        scanf("%d",&a);
        printf("proxprimo(%d): %d\n",a,prox_primo(a));
    }
    return 0;
}
