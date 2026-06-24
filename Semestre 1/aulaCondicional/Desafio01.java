package aulaCondicional;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		// Variáveis
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		
		// Importando o Scanner
		Scanner ler = new Scanner(System.in);
		
		// Recebimento dos dados
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextInt();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextInt();
		
		// Cálculo das notas
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Resultado
		if (media >= 6) {
			System.out.println("Aprovado " + media);
		}
		else {
			System.out.println("Reprovado " + media);
		}
		ler.close();

	}

}
