/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Usúario
 */
import java.util.Scanner;
public class questao3 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
           System.out.println("Informe o valor da primeira nota:");
            float n1 = rec.nextFloat();
            System.out.println("Informe o valor da segunda nota:");
            float n2 = rec.nextFloat();
            System.out.println("Informe o valor da Terceira nota:");
            float n3 = rec.nextFloat();
            if((n3>n2) && (n3>n1)){
                System.out.printf("A maior nota é: %.1f\n", n3);    
            }
           if((n2>n1) && (n2>n3)){
               System.out.printf("A maior nota é: %.1f\n", n2);
           }
           if((n1>n2) && (n1>n3)){
               System.out.printf("A maior nota é: %.1f \n", n2);
               
            }
          float media = (n1 + n2+ n3) / 3;
          System.out.printf("A media dos alunos é: %.1f", media);
    }
}
