package aula5;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.ano = 1998;
		livro.nome = "Esta��o Carandiru";
		livro.author = "Drauzio Varella";
		livro.codLivro = 87;
		livro.descricao = "Livro bibliogr�fico referente ao presidio Carandiru";
		livro.edicao = "4";
		livro.isbn = "456.45";
		livro.valor = 50;
		
		livro.exibirCadastro();

	}

}
