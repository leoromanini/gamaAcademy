package aula2;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
		int n1, n2, menor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros diferentes:");
		n1 = input.nextInt();
		n2 = input.nextInt();
		
		menor = (n1 < n2) ? n1 : n2;
		
		System.out.printf("O menor valor � %d", menor);
		
		input.close();

	}

}
