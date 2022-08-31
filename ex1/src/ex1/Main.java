
package ex1;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        System.out.println("Digite o valor");
        int a = grava.nextInt();
        
        System.out.println("Digite o valor");
        int b = grava.nextInt();
        
        System.out.println("Digite o valor");
        int c = grava.nextInt();
        
        double res = ((a+b+c)*10)/2;
        System.out.println(res);
    }
    
}
