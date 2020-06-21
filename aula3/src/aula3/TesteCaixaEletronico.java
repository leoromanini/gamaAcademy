package aula3;
import java.util.Scanner;

public class TesteCaixaEletronico {

	public static void main(String[] args) {
		
		//Efetua a inst�ncia das classes que ser�o utilizadas
		Scanner input = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Conta conta = new Conta();
		
		//Exibe o menu inicial
		Menu.exibirMenuInicial();
		
		//Efetua a leitura das entradas iniciais
		System.out.print("Nome:");
		cliente.setNome(input.next());
		System.out.print("Conta: ");
		conta.setNumero(input.nextInt());
		System.out.print("Valor inicial: ");
		conta.setSaldo(input.nextDouble());
		
		//Exibe o menu e trata a op��o escolhida
		int opcao = 0;
		while (opcao != 4) {
			Menu.exibirMenuOpcoes();

			opcao = input.nextInt();
			if (opcao == 1) {
				conta.verExtrato(cliente.nome);
			} else if (opcao == 2) {
				System.out.println("Digite o valor do saque desejado: ");
				conta.efetuarSaque(input.nextDouble());
				conta.verExtrato(cliente.nome);
			} else if (opcao == 3) {
				System.out.println("Digite o valor do deposito desejado: ");
				conta.efetuarDeposito(input.nextDouble());
				conta.verExtrato(cliente.nome);
			} else if (opcao == 4) {
				System.out.println("ENCERRANDO SISTEMA");
			} else {
				System.out.println("OP��O INV�LIDA!");
			}
		}
		input.close();
	}

}
