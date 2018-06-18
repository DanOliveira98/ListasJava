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
public  class questao2 {
    public static void main(String Args[]){
        Scanner ler = new Scanner(System.in);
    int tempc;
    int tempF;
    System.out.println("Informe a Temperatura em Graus Centigrados");
    tempc = ler.nextInt();
    tempF = 9* (tempc + 160) /5;
    System.out.printf("A Temperatura em Fahrenheit é:%d", tempF);
    
    
    
    
    
}
}
