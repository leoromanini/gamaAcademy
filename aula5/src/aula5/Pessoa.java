package aula5;

public class Pessoa {
	String nome;
	String endereco;
	String cpf;
	String telefone;
	int numeroRegistro;
	
	void mostrarDetalhe() {
		System.out.printf("Codigo: %d\nNome: %s\nEndere�o: %s\nCPF: %s\nTelefone: %s\n",
				numeroRegistro, nome, endereco, cpf, telefone);
	}
	
}
