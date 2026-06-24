package whileDoWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Criando o scanner
		Scanner ler = new Scanner(System.in);
				
		int i = 0;
		String nome;
				
		System.out.println("Digite o seu nome: ");
		nome = ler.next();
				
		while(i < 10) {
			i++;
			System.out.println(nome);
		}
				
		ler.close();

	}

}
