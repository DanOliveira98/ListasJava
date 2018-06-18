package Lista1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usúario
 */
import java.util.Scanner;
public class questao5 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o numero que você quer elevar ao quadrado");
        int n1 = rec.nextInt();
        double quad;
        quad = Math.pow(n1,2);
        System.out.printf("O quadrado do numero é %.0f\n", quad);
    }
  
}
