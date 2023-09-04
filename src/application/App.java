package application;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
	
		//Conversão de números em formato String para armazenar em Double utilizando virgula
		DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.getDefault()));//Objeto usado para configuração regiona padrao que pode ter virgula como separador
		String s = JOptionPane.showInputDialog("Digite o valor");
		Double d = Double.parseDouble(s.replace(",", "."));
		
		String g = df.format(d);
		
		// Valor formatado
		System.out.println(g);
		
		decimalParaBinario(10);
		
		
		
		

	}

	private static void decimalParaBinario(int num) {
		
		
		if(num > 0) {
			decimalParaBinario(num / 2);
			System.out.println(num % 2);
		}
		
	}
	
	
}
