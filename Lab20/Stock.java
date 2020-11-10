public class Stock {
	public String symbol;
	public String name;
	public double previousClosingPrice;
	public double currentPrice;
	Stock(String symbol , String name){
		this.symbol = symbol;
		this.name = name;
	}
	public double getChangePercent(){
		return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
	}
}
