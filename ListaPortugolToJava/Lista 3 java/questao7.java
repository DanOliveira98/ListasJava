/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

/**
 *
 * @author Usúario
 */
import java.util.Scanner;
public class questao7 {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        int na = 1;
        float mediama = 0;
        float mediame = 10;
        float media = 0;
        float mediac;
            System.out.printf("Informe a media do aluno numero % d :", na);
            mediac = rec.nextInt();
            na++;
        while(mediac > 0){
            System.out.printf("Informe a media do aluno numero % d :", na);
            mediac = rec.nextInt();
            if(mediac>=0){
                na++;
                media = (media + mediac);
                if(mediama<mediac){
                mediama = mediac;
                }
                if(mediame>mediac){
                mediame = mediac;
                }    
            }
            if(mediac< 0){
                na= (na - 2);
            }
        }
        media = (media/ na);
        System.out.printf("A maior media entre os alunos é:% .2f\n", mediama);
        System.out.printf("A menor media entre os alunos é:% .2f\n", mediame);
        System.out.printf("A media dos alunos é:% .2f\n", media);
    }
}
