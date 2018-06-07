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
public class Questao10 {
    public static void main(String Args[]){
      Scanner rec = new Scanner(System.in);  
      int raio;
      int diametro;
      float area;
      float circunferencia;
        System.out.println("Informe o valor do raio: ");
        raio = rec.nextInt();
        diametro = (2 * raio);
        area = (float) Math.pow( Math.PI , 2);
        circunferencia = (float) (2 * Math.PI * raio);
        System.out.println("O diametro é : " + diametro);
        System.out.printf("A area é: % .4f \n" ,area);
        System.out.printf("A circuferencia é: % .4f ", circunferencia);
    }
}
