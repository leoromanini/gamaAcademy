package aula3;
import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		double n1, n2;
		
		for (int i=0; i<15; i++) {
			System.out.println("Digite o nome do aluno: ");
			nome = input.nextLine();
			System.out.println("Digite as duas notas:");
			n1 = input.nextDouble();
			n2 = input.nextDouble();
			System.out.printf("Nome: %s\nNota 1: %.2f\nNota 2: %.2f\nMédia: %.2f\n", nome, n1, n2, (n1+n2)/2);
			input.nextLine();
		}
		
		input.close();

	}

}
