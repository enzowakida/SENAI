package aulaJPA;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// Variáveis:
		String nome;
		int idade;

		// Instancia classe Scanner:
		Scanner ler = new Scanner(System.in);

		// Recebimento dos dados:
		System.out.println("Digite o seu nome: ");
		nome = ler.next();

		System.out.println("Digite a sua idade ");
		idade = ler.nextInt();

		// Saída:
		System.out.println("Olá, " + nome + " que possui " + idade + " anos");

	}

}
