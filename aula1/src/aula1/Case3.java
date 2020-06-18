package aula1;
import java.util.Scanner;

public class Case3 {

	public static void main(String[] args) {
		String nome;
		double salario, totalVendas, totalSalario;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor:");
		nome = entrada.next();
		
		System.out.println("Digite o salario fixo:");
		salario = entrada.nextDouble();
		
		System.out.println("Digite o total de vendas:");
		totalVendas = entrada.nextDouble();
		
		totalSalario = salario + totalVendas*0.15;
		
		System.out.println("Nome: "+nome+"\n"+"Salário Fixo: "+salario+"\n"+"Total com comissão: "+totalSalario);
		
		entrada.close();

	}

}
