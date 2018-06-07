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
public class Questao9 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int n1, n2;
        System.out.println("INFORME OS DOIS VALORES INTEIROS: ");
        n1 = rec.nextInt();
        n2 = rec.nextInt();
        if(n1 % n2 == 0){
            System.out.printf("Este numero % d é multiplo do outro numero % d", n1, n2);
        } else{
            System.out.printf("Este numero % d não é multiplo do outro numero % d ", n1, n2);
        }
    }
}
