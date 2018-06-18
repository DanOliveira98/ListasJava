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
public class questao8 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int x;
        int num_c;
        int y;
        System.out.println("Informe a quantidade de numeros impares e pares na qual você quer saber:");
        num_c = rec.nextInt();
        int controle = 0;
        for(x = 1; x<=1111; x++){
            if(x % 2 == 0){
                System.out.printf("%d ",x);
                controle = (controle + 1);
            }
                if(controle == num_c){
                break;
        }       
        }
        System.out.printf(" Estes são os % d numeros pares\n", num_c);
        controle = 0;
        for(x = 1; x<=1111; x++){
            if(x % 2 != 0){
                System.out.printf("%d ",x);
                controle = (controle + 1);
            }
                if(controle == num_c){
                break;
        }
            
        }
    System.out.printf(" Estes são os % d numeros impares", num_c);
}
}