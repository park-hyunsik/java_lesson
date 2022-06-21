package koreait.test2;


//1번에서 설계된 클래스를 활용하여 애플리케이션을 작성합니다.
//시험자 : 박현식
public class ProductTest {

	public static void main(String[] args) {
		//13
		Product[] cart = new Product[10];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[1] = new Electronics(35000, "USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg냉장고");
		
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


