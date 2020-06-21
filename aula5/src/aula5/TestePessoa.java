package aula5;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Drauzio Varella";
		pessoa.cpf = "000.000.000-00";
		pessoa.endereco = "Rua XX. Brás - SP";
		pessoa.numeroRegistro = 1;
		pessoa.telefone = "(11) 00000-0000";
		
		pessoa.mostrarDetalhe();

	}

}
