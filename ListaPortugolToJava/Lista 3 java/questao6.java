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
public class questao6 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int soma;
        int mult;
        float media;
        do{
            media = 0;
            soma = 0;
            mult = 0;
            System.out.println("Informe o primeiro valor:");
            n1 = rec.nextInt();
            System.out.println("Informe o segundo valor:");
            n2 = rec.nextInt();
            System.out.println("Informe o Terceiro valor:");
            n3 = rec.nextInt();
                if((n1 < n2) && (n2 < n3)){
                    soma = n1 + n2 + n3;
                    mult = (n1 * n2 * n3);
                    media = ((soma) / 3);
                    System.out.printf("A soma dos numeros é:% d\n", soma);
                    System.out.printf("A Multiplicação dos numeros é:% d\n", mult);
                    System.out.printf("A media dos numeros é:% .1f\n", media);
            }
            
        }while((n1 <= n2) || (n2 <= n3));
    }
    
}
