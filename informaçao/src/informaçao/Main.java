
package informaçao;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        System.out.println("Qual sua idade?");
        double idade = grava.nextDouble();
        
        double dias = idade * 365;
        double horas = dias * 24;
        
        System.out.println("Você viveu " + dias + " dias");
        System.out.println("Você viveu " + horas + " horas");
        
        
        
        
    }
    
}
