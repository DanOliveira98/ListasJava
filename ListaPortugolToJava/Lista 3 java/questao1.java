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
import java.util.Scanner;
public class questao1 {
    public static void main(String[] args){
        Scanner rec  = new Scanner(System.in);
        System.out.println("Informe o 1 valor real:");
        int x = rec.nextInt();
       int ma = x;
       int me = x;
       int c = 0;
       int y;
       while(c < 14){
           System.out.println("informe o valor do proximo numero");
           y = rec.nextInt();
           if(y > ma){
               ma = y;
           }
           if(y < me){
               me = y;
           }
           c++;
       }
        System.out.printf("O maior valor é:% d \n", ma);
        System.out.printf("O menor valor é:% d", me);
    }
   
}
