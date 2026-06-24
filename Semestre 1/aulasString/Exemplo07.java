package aulasString;

public class Exemplo07 {

	public static void main(String[] args) {
		String espacos = " espaços ";
		String tiraEspacos = espacos.trim();
		
		System.out.println("Com espaços:" + espacos + ", no final também");
		System.out.println("Sem espaços:" + tiraEspacos + ", no final também");
	}

}
