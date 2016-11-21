package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Investor implements Serializable {

	private static final long serialVersionUID = -8825710898900855672L;

	private int showVal;
	private int pool;
	private int poolMonth;
	private int cachFlow;
	private List<House> haveHouseList;
	private int age;
	private int fPrice;
	private Town town;

	public Investor(int showVal, int pool, int fPrice, int poolMonth, int cashFlow, int age) {
		this.showVal = showVal;
		this.pool = pool;
		this.poolMonth = poolMonth;
		this.cachFlow = cashFlow;
		this.fPrice = fPrice;
		this.haveHouseList = new ArrayList<House>();
		this.setAge(age);
		this.town = new Town();
		this.town.createHouseList();
	}

	public int getShowVal() {
		return showVal;
	}

	public void setShowVal(int showVal) {
		this.showVal = showVal;
	}

	public int getPool() {
		return pool;
	}

	public void setPool(int pool) {
		this.pool = pool;
	}

	public int getPoolMonth() {
		return poolMonth;
	}

	public void setPoolMonth(int poolMonth) {
		this.poolMonth = poolMonth;
	}

	public int getCachFlow() {
		return cachFlow;
	}

	public void setCachFlow(int cachFlow) {
		this.cachFlow = cachFlow;
	}

	public void addPool() {
		this.pool += poolMonth;
	}

	public int getHousePrice() {
		return this.fPrice;
	}

	public void addHouse() {
		House house = this.town.getHouse();
		this.haveHouseList.add(house);
		this.cachFlow += house.getCashFlow();
		this.poolMonth += house.getCashFlow();
	}

	public void payHouseMoney() {
		this.pool -= getLastBuyHousePrice();
	}

	private int getLastBuyHousePrice() {
		int last = this.haveHouseList.size() - 1;
		return this.haveHouseList.get(last).getPrice();
	}

	public int getHouseVal() {
		return this.haveHouseList.size();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddAge(int i) {
		int m = i / 12;
		int age = m + this.age;
		return Integer.toString(age);
	}

	public String getAllAssets() {

		int r = getHouseListPrice() + this.pool;
		return Integer.toString(r);
	}

	private int getHouseListPrice() {
		int p = 0;
		for (House house : this.haveHouseList) {
			p += house.getPrice();
		}
		return p;
	}

}
