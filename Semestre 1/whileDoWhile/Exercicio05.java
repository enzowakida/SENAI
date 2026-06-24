package whileDoWhile;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		int n;
		int soma = 0;
		int i = 1;
		
		Scanner ler = new Scanner(System.in);
		
		while(i <= 10) {
			System.out.println("Digite um valor: ");
			n = ler.nextInt();
			
			soma += n;
			
			i++;
		}
		
		System.out.println(soma);
		
		ler.close();

	}

}
