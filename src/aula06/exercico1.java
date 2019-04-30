
package aula06;


public class exercico1 {
    public static void main(String[] args) {
        String produto1= "computador";
        String produto2= "mesa";
        int idade= 30;
        int codigo= 3200;
        char sexo= 'f';
        double preco1= 2100.0;
        double preco2= 650.50;
        double medida= 53.234567;
        
        System.out.println("produtos:");
        System.out.println(produto1+" com preco de"+preco1);
        System.out.println(produto2+" com preco de"+preco2);
        System.out.println("idade:"+idade+"anos,codigo"+codigo+"sexo"+sexo );
        System.out.printf("%.8f%n",medida);
        System.out.printf("%.4f%n",medida);
        
    }
  
}
