package koreait.test2;


//1������ ����� Ŭ������ Ȱ���Ͽ� ���ø����̼��� �ۼ��մϴ�.
//������ : ������
public class ProductTest {

	public static void main(String[] args) {
		//13
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "��õ��", 15);
		cart[1] = new Electronics(35000, "USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg�����");
		
		//14

				System.out.println(cart[7]);
		
		
		//15
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
		//16
	
				System.out.println(cart[0]);
				System.out.println(cart[3]);
	}

}


