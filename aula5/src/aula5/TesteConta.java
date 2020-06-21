package aula5;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.agencia = 0001;
		conta.numeroConta = 202020;
		conta.nome = "Tony Stark";
		conta.saldo = 999999999.54;
		
		conta.extrato();

	}

}
