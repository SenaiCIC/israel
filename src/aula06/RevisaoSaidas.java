
package aula06;

import java.util.Locale;


public class RevisaoSaidas {
    public static void main(String[] args) {
          char sexo = 'f';
          int idade = 32;
          double saldo = 10.35784;
          String nome = "maria";
         System.out.println("bom dia!");
         System.out.println("boa tarde!");
         System.out.println("boa noite!");
         System.out.println("-------------------");
         System.out.println("saldo");
         System.out.printf("%.2f%n",saldo);
         System.out.printf("%.4f%n",saldo);
         
                 Locale.setDefault(Locale.US);
                 System.out.printf("%.2f%n",saldo);
                 System.out.println("------------------");
                 System.out.printf(nome);
    }
 
}
