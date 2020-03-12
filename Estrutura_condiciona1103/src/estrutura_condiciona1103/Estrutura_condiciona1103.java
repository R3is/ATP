/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_condiciona1103;

import java.util.Scanner;

/**
 *
 * @author 1229165
 */
public class Estrutura_condiciona1103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ordenar 5 números//
        
    int n1,n2,n3,n4,n5,aux;
    Scanner ent= new Scanner (System.in);
    System.out.println("Digite o primeiro número");
         n1= ent.nextInt();
    
    System.out.println("Digite o segundo número");
    n2= ent.nextInt();
    
    System.out.println("Digite o terceiro número");
    n3= ent.nextInt();
    
    System.out.println("Digite o quarto número");
    n4= ent.nextInt();
    
    System.out.println("Digite  o quinto número");
    n5= ent.nextInt();
    
    if (n1>n2) {
        aux= n1;
        n1= n2;
        n2= aux;
    }    
    if (n1>n3){
        aux=n1;
        n1=n3;
        n3=aux;
    }            
    if (n1>n4){
        aux=n1;
        n1=n4;
        n4=aux;
    }    
    if (n1>n5){
        aux=n1;
        n1=n5;
        n5=aux;
    }    
    if (n2>n3){
        aux=n2;
        n2=n3;
        n3=aux;
    }    
    if (n2>n4){
        aux=n2;
        n2=n4;
        n4=aux;
    }    
    if (n2>n5){
        aux=n2;
        n2=n5;
        n5=aux;
      
    }    
    if (n3>n4){
        aux=n3;
        n3=n4;
        n4=aux;
    }   
    if(n3>n5){
        aux=n3;
        n3=n1;
        n5=aux;
    }   
    if (n4>n5){
        aux=n4;
        n4=n5;
        n5=aux;
    }    
        
   

 System.out.println(n1+" " + n2+ " "+ n3+ " " +n4+" "+ n5); 
}       
