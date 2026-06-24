package aulaVariavel;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// Variáveis:
		double celsius, fahrenheit;

		// Instaciar a biblioteca:
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite um valor em Fahrenheit (°F): ");
		fahrenheit = ler.nextDouble();

		celsius = ((fahrenheit - 32) * 5) / 9;

		System.out.println(celsius);

		ler.close();

	}

}
