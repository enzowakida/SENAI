package aulaCondicional2;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {
		// Varíaveis
		int numero;
		
		// Adicionando uma biblioteca
		Scanner ler = new Scanner(System.in);
		
		// Recebimento de dados
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		// Finalização
		if (numero % 2 != 0) {
			System.out.println("O número é ímpar");
		}
		else {
			System.out.println("O número é par");
		}
		ler.close();

	}

}
