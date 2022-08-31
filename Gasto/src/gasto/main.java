package gasto;

import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        
        Scanner grava = new Scanner(System.in);
        
        System.out.println("Quanto tempo sua viagem durou?");
        double temp = grava.nextDouble();
        
        System.out.println("Quantos KM foram percorridos?");
        double KM = grava.nextDouble();
        
        double litros = KM/temp;
        System.out.println("Seu carro faz " + litros + "l por KM ");
         
        
        
        
        
        
        
                
          

    }
    
}
