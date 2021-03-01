/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

/**
 *
 * @author Sara Tuma
 */
public class Matriz {
    
    
     public static void main(String[] args) {
        // TODO code application logic here
        double[][] notasAlunos = new double[30][4];
        notasAlunos[0][0]=10;
        notasAlunos[0][1]=7;
        notasAlunos[0][2]=8;
        notasAlunos[0][3]=9.5;
        
        notasAlunos[1][0]=9;
        notasAlunos[1][1]=8;
        notasAlunos[1][2]=7;
        notasAlunos[1][3]=9;
        
        notasAlunos[2][0]=8;
        notasAlunos[2][1]=9;
        notasAlunos[2][2]=10;
        notasAlunos[2][3]=7;
        
        for(int i=0; i<30; i++){
            for(int j=0; j<4; j++)
                System.out.println("Vector ["+i+"] ["+j+"] = "+notasAlunos[i][j]);
        }

    }
    
    
}
