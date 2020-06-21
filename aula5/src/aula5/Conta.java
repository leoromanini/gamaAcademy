package aula5;

public class Conta {
	int numeroConta;
	String nome;
	int agencia;
	double saldo;
	
	void extrato() {
		System.out.printf("Agência: %d\nConta: %d\nNome: %s\nSaldo: %.2f",
				agencia, numeroConta, nome, saldo);
	}
}
