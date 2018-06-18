/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author Usúario
 */
public class questao3 {
    public static void main(String args[]){
        int v1 = 1;
        float soma = 0;
        float div;
        for(int x = 1; x<=99; x= x+2){
          div = x / v1;
          soma = soma + div;
          System.out.printf("%d / % d + ", x, v1);
          if(x == 99){  
              System.out.printf("%d / % d \n", x, v1);
          }
          v1++;
        }
        System.out.println(" "+ soma);
    }
}
