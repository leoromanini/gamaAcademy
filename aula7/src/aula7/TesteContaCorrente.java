package aula7;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.setNome("Leonardo");
		conta.cadastrarSenha("123456");
		
		conta.alterarSenha("123456", "abcde");
		
		conta.efetuarDebito("abcde", 15000);
		conta.efetuarCredito("abcde", 2000);
		
		System.out.println(conta.toString());

	}

}
