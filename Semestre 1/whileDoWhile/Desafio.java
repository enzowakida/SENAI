package whileDoWhile;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);

        char[] gabarito = {'A','B','C','D','E','E','D','C','B','A'};

        int totalAlunos = 0;
        int somaNotas = 0;

        String continuar;

        do {
            int acertos = 0;

            System.out.println("Responda as 10 questões (A, B, C, D ou E):");

            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                char resposta = ler.next().toUpperCase().charAt(0);

                if (resposta == gabarito[i]) {
                    acertos++;
                }
            }

            int nota = acertos; 

            System.out.println("Total de acertos: " + acertos);
            System.out.println("Nota: " + nota);

            totalAlunos++;
            somaNotas += nota;

            System.out.print("Outro aluno vai utilizar o sistema? (Sim/Não): ");
            continuar = ler.next().toUpperCase();

        } while (continuar.equals("S"));

        double media = (double) somaNotas / totalAlunos;

        System.out.println("\nRESULTADOS FINAIS:");
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média das notas: " + media);

        ler.close();
    }
}