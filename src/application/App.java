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
		double intNum = Double.parseDouble(s);//Conversão para tipo double
		
		StringBuilder builder = new StringBuilder();/*O StringBuilder em Java é uma classe que representa uma sequência mutável de caracteres (uma string mutável). Ela é utilizada para criar e manipular strings de forma eficiente quando há muitas operações de concatenação ou modificação de strings, pois evita a criação excessiva de objetos de string temporários, o que pode ser ineficiente em termos de desempenho e uso de memória.*/
		
		if(intNum < 0) { // Metodo para adcionar o sinal positivo e negativo na conversão
			builder.append("1"); // Adcionar 1 para positivo
			intNum = -intNum; // Torna positivo para conversão
		}else {
			builder.append("0");// Adcionar 0 para positivo
		}
		
		
		//Metodo int Decimal para conversao usando divisao
		
		int intDecimal = (int) intNum;//Casting é uma forma de atribuir com base em uma convrsão forçada do tipo de valor que voce quer que imprima no programa
		
		if(intDecimal == 0) {
			builder.append("0"); // Adicionar zero ao string builder caso o inteiroDecimal for zero
		}else {
			while(intDecimal > 0) {
				int resto = intDecimal % 2;
				builder.insert(1, resto); // Insere o valor do resto
				intDecimal /= 2;
			}
		}
		
		
		
		builder.append(","); //Adiciona virgula no console
		
		double doubleFracionario = intNum - (int) intNum; //Conversao pra decima fracionario, onde ele faz subtração para pegar só a parte fracionaria
		
		 while (doubleFracionario > 0) { // Enquanto parte fracionaria for maior que 0
	          
	            doubleFracionario *= 2; // Conversao para parte fracionaria multiplicando o valor por 2
	            int bit = (int) doubleFracionario; // Conversao para o Inteiro pegando apena 0 e 1
	            builder.append(bit); // Adiciona o digito inteiro apos a conversao
	            doubleFracionario -= bit; // Removemos como subtração a parte tratada
	        }
		
		//String g = df.format(d);
		
		// Valor formatado
		 JOptionPane.showMessageDialog(null,"Numero Decimal Fracionario: " + intNum + "\nConversão para binário: " + builder);
		System.out.println(intNum+ " - " + builder);
		
		
		
		
		

	}

	
	
	
}
