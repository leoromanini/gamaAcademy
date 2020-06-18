package aula1;
import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		double litros, distancia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida:");
		distancia = entrada.nextDouble();
		
		System.out.println("Digite o total de combustível gasto (litros):");
		litros = entrada.nextDouble();
		
		System.out.println("Sua média é de: " +(distancia/litros)+" Km/L");
		
		entrada.close();
	}

}
