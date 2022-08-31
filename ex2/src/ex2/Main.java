
package ex2;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        System.out.println("Digite um valor em reais");
        
        double valor = grava.nextDouble();
        
        double porc = valor*0.06;
        
        porc = (porc+10)/4;
        System.out.println(porc);
    }
    
}
