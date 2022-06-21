package koreait.test2;


//시험자 : 박현식

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

