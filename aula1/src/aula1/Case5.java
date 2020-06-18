package aula1;
import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		double valor;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do investimento:");
		valor = entrada.nextDouble();
		
		System.out.println("Valor após um mês na poupança é de: "+ (valor + valor*0.007));

		entrada.close();
	}

}
