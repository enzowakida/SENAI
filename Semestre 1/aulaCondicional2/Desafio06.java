package aulaCondicional2;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {
		// Variáveis
		double saldo = 2534.62, total;
		double saldouser;
		int cpf = 1234567890;
		int senha = 123456;
		int senhauser;
		int cpfuser;

		// Adicionando uma biblioteca
		Scanner ler = new Scanner(System.in);

		// Recebimento de dados
		System.out.println("Seja bem-vindo ao Banco Santader. Adicione suas informações para o login");
		System.out.println("Digite seu CPF: ");
		cpfuser = ler.nextInt();

		if (cpfuser == cpf) {
			System.out.println("CPF correto!");
			System.out.println("Digite sua senha: ");
			senhauser = ler.nextInt();

			if (senhauser == senha) {
				System.out.println("Senha correta!");
				System.out.println(saldo);
				System.out.println("Digite o valor que você gostaria de retirar (R$): ");
				saldouser = ler.nextDouble();

				if (saldo >= saldouser) {
					total = saldo - saldouser;
					System.out.println("Saldo retirado com sucesso! Você possui: " + total);
				} else {
					System.out.println("O saldo não pode ser retirado. Você não possui o seguinte valor");
				}
			} else {
				System.out.println("Senha incorreta! Insira uma senha válida");
			}

		} else {
			System.out.println("CPF incorreto! Insira um CPF que seja válido");
		}

		ler.close();

	}

}
