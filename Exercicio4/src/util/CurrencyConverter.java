package util;

public class CurrencyConverter {
	public static final Double IOF = 6.00;
	
	public static double dolarConversion(Double dollarPrice, Double dollarQuantity) {
		return ((dollarPrice * IOF/100)+dollarPrice)*dollarQuantity;
	}
	
}
