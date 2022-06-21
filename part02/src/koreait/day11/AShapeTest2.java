package koreait.day11;

import koreait.day09a.Animal;

public class AShapeTest2 {

	//익명클래스 : anonymous. 이름이 없는 클래스
	public static void main(String[] args) {

		//마름모꼴
		//익명 내부(Inner) 클래스 정의 1허회용 클래스
		AShape sha = new AShape() {
			//추상메소드 재정의
			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return width+height;
			}
		
		};
		AShape sha2 = new AShape() {
			@Override
			public double getArea() {
				return width+height;
			}
		
		};
		System.out.println("sha 넓이 = " + sha.getArea());
		System.out.println("sha2 넓이 = " + sha2.getArea());
		
		//질문 : 추상클래스 아닐때도 메소드 재정의해서 쓰면 익명클래스처럼 쓸수 있죠?
		//확인하기	//답 : 가능하다. 그러나 보통은 추상메소드 재정의하면 익명클래스 많이 씁니다.
		
		Animal snake = new Animal() {
			
			int length;

			@Override
			public void act() {
				setName("이구아니");
				setColor("얼룩이");
				length = 3;
				System.out.println("action : 기어다니기 ");
				
			}
			
			@Override
			public String toString() {
				return "length=" + length ;
				}
				
		};
		
		
		snake.act();
		System.out.println(snake);
		
	}
}