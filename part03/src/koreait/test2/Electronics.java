package koreait.test2;

//������ : ������

class Electronics extends Product{
	//8	
	private double kwh;
	
	//9
	Electronics(){
		Electronics tv = new Electronics(); 
		System.out.println(tv.sell("�����"));
		
		
	}
	Electronics(int price,String prdName) {
		this.price=price;
		this.prdName=prdName;
	}
	//5
	@Override
	public String sell(Object obj) {
		return String.format("������ǰ -%(1set)", obj);
	}
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	//11
	public void power() {
		System.out.println( kwh );  
	}
	
	
	//12
	@Override
	public String toString() {
		return "Electronics [price=" + price + ", prdName=" + prdName + "]";
	}



	}

