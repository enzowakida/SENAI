package estruturaCase;

import java.util.Scanner;

public class CalculoBissexto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um ano: ");
		int ano = ler.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano inserido é bissexto");
		}
		else {
			System.out.println("O ano inserido não é bissexto");
		}

		ler.close();
		
	}

}
