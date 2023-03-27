package aula_07;

public class Funcionarioex02 {

    private String nome;
    private int idade;
    private String departamento;
    private String funcao;
    private float salario;

    public Funcionarioex02(String nome, int idade, String departamento, String funcao, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.departamento = departamento;
        this.funcao = funcao;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
        
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
}


    public int getIdade() {
    	return idade;
}


    public void setIdade(int idade) {
    	this.idade = idade;
}


    public String getDepartamento() {
    	return departamento;
}


    public void setDepartamento(String departamento) {
    	this.departamento = departamento;
}


    public String getFuncao() {
    	return funcao;
}


    public void setFuncao(String funcao) {
    	this.funcao = funcao;
}


    public float getSalario() {
    	return salario;
}


    public void setSalario(float salario) {
    	this.salario = salario;
}

    public void visualizar() {
    	System.out.println("Nome: " + this.nome);
    	System.out.println("Idade: " + this.idade);
    	System.out.println("Departamento: " + this.departamento);
    	System.out.println("Funcao: " + this.funcao);
    	System.out.println("Salario: " + this.salario);
}

}