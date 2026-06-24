package aulasString;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		//Varíaveis:
		String texto;
		String msg = "Olá, mundo!";
		int carac;
		
		//Instaciar a biblioteca ler
		Scanner ler = new Scanner(System.in);
	
		//Recebimento dos dados:
		System.out.println("Digite uma frase (em formato string): ");
		texto = ler.nextLine();
		
		System.out.println("Digite a posição de um caractere da frase: ");
		carac = ler.nextInt();
		
		//Adicional:
		int tamanho = texto.length();
		char letra = texto.charAt(carac);
		
		//Finalização:
		System.out.println("O tamanho da frase é: " + tamanho);
		System.out.println("O caractere é: " + letra);
		
		if (texto.equals(msg))
		{
			System.out.println("As frases são iguais");
		}
		else 
		{
			System.out.println("As frases não são iguais");
		}
		
	}

}
