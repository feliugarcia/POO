#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(int argc, char *args[]) {
  /*
   * Variavel de retorno do resultado
   */
  int res=0;

  /*
   * Variavel para contar o numero de voltas
   */
  int i=0;

  /*
   * Vetor com os elementos a ser calculados.
   */
  /*int vetor[6]={0,1,1,1,1,0};*/
  int *vetor;
  
  unsigned char ch;

  printf("Programa de verificacao\n\n");


  while ((ch = getc(stdin)) != '\n') {
    vetor = (int*) calloc (i+1,sizeof(int));
    vetor[i] = ch;
    printf("==== %c - %i - %c \n",ch,i,vetor[i]);

    if (vetor[i] == '0') {
      printf("Elemento 0 do vetor I=%c\n",ch);
    } else {
      res = res + pow(2,i);
      printf("Elemento 1 do vetor I=%c - %i - %i\n",vetor[i],vetor[i],res);
    }
    
    i++;
  }
  
  printf("Valor de Resultado: %i",res);

  return 0;
}


/*
 * cc bin.c -o bin -Wall -lm 
 */
