package aula1;
import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		double litros, distancia;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a dist�ncia percorrida:");
		distancia = entrada.nextDouble();
		
		System.out.println("Digite o total de combust�vel gasto (litros):");
		litros = entrada.nextDouble();
		
		System.out.println("Sua m�dia � de: " +(distancia/litros)+" Km/L");
		
		entrada.close();
	}

}
