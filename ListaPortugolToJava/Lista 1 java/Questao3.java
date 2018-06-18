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
public class questao3 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
       int alt; 
       double vol; 
       int raio; 
       System.out.println("Informe a altura da lata de oleo em cm:");
       alt = ler.nextInt();
       System.out.println("Informe o raio da lata de oleo em cm:");
       raio = ler.nextInt();
       vol = (Math.PI * Math.pow(raio,2) * alt);
        System.out.printf("O volume da lata é:%.2f", vol);
    }
}
