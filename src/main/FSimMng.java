package main;

public class FSimMng {

	private Investor murakami;

	public FSimMng(Investor murakami) {

		this.murakami = murakami;
	}

	public void execute() {

		FBuyer fBuyer = new FBuyer(murakami.getHousePrice());

		for (int i = 0; i < murakami.getShowVal(); i++) {

			System.out.println(getPrintStr(i));

			murakami.addPool();

			fBuyer.handPool(murakami.getPool());

			if (fBuyer.isBuy()) {
				murakami.addHouse();
				murakami.payHouseMoney();
				System.out.println("***");
			}

		}

	}

	private String getPrintStr(int i) {

		DateMng dateMng = new DateMng();
		StringBuffer buf = null;

		buf = new StringBuffer();

		buf.append(murakami.getAddAge(i));
		buf.append("\t");

		buf.append(dateMng.getAddDate(i));
		buf.append("\t");

		buf.append("貯金総額：");
		buf.append(murakami.getPool());
		buf.append("\t");

		buf.append("貯金月額：");
		buf.append(murakami.getPoolMonth());
		buf.append("\t");

		buf.append("キャッシュフロー：");
		buf.append(murakami.getCachFlow());
		buf.append("\t");

		buf.append("所有物件数：");
		buf.append(murakami.getHouseVal());
		buf.append("\t");

		buf.append("総資産金額：");
		buf.append(murakami.getAllAssets());
		buf.append("\t");

		return buf.toString();
	}

}
