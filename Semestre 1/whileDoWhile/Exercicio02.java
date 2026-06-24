package whileDoWhile;

public class Exercicio02 {

	public static void main(String[] args) {
		int soma = 0;
		int i = 1;
		
		do {
			soma = soma + i;
			i++;
			System.out.println(soma);
		}while(i <= 15);
	}

}
