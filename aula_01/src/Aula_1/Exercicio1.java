package Aula_1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);

        float salario, abono;
        String nome;

        System.out.println("Digite o nome e sobrenome do funcionário: ");
        nome = leia.nextLine();

        System.out.println("Digite o salário: ");
        salario = leia.nextFloat();

        System.out.println("Digite o abono: ");
        abono = leia.nextFloat();

        System.out.println("Novo salário: " + (salario + abono));

		
	}

}
