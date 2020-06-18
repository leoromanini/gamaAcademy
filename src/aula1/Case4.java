package aula1;
import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {
		double dolar, valorDolar;
		
		valorDolar = 5.11;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor em U$:");
		dolar = entrada.nextDouble();
		
		System.out.println("Valor convertido em R$ é de:"+dolar*valorDolar);

		entrada.close();

	}

}
