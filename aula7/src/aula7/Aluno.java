package aula7;

public class Aluno {
	private String ra;
	private String nome;
	private String curso;
	private double valorMensalidade;
	private double nota1;
	private double nota2;

	public void exibirDadosAlunos() {
		System.out.println("Aluno [ra=" + ra + ", nome=" + nome + ", curso=" + curso + ", valorMensalidade=" + valorMensalidade
				+ ", nota1=" + nota1 + ", nota2=" + nota2 + "]");
	}
	
	public double calcularMedia() {
		return (nota1 + nota2)/2;
	}


	public String getRa() {
		return ra;
	}


	public void setRa(String ra) {
		this.ra = ra;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public double getValorMensalidade() {
		return valorMensalidade;
	}


	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}


	public double getNota1() {
		return nota1;
	}


	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}


	public double getNota2() {
		return nota2;
	}


	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	

	
}
