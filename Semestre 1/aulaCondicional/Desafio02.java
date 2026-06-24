package aulaCondicional;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		// Variáveis
		int dia;
		
		// Importar o Scanner
		Scanner ler = new Scanner(System.in);
		
		// Recebimento de dados
		System.out.println("Digite o número de um dia da semana (1-7): ");
		dia = ler.nextInt();
		
		// Processamento
		if (dia == 1) {
			System.out.println("Domingo");
		}
		else if (dia == 2) {
			System.out.println("Segunda-feira");
		}
		else if (dia == 3) {
			System.out.println("Terça-feira");
		}
		else if (dia == 4) {
			System.out.println("Quarta-feira");
		}
		else if (dia == 5) {
			System.out.println("Quinta-feira");
		}
		else if (dia == 6) {
			System.out.println("Sexta-feira");
		}
		else if (dia == 7) {
			System.out.println("Sabado");
		}
		else {
			System.out.println("Não existe nenhum dia da semana com este número...");
		}
		ler.close();

	}

}
