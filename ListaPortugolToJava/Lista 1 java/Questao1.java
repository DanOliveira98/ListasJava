/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/**
 *
 * @author Usúario
 */
import java.util.Scanner;
public class questao1 {
    public static void main(String args[]){
   Scanner ler = new Scanner(System.in); 
   int n1;
   int n2;
   float media;
   int soma;
   int diferenca;
   int mult;
   System.out.println("Informe o primeiro numero:");
   n1 = (int) ler.nextFloat();
   System.out.println("Informe o segundo numero:");
   n2 = (int) ler.nextFloat();
   soma = n1 + n2;
   diferenca = n1 - n2;
   mult = n1 * n2;
   media = (n1 + n2) / 2;
   System.out.printf("A soma dos numeros é:%d\n", soma);
   System.out.printf("A diferença dos numeros é numero:%d\n", diferenca);
   System.out.printf("O produto dos numeros é:%d\n", mult);
   System.out.println("A media dos numeros é:" + media);
   
   
   
   
}
}
    