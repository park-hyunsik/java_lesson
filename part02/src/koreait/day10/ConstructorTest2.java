package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

		
		
	}

}

class Product2 {
	int price;
	
	//�θ�Ŭ���� ����Ʈ ������ �����ؼ� �ڽ�Ŭ������
	//����Ҽ� �ֵ��� �մϴ�.
	
	public Product2() {
	}
	public Product2(int price) {
		this.price=price;
	}
}
class Food2 extends Product2{		//Product() ����Ʈ ������ ���� �ϹǷ� ������ ����-> Food() ����Ʈ ������ ����
// �θ�Ŭ���� Product2 ����Ʈ ������ super()�� ȣ��.
// �� �ȿ��� �θ�Ŭ���� Food2 ����Ʈ ������  super()�� ȣ��. 

}
class Electronics2 extends Product2{
	public Electronics2(int price) {
		super(price);	
		//�θ�Ŭ���� Ŀ���� ������ ����
	}

}
