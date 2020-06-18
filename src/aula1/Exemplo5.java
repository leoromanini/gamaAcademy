package aula1;
import java.util.Scanner;

public class Exemplo5 {
	public static void main(String[] args){
		String nome, sobrenome;
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = entrada.next();
		
		System.out.println("Digite o sobrenome: ");
		sobrenome = entrada.next();
		
		System.out.println("Digite a idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Nome: "+ nome + " Sobrenome: "+ sobrenome +" Idade:"+idade);
		
		entrada.close();
			
	}
}
