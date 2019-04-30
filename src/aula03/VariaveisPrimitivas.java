
package aula03;


public class VariaveisPrimitivas {
    public static void main (String [] args ) {
          String nome = "Israel" ;
          int idade = (15);
          boolean escolha = true;                                   //t  f      
          char sexo = 'M';                                  //Caractere
          char letra = '\u0041';                           //codigo unicode
          byte n1 = 126;                                  //Numero     
          int n2 = 1000;                                 //Inteiro
          long n4 = 160903050404L;                      //Inteiro maiores
          float n5 = 25.80f;                           //Decimais
          double n6 = 25.51;                          //Decimais duplo          
          
          
          System.out.println(escolha);
          System.out.println(sexo);
          System.out.println(letra);
          System.out.println(n1);
          System.out.println(n2);
          System.out.println(n4);
          System.out.println(n5);
          System.out.println(n6);
          System.out.println("==================");
          System.out.printf("%.2f%n",n5);
          System.out.printf("%.5f%n",n6);  
          System.out.println("Israel");
          System.out.printf("%s tem %d anos%n",nome,idade); 
          }
    
    
    
}