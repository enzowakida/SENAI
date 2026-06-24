package estruturaCase;

import java.util.Scanner;

public class DesafioSwitchTernario {

	public static void main(String[] args) {
		// Biblioteca Scanner
		Scanner ler = new Scanner(System.in);
		
		double salario = 1621.00;
		int empresa;
		
		System.out.println("A quanto tempo você está na empresa (anos)? ");
		empresa = ler.nextInt();
		
		double bonus = empresa > 3 ? salario * 0.07 : salario * 0.05;
		
		double soma = bonus + salario;
		
		System.out.println("Seu salário somado com o bônus equivale a " + soma);
		
		ler.close();
	}

}
