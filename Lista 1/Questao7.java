/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author cliente
 */
import java.util.Scanner;
public class Questao7 {
    public static void main(String[] Args){
        Scanner rec = new Scanner(System.in);
       int n1, n2;
        System.out.println("Informe o valor dos dois numeros: ");
        n1 = rec.nextInt();
        n2 = rec.nextInt();
        
        if(n1>n2){
            System.out.printf("IS LARGER % d ", n1);
        } 
        else if(n2>n1){
            System.out.printf("IS LARGER % d ", n2);
        }
        else if(n1==n2){
            System.out.println("THESE NUMBER ARE EQUAL");
        }
    }
}
