package aula3;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		double n1, n2, media;
		double somaMedia = 0;
		int count = 0;
		
		while(somaMedia<=40) {
			System.out.println("Digite o nome do aluno: ");
			nome = input.nextLine();
			System.out.println("Digite as duas notas:");
			n1 = input.nextDouble();
			n2 = input.nextDouble();
			media = (n1+n2)/2;
			System.out.printf("Nome: %s\nNota 1: %.2f\nNota 2: %.2f\nMédia: %.2f\n", nome, n1, n2, media);
			input.nextLine();
			somaMedia+=media;
			count++;
		}
		System.out.println("===================");
		System.out.printf("Media dos alunos é de: %.2f", somaMedia/count);
		
		input.close();

	}

}

