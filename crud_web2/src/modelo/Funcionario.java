package modelo;

public class Funcionario {
	
	private String nome;
	private double salario;
	
	private Departamento lotacao;
	
	public Funcionario() { }

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamento getLotacao() {
		return lotacao;
	}

	public void setLotacao(Departamento lotacao) {
		this.lotacao = lotacao;
	}
}
