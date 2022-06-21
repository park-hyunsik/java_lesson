package koreait.test1;

public class ProductTest {

	public static void main(String[] args) {
		//h
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "»ïÃµ¸®", 15);
		
		//i
		for(Product temp : cart)
			if(temp!=null && temp.price >= 100000)
				System.out.println(temp);
		
	}

}


