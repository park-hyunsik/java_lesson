package koreait.test2;


//������ : ������

//3
public abstract class Product {	

	//2
	protected int price;
	protected String prdName;	//1
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract String sell(Object obj); //3
}

