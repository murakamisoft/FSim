package main;

public class House {

	private int price;
	private int cashFlow;

	public House(int price, int cashFlow) {
		this.price = price;
		this.cashFlow = cashFlow;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(int cashFlow) {
		this.cashFlow = cashFlow;
	}

}
