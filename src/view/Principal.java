package view;

import javax.swing.JOptionPane;

import controller.Encontra;

public class Principal {

	public static void main(String[] args) {
		Encontra rec = new Encontra();
		
		int n1, n2;
		n1 = 1;
		n2 = -1;
		
		do {
			n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 10 e 999999: "));
		} while (n1 < 10 || n1 > 999999);
		
		do {
			n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero 0 e 9: "));
		} while (n2 < 0 || n2 > 9);
		
		int res = rec.pertence(n1, n2);
		
		System.out.println("O numero " + n2 + " aparece " + res + " vezes na sequencia " + n1);

	}

}