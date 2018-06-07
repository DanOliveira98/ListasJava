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
public class Questao1 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        float aluguel = 550;
        float desconto;
        double porcentagem = 0.1;
         double pag = 0;
         int x = 0;
         float valor = 0; 
         float valor3 = 0;
         float valor2 = 0;
         float valor4 = 0;
         float valor5 = 0;
        System.out.println("Informe o valor do desconto");
        desconto = rec.nextFloat();
             do{
             x++;
             
             if(x == 1){
                valor = (float) (aluguel * 12);
             }
             else if(x==2){
                 aluguel = 605;
                  valor2 = (float) (aluguel * 12);
                 
             }
             else if(x==3){
                 aluguel = (float) 665.5;
                  valor3 = (float) (aluguel * 12);
             }
             else if(x==4){
                 aluguel = (float) 732.05;
                  valor4 = (float) (aluguel * 12);
             }
        }while( x != 4);
             pag = (valor + valor2 + valor3 + valor4 + valor5);
            System.out.printf("O valor a ser pago é: % .2f ", pag);   
}
}