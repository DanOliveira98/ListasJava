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
public class Questao2 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        float velocidade = 20;
        float tempo;
        float dist;
        System.out.println("Infome a distancia em que você quer saber:");
         dist = rec.nextInt();
         if((dist > 12) || (dist < 0)){
             System.out.println("Informe um valo acima de 0 e abaixo de 12:");
            dist = rec.nextInt();
         }
         tempo =  ((dist / velocidade) * 60);
            System.out.printf("O tempo que a onda levara para chegar a tal distancia é: % .0f minutos", tempo );

}
}