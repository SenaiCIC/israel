
package aula06;

import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = sc.next ();
        System.out.println("digite sua idade: ");
        int idade= sc.nextInt ();
        System.out.println("digite seu peso: ");
        double peso= sc.nextDouble();
        System.out.println("digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("seu nome e "+nome+"sua idade "+idade+"seu peso "+peso+"e sua altura "+altura);
        double res = peso/(altura*altura);
        System.out.println("e seu imc é "+res);
        
        
    }
 
}
