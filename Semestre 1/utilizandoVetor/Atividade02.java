package utilizandoVetor;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int soma = 0;
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor: " + i + "..:");
			a[i] = ler.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			soma += a[i]++;
		}
		if(soma >= 30) {
			System.out.println(soma);
		}
		else {
			System.out.println("A soma é menor que 30");
		}
		ler.close();

	}

}
