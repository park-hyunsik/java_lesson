package koreait.test1;

public class Car extends Product{
//���� �ۼ��� ��
	private int speed;
	
	public Car(int price,String prdName, int speed) {
		this.price=price;
		this.prdName=prdName;
		this.speed=speed;
		
	}
	@Override
	public String sell(Object obj) {
		return String.format("�߰� ���� ��� - %d %% ����", obj);
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
