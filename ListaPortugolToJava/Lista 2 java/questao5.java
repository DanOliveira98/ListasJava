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
public class questao5 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe os três valores:");
        int n1 = rec.nextInt();
        int n2 = rec.nextInt();
        int n3 = rec.nextInt();
        System.out.println("1.Calculo da Media");
        System.out.println("2.Calculo da Soma");
        System.out.println("3.Calculo da Multiplicação");
        int opcao = rec.nextInt();
        if(opcao == 1){
            float media = (n1 + n2 + n3) / 3;
            System.out.printf("A media dos valores é:% f  ", media);
        }
        if(opcao == 2){
            int soma = (n1 + n2 + n3);
            System.out.printf("A soma dos valores é:% d  ", soma);
        }
        if(opcao == 3){
            int mult = (n1 * n2 * n3); 
            System.out.printf("O calculo da Multiplicação é:% d  ", mult);
        }
    }
    
}
