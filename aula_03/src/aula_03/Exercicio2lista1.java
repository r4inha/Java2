package aula_03;

import java.util.Scanner;

public class Exercicio2lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int n, impar = 0, par = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "° número: ");
			n = leia.nextInt();

			if ((n % 2) == 0)
				par++;
			else if ((n % 2) != 0)
				impar++;
		}

		System.out.println("Números pares: " + par);
		System.out.println("Números impares: " + impar);	       
	}

}
