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
public class questao4 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int v1 = rec.nextInt();
        System.out.println("Informe o segundo Valor:");
        int v2 = rec.nextInt();
        System.out.println("Informe o terceiro Valor:");
        int v3 = rec.nextInt();
        System.out.println("Informe se você quer os numeros em ordem crescente(1) ou decrescente(2)");
        int ordem = rec.nextInt();
        if(ordem==2){
            System.out.println("Orden decrescente!");
            if((v1>v2) && (v2>v3)){
                System.out.printf("% d% d% d",v1, v2, v3);
            }
            if((v1>v3) && (v3>v2)){
                System.out.printf("% d% d% d",v1, v3, v2);
            }
            if((v2>v1) && (v1>v3)){
                System.out.printf("%d% d% d",v2, v1, v3);
            }
            if((v2>v3) && (v3>v2)){
                System.out.printf("%d% d% d",v2, v3, v1);
            }
            if((v3>v1) && (v1>v2)){
                System.out.printf("%d% d% d",v3, v1, v2);
            }
            if((v3>v2) && (v2>v1)){
                System.out.printf("%d% d% d",v3,v2,v1);
            }
        }
        if(ordem==1){
            System.out.println("Ordem crescente!");
            if((v1>v2) && (v2>=v3)){
                System.out.printf("% d% d% d",v3, v2, v1);
            }
            if(((v2>v1)&& (v2>=v3) && (v1<=v3))){
                System.out.printf("%d% d% d",v1, v3, v2);
            }
            if((v2>v1) && (v2<=v3)){
                System.out.printf("%d% d% d",v1, v2, v3);
            }
            if((v2<v1) && (v1<v3)){
                System.out.printf("%d% d% d", v2, v1, v3);
            }
            if((v2<v3) && (v3<=v1)){
                System.out.printf("%d% d% d", v2, v3, v1);
            }
        }
    }
}
