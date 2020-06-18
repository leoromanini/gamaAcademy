package aula2;

import javax.swing.JOptionPane;

public class exemplo1 {

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Teste"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Teste"));
		JOptionPane.showMessageDialog(null, "Soma: " + (a + b));

		System.out.println();
	}

}
