package aula5;

public class Livro {
	String nome;
	String author;
	int codLivro;
	String descricao;
	String edicao;
	String isbn;
	int ano;
	double valor;
	
	void exibirCadastro() {
		System.out.println("=======================================");
		System.out.println("Cadastro Livro");
		System.out.println("Nome: "+nome);
		System.out.println("Author: "+author);
		System.out.println("Codigo: "+codLivro);
		System.out.println("Descricao: "+descricao);
		System.out.println("Edição: "+edicao);
		System.out.println("ISBN: "+isbn);
		System.out.println("Ano: "+ano);
		System.out.println("Valor: "+valor);
		System.out.println("=======================================");
	}
	
}
