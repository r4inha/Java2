package aula_02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

        int na, nb, nc, resultado;

        System.out.println("\nEntre com o número A: ");
        na = leia.nextInt();
        System.out.println("\nEntre com o número B: ");
        nb = leia.nextInt();
        System.out.println("\nEntre com o número C: ");
        nc = leia.nextInt();
        
       resultado = (na + nb);
       System.out.println("O resultado de A+B é: " + resultado);
       
       if (resultado > nc)
    	  System.out.println("\nNúmero A e B é maior que C.");
       else if (resultado < nc)
          System.out.println("\nNúmero A e B é menor que C.");
       else if (resultado == nc)
    	   System.out.println("\nNúmero A e B é igual a C. ");
           

        leia.close();

	}

}
