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
public class Questao3 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        Integer num;
        System.out.println("Digite o numero inteiro:");
        num = rec.nextInt();
        if(num > 99){
        String s = num.toString();
        String f = "";
        for(int i = s.length(); i > 0; i--){
            f += s.substring(i-1, i);
        }
        System.out.println("numero invertido é:" + f);
    }
        else{
            System.out.println("SEU VALOR NÃO TEM 3 DIGITOS!");
        }
}
}