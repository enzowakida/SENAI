package aulaCondicional2;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {
		// Variáveis
		int n1;
		int n2;
		int n3;
		
		// Adicionando uma biblioteca
		Scanner ler = new Scanner(System.in);
		
		// Recebimento de dados
		System.out.println("Digite o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		n3 = ler.nextInt();
		
		// Finalização
		if (n1 > n2 && n1 > n3) {
			System.out.println("O primeiro valor é maior do que os outros");
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O segundo valor é maior do que os outros");
		}
		else if (n3 > n1 && n3 > n2) {
			System.out.println("O terceiro valor é maior do que os outros");
		}
		else {
			System.out.println("Os valores são todos iguais");
		}
		ler.close();
	}
}
