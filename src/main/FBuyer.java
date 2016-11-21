package main;

public class FBuyer {

	private int money;
	private int fPrice;

	public FBuyer(int fPrice) {
		this.fPrice = fPrice;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getfPrice() {
		return fPrice;
	}

	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}

	public void handPool(int money) {
		this.money = money;
	}

	public boolean isBuy() {
		return money > fPrice;
	}

}
