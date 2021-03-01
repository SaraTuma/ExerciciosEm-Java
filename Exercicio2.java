/*
 * Descrição do Exercício
 * Gere e imprima uma matriz M 10x10 com valores aleartórios
 * entre 0 e 9, após isso indique qual é o maior e o menor valor
 * da linha 5 e qual é o maior e o menor da coluna 7.
 */
package matrizes;

import java.util.Random;

/**
 *
 * @author Sara Tuma
 */
public class Exercicio2 {
    public static void main(String[] args) {
        int[][] M = new int[10][10];
        Random rand=new Random();
        int maior5=0, menor5=10;
        int maior7=0, menor7=10;
        
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
                M[i][j]=rand.nextInt(10);
            }
        }
        int linha5=5;
        for(int i=0; i<M[linha5].length; i++){
                if(M[linha5][i]>maior5)
                    maior5=M[linha5][i];
                if(M[linha5][i]<menor5)
                    menor5=M[linha5][i];
            
        }
        
        int coluna7=7;
        for(int i=0; i<M.length; i++){
            if(M[i][coluna7]>maior7)
                maior7=M[i][coluna7];
            if(M[i][coluna7]<menor7)
                menor7=M[i][coluna7];
        }
        
        for(int i=0; i<M.length; i++){
            for(int j=0; j<M[i].length; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Maior linha 5: "+maior5+" e menor "+menor5);
        System.out.println("Maior coluna 7: "+maior7+" e menor "+menor7);
    }
}
