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
public class Questao6 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        int n1,n2;
        int S,P,D;
        System.out.println("Digite os dois números:");
        n1=rec.nextInt();
        n2=rec.nextInt();
        S=n1+n2;
        P=n1*n2;
        D=n1-n2;
        float Q = (float)n1/n2;
        System.out.printf("Os números digitados foram: %d e %d, a soma dos dois dá %d, o produto dos dois dá: %d, A difença dá:%d ",n1,n2,S,P,D);
        System.out.printf("e a divisão é:%.2f",Q);
    }
}
