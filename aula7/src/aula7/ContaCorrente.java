package aula7;

public class ContaCorrente {
	private String nome;
	private String senha;
	private double saldo;
	
	public void cadastrarSenha(String senha) {
		this.senha = senha;
	}
	
	public void alterarSenha(String senhaAntiga, String senhaNova) {
		if (senhaAntiga.equals(this.senha)){
			this.senha = senhaNova;
		}
		
	}
	
	public void efetuarDebito(String senha, double valorDebito) {
		if (senha.equals(this.senha)) {
			this.saldo += valorDebito;
		}
	}
	
	public void efetuarCredito(String senha, double valorCredito) {
		if (senha.equals(this.senha)) {
			this.saldo -= valorCredito;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}


	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [nome=" + nome + ", saldo=" + saldo + "]";
	}
	
}
