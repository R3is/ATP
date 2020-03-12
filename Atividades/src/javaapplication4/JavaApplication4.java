/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author 1229165
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado01,areaQ;
    double areaC, raio, total;
    
     Scanner ent= new Scanner(System.in);
     
       System.out.println("Digite um numero inteiro para o lado do quadrado:");
       lado01= ent.nextInt();
       
       areaQ= lado01*lado01;
       raio= lado01/2;
       areaC= Math.PI*Math.pow(raio,2);
       total= areaQ-areaC;
       System.out.println("A  area do quadrado é:"+ areaQ);
       System.out.println("A area da circunferencia é:"+ areaC);
       System.out.println("A area externa é:"+total);
       
    }
    
}
