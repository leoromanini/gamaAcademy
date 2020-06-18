package aula2;
import java.util.Scanner;

public class Exemplo7 {

	public static void main(String[] args) {
		int opcao;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o estado civil: ");
		opcao = input.nextInt();
		
		if (opcao == 1) {
			System.out.println("Solteiro");
		}else if(opcao == 2) {
			System.out.println("Casado");
		}else if(opcao == 3) {
			System.out.println("Outros");
		}else {
			System.out.println("Erro: Opção inválida!");
		}

		input.close();
	}

}