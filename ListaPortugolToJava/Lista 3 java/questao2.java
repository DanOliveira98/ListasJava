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
public class questao2 {
    public static void main(String[] args){
        for(int x = 0;x<=9;x++){
          for(int y = 1; y<=10; y++){
           int mult = x*y;
              System.out.printf("% d * % d é igual a % d \n ", x, y, mult);
              if(y==10){
              System.out.println("--------------------------------------------");
              }
          }  
    }
        
    }
    
}
