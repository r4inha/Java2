package aula_02;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int codigo_prod, quantidade;
        float v1 = 10, v2 = 15, v3 = 18, v4 = 12, v5 = 8, v6 = 6;
        
        
        System.out.println("Código do Produto\t Produto \t Preço Unitário");
        System.out.println("1\t\t\t Hot dog \t\t R$" + v1);
        System.out.println("2\t\t\t X-salada \t\t R$" + v2);
        System.out.println("3\t\t\t X-bacon \t\t R$" + v3);
        System.out.println("4\t\t\t Bauru \t\t\t R$" + v4);
        System.out.println("5\t\t\t Refrigerante \t\t R$" + v5);
        System.out.println("6\t\t\t Suco \t\t\t R$" + v6);
        
        System.out.println("\nDigite o código do produto: ");
        codigo_prod = leia.nextInt();
        
        if (codigo_prod > 6)
        	System.out.println("Código inválido");
        else
            System.out.println("Digite a quantidade: ");
        quantidade = leia.nextInt();
        
        switch(codigo_prod) {
        case 1:
            System.out.println("\n=== Valor Total:R$ " + v1* quantidade + " ===");
        break;
        
        case 2:
            System.out.println("\nValor Total:R$ " + v2* quantidade);
        break;
       
        case 3:
            System.out.println("\nValor Total:R$ " + v3* quantidade);
        break;
        
        case 4:
            System.out.println("\nValor Total:R$ " + v4* quantidade);
        break;
        
        case 5:
            System.out.println("\nValor Total:R$ " + v5* quantidade);
        break;
        
        case 6:
            System.out.println("\nValor Total:R$ " + v6* quantidade);
        break;
        
        
        
        }
        
	}

}


//FIM 