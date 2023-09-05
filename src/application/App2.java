package application;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número decimal fracionário: ");
	        double numeroDecimal = scanner.nextDouble();

	        // Parte inteira (conversão usando divisão sucessiva)
	        int parteInteira = (int) numeroDecimal;
	        StringBuilder binario = new StringBuilder();

	        while (parteInteira > 0) {
	            int resto = parteInteira % 2;
	            binario.insert(0, resto);
	            parteInteira /= 2;
	        }

	        // Parte fracionária (conversão multiplicando por 2)
	        binario.append(","); // Adiciona o ponto decimal
	        double parteFracionaria = numeroDecimal - (int) numeroDecimal;

	        while (parteFracionaria > 0) {
	            if (binario.length() > 32) {
	                break; // Limite de representação fracionária alcançado
	            }

	            parteFracionaria *= 2;
	            int bit = (int) parteFracionaria;
	            binario.append(bit);
	            parteFracionaria -= bit;
	        }

	        System.out.println("Número decimal " + numeroDecimal + " em binário: " + binario);

	        scanner.close();
	    }

}
