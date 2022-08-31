
package calc1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = grava.next();
        
        System.out.println("Digite seu peso:");
        double peso = grava.nextDouble();
        
        System.out.println("Digite sua altura:");
        double altura = grava.nextDouble();
        
        double imc = peso / (altura*altura);
        
        System.out.println(nome + " seu IMC é " + imc);
              
    }
    
}
