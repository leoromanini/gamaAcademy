package aula2;
import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor1, valor2;
		int opcao=0;
		
		System.out.println("Digite dois numeros n�mero");
		valor1 = input.nextDouble();
		valor2 = input.nextDouble();
		
		System.out.println("|================================|");
		System.out.println("|   Calculadora Banco Cris S.A   |");
		System.out.println("|             Menu               |");
		System.out.println("| 1 - Somar                      |");
		System.out.println("| 2 - Subtrair                   |");
		System.out.println("| 3 - Multiplicar                |");
		System.out.println("| 4 - Dividir                    |");
		System.out.println("|================================|");
		
		opcao = input.nextInt();
		
		if (opcao==1) {
			System.out.printf("Soma: %.2f", valor1+valor2);
		}else if (opcao==2) {
			System.out.printf("Subtra��o: %.2f", valor1-valor2);
		}else if (opcao==3) {
			System.out.printf("Multiplica��o: %.2f", valor1*valor2);
		}else if (opcao==4) {
			if (valor2 != 0) {
				System.out.printf("Divis�o: %.2f", valor1/valor2);
			}else {
				System.out.println("N�o � poss�vel efetuar divis�o por 0!");
			}
		}else {
			System.out.println("Op��o inv�lida!");
		}
		
		input.close();
		
	}

}
