package aulasString;

public class Exemplo08 {

	public static void main(String[] args) {
		String fruta1 = "Abacaxi";
		String fruta2 = "Banana";
		
		int comparacao = fruta1.compareTo(fruta2);
		/*<0 : Abacaxi vem antes
		== 0 : Frutas iguais 
		 >0  : Banana vem antes */
		
		System.out.println(comparacao);
	}

}
