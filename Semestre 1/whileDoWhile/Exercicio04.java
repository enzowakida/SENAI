package whileDoWhile;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int i = 0;
		int idade;
		int menor = 0;
		int maior = 0;
		
		// Criando o Scanner
		Scanner ler = new Scanner(System.in);
		
		do {
			i++;
			
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
			
			if (idade >= 18) {
				maior++;
			}
			else {
				menor++;
			}
			
		}while(i <= 20);
		
		System.out.println("Quantidade de maiores de idade: " + maior);
		System.out.println("Quantidade de menores de idade: " + menor);
		
		ler.close();
		

	}

}
