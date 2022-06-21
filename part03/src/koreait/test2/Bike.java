package koreait.test2;

//시험자 : 박현식

public class Bike extends Product{
	//6
	private int speed;

	//7
	public Bike(){
		Bike bike = new Bike(); 
		System.out.println(bike.sell(20));

	}
	
	public Bike(int price,String prdName ,int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
	}
	
	//4
	@Override
	public String sell(Object obj) {
		return String.format("추가할인행사 - %d %% 20%인하", obj);

	}
	
	//6
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	//12
	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
		
	//10
	public void ride() {
		System.out.println("당신은 이것을 시속 "+ speed +" 로 탈수 있습니다."); 
//		return speed;
	}

}
