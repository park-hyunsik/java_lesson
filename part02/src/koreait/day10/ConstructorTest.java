package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {

		
		
	}

}

class Product {
	int price;
	
	//����Ʈ �����ڴ� ������ ���մϴ�.
	
	public Product(int price) {
		this.price=price;
		
	}
	
}
class Food extends Product{		//Product() ����Ʈ ������ ���� �ϹǷ� ������ ����-> Food() ����Ʈ ������ ����
	//Product() ����Ʈ ������ �����ϹǷ� ������ ����
	//-> �ڽ�Ŭ������ Ŀ���һ����ڸ� �����ؼ� �θ�Ŭ����
	// Ŀ���һ����ڸ� ȣ��
	public Food(int price) {
		super(price);
	}
}
class Electronics extends Product{
//product() ����Ʈ ������ ����
	
	public Electronics(int price) {
		super(price);
// Product() ����Ʈ ������ ��ſ� Ŀ���� ������ ȣ��
	}

}
