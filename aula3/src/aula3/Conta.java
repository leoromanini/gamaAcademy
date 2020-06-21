package aula3;
import java.util.Scanner;

public class Conta {
	int numero;
	int saquesRealizados;
	double saldo;
	double saldoDevedor;
	
	public void efetuarSaque(double valorSaque) {
		if (valorSaque<=this.saldo) {
			this.saldo -= valorSaque;
			exibirSucessoSaque();
		}else {
			efetuarEmprestimo();
		}
	}
	
	public void exibirSucessoSaque() {
		System.out.println("OPERAÇÃO REALIZADA COM SUCESSO!");
	}
	
	public void efetuarEmprestimo() {
		Scanner input = new Scanner(System.in);
		System.out.println("Saldo Insuficiente! Deseja efetuar um emprestimo? [S/N]");
		if ("S".equals(input.next())){
			System.out.println("Digite o valor que deseja emprestar: (Será cobrado 11% de Juros)");
			double emprestimo = input.nextDouble();
			this.saldoDevedor += emprestimo + (emprestimo*0.11);
			this.saldo += emprestimo;
			System.out.println("EMPRESTIMO REALIZADO COM SUCESSO!");
		}
		
	}
	
	public void efetuarDeposito(double valorDeposito) {
		if (this.saldoDevedor > 0 && valorDeposito>=this.saldoDevedor) {
			System.out.printf("Saldo devedor de R$ %.2f - Deseja descontar do valor depositado? [S/N]\n", this.saldoDevedor);
			Scanner input = new Scanner(System.in);
			if ("S".equals(input.next())){
				this.saldo += valorDeposito-this.saldoDevedor;
				if (this.saldoDevedor>=valorDeposito) {
					this.saldoDevedor -= valorDeposito;
				}else {
					this.saldoDevedor = 0;
				}
			}else {
				this.saldo += valorDeposito;
			}
		}else {
			this.saldo += valorDeposito;
		}
		
	}
	
	public void verExtrato(String nome) {
		System.out.printf("EXTRATO\nNome: %s\nConta: %d\nSaldo atual: %.2f\nSaques hoje: %d\nSaldo devedor: %.2f",
				nome, this.numero, this.saldo, this.saquesRealizados, this.saldoDevedor);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getSaquesRealizados() {
		return saquesRealizados;
	}
	public void setSaquesRealizados(int saquesRealizados) {
		this.saquesRealizados = saquesRealizados;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
