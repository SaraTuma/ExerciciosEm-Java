/*
 * Descrição do exercício 1
 * Gere e imprima uma matriz M 4x4 com valores aleatórios
 * entre 0 e 9. Após isso determine o maior número da matriz
 * e a sua posição (linha e coluna).
 */
package matrizes;

import java.util.Random;

/**
 *
 * @author Sara Tuma
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int[][] valores = new int[4][4];
        int maior=0;
       
        Random rand = new Random();
        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                valores[i][j]=rand.nextInt(20);
            }
        }
         int coluna=-1, linha=-1;
        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                if(valores[i][j]>maior){
                     maior=valores[i][j];
                     coluna=j; linha=i;
                }
                System.out.print(valores[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("O maior é: "+maior);
        System.out.println("Linha: "+linha+" coluna: "+coluna);
    }
}
