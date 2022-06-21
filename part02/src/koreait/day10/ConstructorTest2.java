package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {

		
		
	}

}

class Product2 {
	int price;
	
	//부모클래스 디폴트 생성자 정의해서 자식클래스가
	//사용할수 있도록 합니다.
	
	public Product2() {
	}
	public Product2(int price) {
		this.price=price;
	}
}
class Food2 extends Product2{		//Product() 디폴트 생성자 실행 하므로 없으면 오류-> Food() 디폴트 생성자 실행
// 부모클래스 Product2 디폴트 생성자 super()가 호출.
// 그 안에서 부모클래스 Food2 디폴트 생성자  super()가 호출. 

}
class Electronics2 extends Product2{
	public Electronics2(int price) {
		super(price);	
		//부모클래스 커스텀 생성자 실행
	}

}
