
package ex3;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
         Scanner grava = new Scanner(System.in);
         
         System.out.println("Quantos KM você gastou em sua viagem ?");
         
         double dist = grava.nextDouble();
         
         double litros = dist/12;
         
         System.out.println("Você gastou em sua viagem " + litros + " litros");
         
         
    }
    
}
