package aulaCondicional2;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {
		// Variáveis
		int m1;
		int m2;
		int m3;
		
		// Adicionando uma biblioteca
		Scanner ler = new Scanner(System.in);
		
		// Recebimento de dados
		System.out.println("Digite a primeira medida: ");
		m1 = ler.nextInt();
		
		System.out.println("Digite a segunda medida: ");
		m2 = ler.nextInt();
		
		System.out.println("Digite a terceira medida: ");
		m3 = ler.nextInt();
		
		// Cálculo 
		if (m1 == m2 && m1 == m3 && m2 == m3) {
			System.out.println("O triângulo é equilátero");
		}
		else if (m2 == m3 && m2 != m1 && m1 != m3) {
			System.out.println("O triângulo é isósceles");
		}
		else if (m1 == m2 && m1 != m3 && m2 != m3) {
			System.out.println("O triângulo é isósceles");
		}
		else if (m1 == m3 && m1 != m2 && m2 != m3) {
			System.out.println("O triângulo é isósceles");
		}
		else {
			System.out.println("O triângulo é escaleno");
		}
		ler.close();

	}

}
