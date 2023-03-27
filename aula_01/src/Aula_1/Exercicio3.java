package Aula_1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

        float salariobruto, adicionalnoturno, horasextras, descontos;


        System.out.print("Digite o Salário Bruto: ");
        salariobruto = leia.nextFloat();

        System.out.print("Digite o Adicional Noturno: ");
        adicionalnoturno = leia.nextFloat();

        System.out.print("Digite as Horas Extras: ");
        horasextras = leia.nextFloat();

        System.out.print("Digite os Descontos: ");
        descontos = leia.nextFloat();


        System.out.println("Salário Líquido: " + (salariobruto + adicionalnoturno + (horasextras *5) - descontos));

        leia.close();


	}

}
