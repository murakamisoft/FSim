package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Town {
	private List<House> houseList;

	public Town() {
		houseList = new ArrayList<House>();
	}

	public void createHouseList() {
		House house1 = new House(230, 6);
		House house2 = new House(200, 6);
		House house3 = new House(250, 6);
		House house4 = new House(500, 8);
		House house5 = new House(350, 6);
		House house6 = new House(350, 6);
		House house7 = new House(350, 6);
		this.houseList.add(house1);
		this.houseList.add(house2);
		this.houseList.add(house3);
		this.houseList.add(house4);
		this.houseList.add(house5);
		this.houseList.add(house6);
		this.houseList.add(house7);
	}

	public House getHouse() {
		int i = makeRnd();
		// System.out.println("i：" + i);
		return this.houseList.get(i);
	}

	private int makeRnd() {

		// Randomクラスのインスタンス化
		Random rnd = new Random();

		int ran = rnd.nextInt(7);
		return ran;
	}
}
