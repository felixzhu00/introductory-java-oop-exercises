public class TestStock {
	public static void main(String[] args) {
		Stock a = new Stock("ORCL", "Oracle Corporation");
		a.previousClosingPrice = 34.5;
		a.currentPrice = 34.35;
		
		System.out.println("Name: " + a.name);
		System.out.println("Symbol: " + a.symbol);
		System.out.println("Price-Change Percentage: " +a.getChangePercent());
	}
}