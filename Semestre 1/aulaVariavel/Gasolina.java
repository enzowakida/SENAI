package aulaVariavel;
import java.util.Scanner;

public class Gasolina {

	public static void main(String[] args) {
		// Variáveis:
		double consumo, km, qtotal, ctotal, gaso;
		
		// Instaciar a classe Scanner:
		Scanner ler = new Scanner(System.in);
		
		// Entrada de dados:
		System.out.println("Informe a distância total percorrida (em km): ");
		km = ler.nextDouble();
		
		System.out.println("Informe o preço da gasolina: ");
		gaso = ler.nextDouble();
		
		System.out.println("Informe o consumo médio do seu veículo: ");
		consumo = ler.nextDouble();
		
		qtotal = km / consumo;
		ctotal = gaso * qtotal;
		
		System.out.println("Quantidade total de litros gastos no trajeto: " + qtotal);
		System.out.println("Custo total com o combustível: " + ctotal);
		
		ler.close();

	}

}
