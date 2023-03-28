package aula_07;

public class Vendedor extends Funcionarioex02 {
	
	String area;

	public Vendedor(String nome, int idade, String departamento, String funcao, float salario, String area) {
		super(nome, idade, departamento, funcao, salario);
		this.area = area;	
		
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
		
	}
	
	public void visualizar( ) {
		super.visualizar();
		System.out.println("Area: " + this.area);
		System.out.println("***********************************");
	
	}	

	}
