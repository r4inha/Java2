package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Plansaude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n=== Plano de saúde === ");
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=0 && idade <=17)
		{
			System.out.println("\nO valor do plano é R$100.");
		}
		
		else if(idade >=18 && idade <=39)
		{
			System.out.println("\nO valor do plano é R$300.");
		}
		
		else if(idade >=40 && idade <=65)
		{
			System.out.println("\nO valor do plano é R$650.");
		}
		
		else if(idade >=66 && idade <=100)
		{
			System.out.println("\nO valor do plano é R$1000.");
		}
		
		else
		{
			System.out.println("\nIdade não compatível com nenhuma das categorias.");
		}
	}
}	
