/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author 1229165
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d01, d02, diagonal,perimetro,area;
        
        
         Scanner ent= new Scanner (System.in); 
    
         System.out.println("Digite a primeira dimensão");
         d01= ent.nextDouble();
    
        System.out.println("Digite a segunda dimensão");
        d02= ent.nextDouble();


        perimetro = (d01+d02)*2;
        area= d01*d02;
        diagonal= Math.sqrt(Math.pow(d01,2)+Math.pow(d02,2));

        System.out.println(" A medida do perimetro é:"+ perimetro);
        System.out.println("A medida da area é:" + area);
        System.out.println("Digite a segunda dimensão é:" +diagonal);
    
           
    
   

    
   
    }
    
}
