package aula_07;

public class Testafuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionarioex02 cf = new Funcionarioex02("Andresa" , 26, "COE" , "Engenheira de Software" , 5000.00f);
        cf.visualizar();

  
        Funcionarioex02 c1 = new Funcionarioex02("Heimy" , 19, "COE" , "Engenheira de Software" , 5000.00f);
       c1.visualizar();
       
       Gerente gt = new Gerente("Jamile" , 29 , "COE" , "Gerente de Projetos" , 9000.00f, "Gerência");
       gt.visualizar();
       
       Gerente gt1 = new Gerente("Bianca" , 39 , "COE" , "Gerente de Projetos" , 12000.00f, "Gerência");
       gt1.visualizar();
       
       Vendedor vd = new Vendedor("Gisele" , 29 , "Comercial" , "Vendedora" , 1000.00f, "Vendas");
       vd.visualizar();
       
       Vendedor vd1 = new Vendedor("Naiara" , 19 , "Comercial" , "Vendedora" , 1200.00f, "Vendas");
       vd1.visualizar();

	}

}
