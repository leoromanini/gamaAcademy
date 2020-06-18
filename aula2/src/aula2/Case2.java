package aula2;
import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		double saldo = 25480.50;
		double valorSaque, valorSalario=5000;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor desejado para o saque:");
		
		valorSaque = input.nextDouble();
		
		if (valorSaque>saldo) {
			System.out.println("Saldo insuficiente!");
			System.out.printf("Empréstimo disponível: R$ %.2f", valorSalario*0.05);
		}else {
			System.out.printf("Saque realizado com sucesso! Saldo atualizado: %.2f %n", saldo-valorSaque);
		}
		
		input.close();
		

	}

}
