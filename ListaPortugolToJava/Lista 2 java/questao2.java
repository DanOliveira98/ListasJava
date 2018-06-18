/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Usúario
 */
import java.util.Scanner;
public class questao2 {
    public static void main(String Args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o primeiro lado do Triangulo");
        double ld1 = rec.nextDouble();
        System.out.println("Informe o segundo lado do Triangulo");
        double ld2 = rec.nextDouble();
        System.out.println("Informe o terceiro lado do Triangulo");
        double ld3 = rec.nextDouble();
        if((ld1 + ld2 > ld3) && (ld1 + ld3 > ld2) && (ld3 + ld2 > ld1)){
            System.out.println("pode formar um triangulo!");
            if(((ld2==ld3) || (ld3==ld1) || (ld2==ld1)) && ((ld1!=ld2) || (ld2!=ld3) || (ld1!=ld3))){
                System.out.println("este triangulo é isoceles!");
            }
            if((ld1!=ld2) && (ld1!=ld3) && (ld2!=ld3)){
                System.out.println("Este triangulo é escaleno!");
            }
            if((ld1==ld2) && (ld2==ld3)){
                System.out.println("Este Triangulo é Equilatero");
            }
        }
        else if(!((ld1 + ld2 > ld3) && (ld1 + ld3 > ld2) && (ld3 + ld2 > ld1))){
            System.out.println("Não pode formar um Triangulo!");
            }
    }
}
