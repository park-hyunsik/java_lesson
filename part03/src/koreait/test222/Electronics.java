package koreait.test222;

// �ۼ��� : �ڻ���
public class Electronics extends Product {
	
	private double kwh;
	
	public Electronics() {
	}
	
	public Electronics(int price, String prdName) {
		this.price = price;
		this.prdName = prdName;
	}
	
	@Override
	public String sell(Object obj) {
		return String.format("���� ��ǰ - %s (1set)", obj);
	}

	public double getKwh() {
		return kwh;
	}
	
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	public double power() {
		return kwh * 24;
	}

	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
