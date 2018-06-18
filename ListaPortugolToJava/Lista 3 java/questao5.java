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
public class questao5 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int x;
        int somap = 0;
        int somai = 0;
        do{
            System.out.println("Informe o valor");
            x = rec.nextInt();
            if(x<1000){
                if(x % 2 == 0){
                    somap = somap + x;
                }
                else if(!(x % 2 == 0)){
                    somai = somai + x;
                }
            }
        }while(x <1000);
        System.out.printf("A soma dos numeros impares é:% d \n",somai);
        System.out.printf("A soma dos numeros impares é:% d",somap);
    }
    
}
