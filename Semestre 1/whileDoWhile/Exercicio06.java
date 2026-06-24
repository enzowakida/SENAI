package whileDoWhile;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// Variáveis
		int i = 1;
		int v;
		String nome;
		
		// Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um nome: ");
		nome = ler.next();
		
		System.out.println("Digite um valor: ");
		v = ler.nextInt();
		
		while(i <= v) {
			System.out.println(nome);
			i++;
		}
		
		ler.close();
		
		

	}

}
