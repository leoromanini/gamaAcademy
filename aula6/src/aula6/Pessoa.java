package aula6;

public class Pessoa {
	String nome;
	int idade;
	char sexo;
	String faixa;
	
	public void imprimir() {
		System.out.println("=============================");
		System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\nFaixa: %s\n",
				nome, idade, sexo, this.classificar());
		System.out.println("=============================");
	}
	
	public String classificar() {
		if (idade<0) {
			return ("Erro");
		} else if (idade > 0 && idade <= 2) {
			return ("Bebê");
		} else if (idade > 2 && idade <= 11) {
			return ("Criança");
		} else if (idade > 11 && idade <= 19) {
			return ("Adolescente");
		} else if (idade > 19 && idade <= 30) {
			return ("Jovem");
		} else if (idade > 30 && idade <= 60) {
			return ("Adulto");
		} else {
			return ("Idoso");
		}
	}
}
