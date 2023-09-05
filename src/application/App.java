package application;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
	
		//Conversão de números em formato String para armazenar em Double utilizando virgula
		DecimalFormat df = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.getDefault()));//Objeto usado para configuração regiona padrao que pode ter virgula como separador
		
		String s = JOptionPane.showInputDialog("Digite o valor decimal fracionario");
		double doubleNum = Double.parseDouble(s);//Conversão para tipo double
		
		Integer intNum = (int) doubleNum;// Usando Conversão para tipo inteiro
		StringBuilder builder = new StringBuilder();/*O StringBuilder em Java é uma classe que representa uma sequência mutável de caracteres (uma string mutável). Ela é utilizada para criar e manipular strings de forma eficiente quando há muitas operações de concatenação ou modificação de strings, pois evita a criação excessiva de objetos de string temporários, o que pode ser ineficiente em termos de desempenho e uso de memória.*/
		
		while(intNum > 0) {
			int resto = intNum % 2;
			builder.insert(0, resto);
			intNum /= 2;
		}
		
		String g = df.format(d);
		
		// Valor formatado
		System.out.println(g);
		
		
		
		
		

	}

	private static void decimalParaBinario(int num) {
		
		
		if(num > 0) {
			decimalParaBinario(num / 2);
			System.out.println(num % 2);
		}
		
	}
	
	
}
