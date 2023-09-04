package application;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class App2 {

	public static void main(String[] args) {
		 double numeroDecimal = 0.625; // Substitua pelo número decimal que deseja converter

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

	        for (int i = 0; i < 32; i++) { // Defina um limite para evitar representações infinitas
	            parteFracionaria *= 2;
	            int bit = (int) parteFracionaria;
	            binario.append(bit);
	            parteFracionaria -= bit;
	        }

	        System.out.println("Número decimal " + numeroDecimal + " em binário: " + binario);
	    }

}
