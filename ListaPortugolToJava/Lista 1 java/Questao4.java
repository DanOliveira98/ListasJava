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
public class questao4 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        int A;
        int B;
        int C;
        System.out.println("Informe o Valor de A");
        A = rec.nextInt();
        System.out.println("Informe o Valor de B");
        B = rec.nextInt();
        C = A;
        A = B;
        B = C;
        System.out.printf("O valor de A agora é:%d\n", A);
        System.out.printf("O valor de B agora é:%d\n", B);
        
    }
    
}
