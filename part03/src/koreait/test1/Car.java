package koreait.test1;

public class Car extends Product{
//새로 작성한 것
	private int speed;
	
	public Car(int price,String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
		
	}
	@Override
	public String sell(Object obj) {
		return String.format("추가 할인 행사 - %d %% 인하", obj);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "Car [price=" + price + ", prdName=" + prdName + ", speed=" + speed + "]";
	}

}
