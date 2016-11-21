package main;

public class Main {

	public static void main(String[] args) {

		int showVal = 12 * 70;
		int pool = 200;
		int fPrice = 500;
		int poolMonth = 10;
		int cashFlow = 0;
		int age = 33;

		SettingInfo settingInfo = new SettingInfo(showVal, pool, fPrice, poolMonth, cashFlow, age);

		FSimMng fSimMng = new FSimMng(settingInfo);
		fSimMng.execute();
	}

}
