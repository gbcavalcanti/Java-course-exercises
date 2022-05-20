import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("what is the dollar price?");
		Double dollarPrice = sc.nextDouble();
		
		System.out.print("how many dollars will you bought?");
		Double dollarQuantity = sc.nextDouble();
		
		Double reais = CurrencyConverter.dolarConversion(dollarPrice, dollarQuantity);
	
		
		System.out.printf("Amount to pay in reais = %.2f", reais);
		
		sc.close();

	}

}
