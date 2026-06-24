package utilizandoVetor;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um valor para o vetor A, classificação: " + i + "..:");
			a[i] = ler.nextInt();
			
			System.out.println("Digite um valor para o vetor B, classificação: " + i + "..:");
			b[i] = ler.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			c[i] = a[i];
			
		}
		for(int i = 0; i < 5; i++) {
			c[i+5] = b[i];
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(c[i] + " ");
		}
		
		ler.close();
		
	}

}
