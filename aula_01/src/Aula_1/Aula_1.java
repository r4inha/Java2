package Aula_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula_1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		Scanner leia = new Scanner (System.in);
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite o nome: ");
		nome= leia.nextLine();
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		   System.out.println("Soma: " + df.format((numero1 + numero2)));
	        System.out.println("Subtração: " + df.format((numero1 - numero2)));
	        System.out.println("Multiplicação: " + df.format((numero1 * numero2)));
	        System.out.println("Divisão: " + df.format((numero1 / numero2)));
	        System.out.println("Potência: " + df.format(Math.pow(numero1, numero2)));
	        System.out.println("Potência: " + df.format(Math.pow(numero1, numero2)));

	        System.out.println("Nome: " + nome);

	        leia.close();
	    }
	}