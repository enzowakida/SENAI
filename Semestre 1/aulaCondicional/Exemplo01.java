package aulaCondicional;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o número: ");
		numero = ler.nextInt();
		
		if (numero > 10) 
		{
			System.out.println("O número é maior que 10");
		}
		else
		{
			System.out.println("O número é menor que 10");
		}
		ler.close();
		

	}

}
