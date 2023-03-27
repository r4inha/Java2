package aula_04;

import java.util.Scanner;

public class Exercicio1 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

        int numero;
        int vetorInteiros[] = { 4, 5, 7, 6, 10, 1, 3, 2, 9, 8 };
        boolean numeroEncontrado = false;

        System.out.print("Digite um número: ");
        numero = leia.nextInt();

        for (int contador = 0; contador < vetorInteiros.length; contador ++) {
            if (vetorInteiros[contador] == numero) {
                System.out.print("O Número " + numero + " está na posição: " + contador);
                numeroEncontrado = true;
            }

        }

        if (numeroEncontrado == false) {
            System.out.print("Este número não foi encontrado!");
        }

        leia.close();
    }

}
