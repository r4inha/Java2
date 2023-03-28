package aula_07;

public class TestaCliente {

	public static void main(String[] args) {
		
		Clienteex01 tc = new Clienteex01 ("Andresa" , 26, "Feminino" , "Rio de Janeiro" , "(21 96719-5996");
        tc.visualizar();

        Clienteex01  tc1 = new Clienteex01 ("Jamile" , 18, "Feminino" , "Rio de Janeiro" , "(21 95734-5959");
        tc1.visualizar();

        PessoaFisica pf = new PessoaFisica ("Andresa" , 26, "Feminino" , "Rio de Janeiro" , "(21) 96719-5996" , "960.568.432-93");
        pf.visualizar();


        PessoaFisica pf1 = new PessoaFisica ("Jamile" , 18, "Feminino" , "Rio de Janeiro" , "(21 95734-5959" , "890.456.321-98");
        pf1.visualizar();

        PessoaJuridica pj = new PessoaJuridica ("Douglas" , 31, "Masculino" , "Rio de Janeiro" , "(21) 9895-6498" , "96.366.589./0001-59");
        pj.visualizar();

        PessoaJuridica pj1 = new PessoaJuridica ("Onassis" , 54, "Masculino" , "Rio de Janeiro" , "(21) 9425-7536" , "65.657.523./0001-64");
        pj1.visualizar();

	}

}