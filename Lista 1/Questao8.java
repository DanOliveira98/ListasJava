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
public class Questao8 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("INFORME OS TRES VALORES: ");
        n1=rec.nextInt();
        n2=rec.nextInt();
        n3=rec.nextInt();
        int soma = (n1 + n2 + n3);
        int mult = (n1 * n2 * n3);
        int media = (int) (n1 + n2 + n3) /3;
        System.out.println("A SOMA DOS NUMEROS É: " + soma);
        System.out.println("O PRODUTO DOS NUMEROS É: " + mult);
        System.out.println("A MEDIA DOS NUMEROS É: " + media);
    }
}
