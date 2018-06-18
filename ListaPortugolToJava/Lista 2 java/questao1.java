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
public class questao1 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o valor do Numero:");
        int n1 = rec.nextInt();
        if((n1 > 0) && (n1 % 2 == 0)){
            System.out.printf("este numero %d é positivo e impar", n1);
                    }
        if ((n1 >0) && (n1 % 2 != 0)){
            System.out.printf("este numero %d é positivo e impar", n1);
                    }
        if ((n1 <0) && (n1 % 2 == 0)){
            System.out.printf("este numero %d é negativo e par",n1);
                    }
        if((n1 <0) && (n1 % 2 != 0)){
            System.out.printf("este numero %d é negativo e impar", n1);
                    }
        if(n1==0){
            System.out.printf("O numero que você informou é %d Portanto ele é nulo", n1);
        }
    }
}
